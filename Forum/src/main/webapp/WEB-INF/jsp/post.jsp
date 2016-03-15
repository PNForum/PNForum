<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>PN Forum : Post</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/menu_admin.css" rel="stylesheet">
   	<script src="resources/js/jquery.js"></script>    
    <script src="resources/js/bootstrap.min.js"></script>
    <script src='resources/tinymce/js/tinymce/tinymce.min.js'></script>
</head>

<body>
	<div class="nav-side-menu">
    <div class="brand">POST</div>
    <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
  
        <div class="menu-list">
  
            <ul id="menu-content" class="menu-content collapse out">
                <li>
                  <a href="#">
                  <i class="fa fa-users fa-lg"></i> User name
                  </a>
                </li>

                <li  data-toggle="collapse" data-target="#products" class="collapsed active">
                  <a href="#"><i class="fa fa-gift fa-lg"></i> Tag & categories <span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="products">
                    <li class="active"><a href="#">CSS3 Animation</a></li>
                    <li><a href="#">Android</a></li>
                    <li><a href="#">Spring MVC</a></li>
                    <li><a href="#">Swing</a></li>
                    <li><a href="#">PHP core</a></li>
                    <li><a href="#">Cake PHP</a></li>
                    <li><a href="#">HTML/CSS/Java script</a></li>
                    <li><a href="#">Testing</a></li>
                    <li><a href="#">OOP</a></li>
                    <li><a href="#">C/C++</a></li>
                </ul>


                <li data-toggle="collapse" data-target="#service" class="collapsed">
                  <a href="#"><i class="fa fa-globe fa-lg"></i> Features Images <span class="arrow"></span></a>
                </li>  
                <ul class="sub-menu collapse" id="service">
                  <input type="file" class="form-control">
                </ul>
				<div class="readmore_area">
                            <a href="#" data-hover="Publish"><span>Publish</span></a>                
                 </div>
            </ul>
     </div>
</div>

</body>

</html>
