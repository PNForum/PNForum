<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>PN Forum : Forum</title>

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
    <!-- Photo Swipe Image Gallery -->     
    <link rel='stylesheet prefetch' href='resources/css/photoswipe.css'>
    <link rel='stylesheet prefetch' href='resources/css/default-skin.css'>    

    <!-- Main structure css file -->
    <link href="resources/css/style.css" rel="stylesheet"> 

    <link href="resources/css/stylesheet.css">
   
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
              <a class="navbar-brand" href="index.html"> <i class="fa fa-home"></i>PN <span>Forum</span></a>             
              <!-- IMG BASED LOGO  -->
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="<%=request.getContextPath()%>/">Home</a></li>
                <li><a href="<%=request.getContextPath()%>/discuss">Discuss</a></li>
                
                <li class="active"><a href="forum.html">Forum</a></li>
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
                        
            </div><!--/.nav-collapse -->
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    
    </header>
    <!--=========== END HEADER SECTION ================--> 
    

   <!--=========== START QUESTION ================-->  
    <section id="blogArchive">  
    <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>Forum</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">Forum</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>
   
      <div class="col-md-12 col-lg12">
                      <aside class="sidebar">
                        <!-- Start sidebar widget -->
                        <div class="sidebar-widget">
                          <h3>Top Questions</h3>
                          <ul class="popular-tab">
                            <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                                             
                            <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                                
                                <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                                    
                                    <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                                        
                                        <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                                            
                                            <li>
                              <div class="media">
                                <div class="col-md-1">
                                  <a href="#">
                                    Views
                                    <div>
                                       <span class="fa fa-comments"></span> 29
                                    </div>
                                    
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Comment
                                    <div>
                                        <span class="fa fa-comments"></span>39
                                    </div>
                                  </a>
                                </div>
                                <div class="col-md-1">
                                  <a href="#" class="news-img">
                                    Time
                                    <span class="feed-date">27.02.15</span>
                                  </a>
                                </div>
                                <div class="media-body">
                                 <a href="blog-single.html">Viết mô tả ngắn về một vài câu hỏi vào đây nhak, :)<br\>
                                     <p>Vài dòng miêu tả chi tiết vô đây nữa</p></a>
                                 <ul class="tag-nav">
                                     <div class="col-md-8">
                                     <li><a href="#">tag 1</a><a href="#">tag 2</a><a href="#">tag 3</a><a class="pull-right" href="#">readmore...</a></li>
                                     </div>
                                  
                                </ul>
                                <div>
                                    
                                </div>
                                </div>
                              </div>
                            </li>
                          </ul>
                        </div>

                      </aside>
                    </div>
    </section> 
   <!--=========== END QUESTION ================-->  
                       
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
    <!-- Photo Swipe Gallery Slider -->
    <script src='js/photoswipe.min.js'></script>
    <script src='js/photoswipe-ui-default.min.js'></script>    
    <script src="resources/js/photoswipe-gallery.js"></script>

    <!-- Custom JS -->
    <script src="resources/js/custom.js"></script>
     
      <script type='text/javascript'>window._sbzq||function(e){e._sbzq=[];var t=e._sbzq;t.push(["_setAccount",37282]);var n=e.location.protocol=="https:"?"https:":"http:";var r=document.createElement("script");r.type="text/javascript";r.async=true;r.src=n+"//static.subiz.com/public/js/loader.js";var i=document.getElementsByTagName("script")[0];i.parentNode.insertBefore(r,i)}(window);</script>
  </body>
</html>