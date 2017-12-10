package br.upe.summerweek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	private AccessDeniedHandler accessDeniedHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/css/**", "/img/**", "/js/**", "/scss/**", "/vendor/**", "/", "/index").permitAll()
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
				.antMatchers("/user/**").hasAnyRole("USER")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/", true)
				.permitAll()
				.and()
			.logout()
				.permitAll()
				.and()
			.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
		
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		// Wait for JPA integration
		
		auth.inMemoryAuthentication()
			.withUser("user@upe.br").password("{noop}upe123").roles("USER")
			.and()
			.withUser("admin@upe.br").password("{noop}upe123").roles("ADMIN");
		
	}
	
	
}
