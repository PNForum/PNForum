<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>PN Forum  : Register</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">       
    <!-- Main structure css file -->
    <link href="resources/css/register.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]--> 
  </head>
  <body>
   

   <div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-8 col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Sign Up</h3>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-12 separator">
                            <form role="form">
                    			<div class="form-group">
                    				<div class="input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                        <input type="text" class="form-control" placeholder="Username" required autofocus/>
                                    </div>
                    			</div>
                    			<div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
                                        <input type="email" name="email" id="email" class="form-control" placeholder="Email Address" tabindex="4">
                                    </div>
                    			</div>
                    			<div class="row">
                    				<div class="col-xs-12 col-sm-6 col-md-6">
                    					<div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                                <input type="password" class="form-control" placeholder="Password" required />
                                            </div>
                    					</div>
                    				</div>
                    				<div class="col-xs-12 col-sm-6 col-md-6">
                    					<div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                                <input type="password" class="form-control" name="password_confirmation" id="password_confirmation" placeholder="Confirm Password" tabindex="6" required />
                                            </div>
                    					</div>
                    				</div>
                    			</div>
                    			<div class="row">
                    				<div class="col-xs-4 col-sm-3 col-md-3">
                    					<span class="button-checkbox">
                    						<button type="button" class="btn" data-color="info" tabindex="7">I Agree</button>
                                            <input type="checkbox" name="t_and_c" id="t_and_c" class="hidden" value="1" />
                    					</span>
                    				</div>
                    				<div class="col-xs-8 col-sm-9 col-md-9">
                    					 By clicking <strong class="label label-primary">Register</strong>, you agree to the <a href="#" data-toggle="modal" data-target="#t_and_c_m">Terms and Conditions</a> set out by this site, including our Cookie Use.
                    				</div>
            			        </div>
                            </form>
                        </div>
                    </div>
                    <div class="panel-footer">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 separator">
                                <div class="col-xs-12 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                            	<div class="col-xs-12 col-md-6"><a href="#" class="btn btn-success btn-block btn-lg">Sign In</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
   <script src="resources/js/register.js"></script> 
    </body>
</html>