<html>
<head>
<title>facebookConnect</title>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
 content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"></link>
<link
 href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
 rel="stylesheet"></link>
<style type="text/css">
.omb_btn-facebook {
 background: #3b5998;
}
</style>
</head>
<body class="container">
 <div class="navbar bg-primary navbar-fixed-top">
  <div class="container">
   <div class="navbar-header">

    <a class="navbar-brand font-weight-bold">SpringSocialFacebook</a>
   </div>


  </div>

 </div>
 <br />
 <br />
 <h4>Connect to Facebook</h4>

 <form action="/connect/facebook" method="POST">
  <input type="hidden" name="scope" value="user_posts" />
  <div class="formInfo">
   <p>You aren't connected to Facebook yet. Click the button to
    connect this application with your Facebook account.</p>
  </div>
  <p>
   <!--    <button type="submit">Connect to Facebook</button> -->
   <div class="col-xs-4 col-sm-2"></form>
 
</body>
</html>