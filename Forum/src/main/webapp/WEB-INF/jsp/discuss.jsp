<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>PN Forum: Discuss</title>

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
    <!-- Default Theme css file -->
    <link id="switcher" href="resources/css/themes/lite-blue-theme.css" rel="stylesheet">   
    <!-- Slick slider css file -->
    <link href="resources/css/slick.css" rel="stylesheet"> 

    <!-- Main structure css file -->
    <link href="resources/css/style.css" rel="stylesheet">
   
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
    <!-- BEGAIN PRELOADER -->
    <div id="preloader">
      <div id="status">&nbsp;</div>
    </div>
    <!-- END PRELOADER -->

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-hand-o-up"></i></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
    <header id="header">
      <!-- BEGIN MENU -->
      <div class="menu_area">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">  
          <div class="container">
            <div class="navbar-header">
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <!-- LOGO -->              
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" href="index.html"><i class="fa fa-home"></i>PN <span>Forum</span></a>               
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="resources/images/logresources/images alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="<%=request.getContextPath()%>/">Home</a></li>
                <li class="active"><a href="<%=request.getContextPath()%>/discuss">Discuss</a></li>
                
                <li><a href="forum.html">Forum</a></li>
               <li ><a href="<%=request.getContextPath()%>/about_us">About us</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Login <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="<%=request.getContextPath()%>/login">Sign in</a></li>
                    <li><a href="<%=request.getContextPath()%>/register">Regiser</a></li>
                    <li><a href="#">Logout</a></li>
                  </ul>
                </li>
                </ul> 
                        
            </div>           
            
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    

   
    </header>
    <!--=========== END HEADER SECTION ================-->

    <!--=========== START BLOG SECTION ================-->        
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Blog</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Blog</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="container">
            <div class="row">
              <div class="col-md-12 col-sm-12">
                <!-- Start Blog Archive Area -->
                <div class="blogArchive-area">
                  <div class="row">
                    <!-- Start Blog Content -->
                    <div class="col-md-9 col-sm-8">                     
                      <div class="blog-content">
                      
                        <!-- Start Single Blog -->
                        <c:forEach items="${baidangList}" var="baidang">  
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <!-- <li>May <h2>10</h2>2015</li> -->
                              <li><c:out value="${baidang.ngay_dang_bai}"/></li>
                              <li><span class="fa fa-eye"></span><c:out value="${baidang.luot_xem}"/></li>
                              <li><a href="#"><span class="fa fa-comments"></span></span><c:out value="${baidang.luot_xem}"/></a></li>
                            </ul>
                          </div>
                          <div class="single-blog-right">
                            <div class="blog-img">
                              <figure class="blog-figure">
                               <a href="#"><img alt="img" src="resources/images/9.jpg"></a>
                                <span class="image-effect"></span>
                              </figure>
                            </div>
                            <div class="blog-author">
                              <ul>
                                <li>By <a href="#"></span><c:out value="${baidang.id}"/></a></li>
                                <li>In <a href="#"></span><c:out value="${baidang.tieu_de}"/></a></li>
                              </ul>
                            </div>
                            <div class="blog-content">
                              <h2><c:out value="${baidang.tieu_de}"/></h2>
                              <p><c:out value="${baidang.noi_dung}"/></p>
                              <!-- Read more btn -->
                             <div class="readmore_area">
                            <a href="#" data-hover="Read More"><span>Read More</span></a>                
                          </div>
                            </div>
                          </div>
                        </div>
                        </c:forEach>
                        
                        <!-- Start blog pagination  -->
                        <div class="blog-pagination">
                          <nav>
                            <ul class="pagination">
                              <li>
                                <a href="#" aria-label="Previous">
                                  <span class="fa fa-angle-left"></span>
                                </a>
                              </li>
                              <li><a href="#">1</a></li>
                              <li><a href="#">2</a></li>
                              <li><a href="#">3</a></li>
                              <li><a href="#">4</a></li>
                              <li><a href="#">5</a></li>
                              <li>
                                <a href="#" aria-label="Next">
                                  <span class="fa fa-angle-right"></span>
                                </a>
                              </li>
                            </ul>
                          </nav>
                        </div>
                      </div>
                    </div>
                    <!-- Start Right Side bar -->
                    <div class="col-md-3 col-sm-4">
                      <aside class="sidebar">
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Latest Posts</h3>
                          <ul class="popular-tab">
                          
                            <c:forEach items = "${diplaybyDate}" var ="ByDate"> 
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="resources/images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="#"><c:out value="${ByDate.tieu_de}"/></a>
                                 <span><c:out value="${ByDate.ngay_dang_bai}"/></span>
                                </div>
                              </div>
                            </li>
                           </c:forEach>
                                           
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Most Viewed</h3>
                          <ul class="popular-tab">
                          <c:forEach items = "${diplayByLike}" var ="ByLike"> 
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="#" class="news-img">
                                    <img alt="img" src="resources/images/small-blog-img1.jpg" class="media-object">
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="#"><c:out value = "${ByLike.tieu_de }"/> </a>
                                 <span class="feed-date"><c:out value = "${ByLike.id }"/></span>
                                </div>
                              </div>
                            </li>
                          </c:forEach>           
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Tags</h3>
                          <ul class="tag-nav">
                               <li><a href="#">OOP</a></li>
                               <li><a href="#">Swing</a></li>
                               <li><a href="#">.NET</a></li>
                              <li><a href="#">PHP</a></li>
                              <li><a href="#">Android</a></li>
                              <li><a href="#">Spring</a></li>
                              <li><a href="#">Database</a></li>
                              <li><a href="#">JSP/Servlet</a></li>
                              <li><a href="#">Cake</a></li>
                              <li><a href="#">HTML/CSS</a></li>
                  
                </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Post</h3>
                          <p>Do you want to post something.<br/> <a href="#">Click here</a></p>
                          <div class="readmore_area">
                            <a href="<%=request.getContextPath()%>/post" data-hover="POST"><span>POST</span></a>                
                          </div>
                          
                          
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Archives</h3>
                          <ul class="archives">
                            <li><a title="May 2015" href="#">May 2015<span>2</span></a></li>
                            <li><a title="April 2015" href="#">April 2015<span>5</span></a></li>
                            <li><a title="March 2015" href="#">March 2015<span>10</span></a></li>
                          </ul>
                        </div>
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Categories</h3>
                          <ul>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Dental</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Surgery</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Pediatric</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Cardiac</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Ophthalmology</a></li>
                            <li><a href="#"><span class="fa fa-angle-right"></span>Diabetes</a></li>
                          </ul>
                        </div>
                      </aside>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END BLOG SECTION ================-->

    
   <!--=========== Start Footer SECTION ================-->
    <footer id="footer">
      <!-- Start Footer Top -->
      <div class="footer-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>Our vision</h2>
                <div class="line"></div>
              </div>           
              <p>Passerelles numériques strives for a world where young underprivileged people can have a better life through access to education, training and employment to better leverage their potential and willpower.</p>
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>  Our Service</h2>
                <div class="line"></div>
              </div>
              <ul class="footer-service">
                <li><a href="#"><span class="fa fa-check"></span>Service 1</a></li>
                <li><a href="#"><span class="fa fa-check"></span>Service 2</a></li>
                <li><a href="#"><span class="fa fa-check"></span>Service 3</a></li>
                <li><a href="#"><span class="fa fa-check"></span>Service 4</a></li>
                <li><a href="#"><span class="fa fa-check"></span>Service 5</a></li>
              </ul>
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>Tags</h2>
                <div class="line"></div>
              </div>
                <ul class="tag-nav">
                  <li><a href="#">OOP</a></li>
                  <li><a href="#">Swing</a></li>
                  <li><a href="#">.NET</a></li>
                  <li><a href="#">PHP</a></li>
                  <li><a href="#">Android</a></li>
                  <li><a href="#">Spring</a></li>
                  <li><a href="#">Database</a></li>
                  <li><a href="#">JSP/Servlet</a></li>
                  <li><a href="#">Cake</a></li>
                  <li><a href="#">HTML/CSS</a></li>
                  
                </ul>
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="single-footer-widget">
                <div class="section-heading">
                <h2>Contact Info</h2>
                <div class="line"></div>
              </div>
              <p>Passerelles numeriques Viet Nam.</p>
              <address class="contact-info">
                <p><span class="fa fa-home"></span>80B Le Duan str, Da Nang city, Viet Nam</p>
                <p><span class="fa fa-phone"></span>0511 3888 503</p>
                <p><span class="fa fa-envelope"></span>passerellesnumeriques.com</p>
              </address>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Start Footer Middle -->
      <div class="footer-middle">
        <div class="container">
          <div class="row">
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-copyright">
              <p>&copy; Design by <a href="index.html">VSHD</a></p>
            </div>
          </div>
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-social">              
                <a href="#"><span class="fa fa-facebook"></span></a>
                <a href="#"><span class="fa fa-twitter"></span></a>
                <a href="#"><span class="fa fa-google-plus"></span></a>
                <a href="#"><span class="fa fa-linkedin"></span></a>     
            </div>
          </div>
        </div>
        </div>
      </div>
    </footer>
    <!--=========== End Footer SECTION ================-->

    <!-- jQuery Library  -->
    <script src="resources/js/jquery.js"></script>    
    <!-- Bootstrap default js -->
    <script src="resources/js/bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="resources/js/slick.min.js"></script>    
    <script type="text/javascript" src="resources/js/modernizr.custom.79639.js"></script>    
    <!-- counter -->
    <script src="resources/js/waypoints.min.js"></script>
    <script src="resources/js/jquery.counterup.min.js"></script>
    <!-- Doctors hover effect -->
    <script src="resources/js/snap.svg-min.js"></script>
    <script src="resources/js/hovers.js"></script>
    
    <!-- Custom JS -->
    <script src="resources/js/custom.js"></script>
    
      <script type='text/javascript'>window._sbzq||function(e){e._sbzq=[];var t=e._sbzq;t.push(["_setAccount",37282]);var n=e.location.protocol=="https:"?"https:":"http:";var r=document.createElement("script");r.type="text/javascript";r.async=true;r.src=n+"//static.subiz.com/public/js/loader.js";var i=document.getElementsByTagName("script")[0];i.parentNode.insertBefore(r,i)}(window);</script> 
  </body>
</html>