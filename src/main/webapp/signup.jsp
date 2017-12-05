<!DOCTYPE html>
<html lang="pt-br">

  <head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Semana de Verão UPE Caruaru</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/creative.min.css" rel="stylesheet">

    <link href="css/login.css" rel="stylesheet">

    <link rel="shortcut icon" href="img/favicon.png" />

  </head>

  <body id="page-top">

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <!-- <a class="navbar-brand js-scroll-trigger" href="#page-top">Semana de Verão UPE Caruaru</a> -->
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <li class="dropdown" style="list-style-type: none">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Login</b> <span class="caret"></span></a>
            <ul id="login-dp" class="dropdown-menu">
                <li>
                <div class="row">
                    <div class="col-md-12">
                    Login via
                    <div class="social-buttons">
                    <a href="#" class="btn btn-fb"><i class="fa fa-facebook"></i> <small>Facebook</small></a>
                    
                    </div>
                                ou
                    <form class="form" role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
                    <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail2">Email</label>
                    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="Email" required>
                    </div>
                    <div class="form-group">
                    <label class="sr-only" for="exampleInputPassword2">Senha</label>
                    <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Senha" required>
                                            <div class="help-block text-right"><a href="">Esqueceu a senha ?</a></div>
                    </div>
                    <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </div>
                    <div class="checkbox">
                    <label>
                    <input type="checkbox"> deixe-me logado
                    </label>
                    </div>
                </form>
                </div>
            <div class="bottom text-center">
                Novo aqui ? <a href="#"><b>Inscreva-se</b></a>
            </div>
        </div>
        </li>
      </ul>
    </li>
      </div>
    </nav>

    <div class="container pt-5 pb-5">
        <div class="row">
            <div class="col-md-6 offset-sm-3">
                <div class="card">
                    <div class="card-header pt-4">
                            <div class="row">
                                <div class="text-center offset-md-5">
                                    <a href="#" class="active" id="login-form-link">Cadastre-se</a>            
                                </div>
                            </div>
                            <hr>
                        </div>
                    <div class="card-body">
                        <div class="pb-3 offset-2">
                            <button style="background-color: #3b5998" type="button" class="btn btn-primary btn-lg">Cadastre-se com o Facebook</button>                            
                        </div>
                        <h5 class="text-center">ou</h5>
                        <div class="row pt-2">
                            <div class="col-lg-8 offset-lg-2">
                                <form id="register-form" role="form">
                                    <div class="form-group">
                                        <input  type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Nome">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Endereço de email">
                                    </div>
                                    <div class="form-group">
                                        <label>Data de Nascimento</label>
                                        <input class="form-control" type="date" value="2011-08-19" id="example-date-input">
                                    </div>
                                    <div class="form-group">
                                        <select id="inputState" class="form-control">
                                            <option selected>Feminino</option>
                                            <option>Masculino</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Senha" formControlName="password">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirmação de Senha">
                                    </div>
                                    <hr>
                                    <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-6 offset-sm-3">
                                        <!--<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Próximo">-->
                                            <button type="submit" class="form-control btn btn-register">Enviar</button>
                                        </div>
                                    </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <footer class="bg-dark text-white">
      <div class="container text-center">
        <small><br>UPE Caruaru, 2018. Todos os direitos reservados.<br><br></small>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/creative.min.js"></script>

  </body>

</html>
