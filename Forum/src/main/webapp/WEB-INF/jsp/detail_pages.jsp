<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>PN Forum: Detail</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/icon" href="images/favicon.ico"/>
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">       
    <link id="switcher" href="resources/css/themes/lite-blue-theme.css" rel="stylesheet">   
    <link href="resources/css/slick.css" rel="stylesheet"> 
    <link href="resources/css/style.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>  
    <link href='http://fonts.googleapis.com/css?family=Habibi' rel='stylesheet' type='text/css'>   
    <link href='http://fonts.googleapis.com/css?family=Cinzel+Decorative:900' rel='stylesheet' type='text/css'>
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
              <!--  <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="<%=request.getContextPath()%>/index">Home</a></li>
                <li><a href="<%=request.getContextPath()%>/discuss">Discuss</a></li>
                
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
                        
            </div><!--/.nav-collapse -->
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
                  <li class="active">Detail Pages</li>
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
                    <div class="col-md-12 col-sm-12">                     
                      <div class="blog-content">
                        <!-- Start Single Blog -->
                        <div class="single-Blog">
                          <div class="single-blog-left">
                            <ul class="blog-comments-box">
                              <li>May <h2>10</h2>2015</li>
                              <li><span class="fa fa-eye"></span>1523</li>
                              <li><a href="#"><span class="fa fa-comments"></span>5</a></li>
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
                                <li>By <a href="#"><c:out value="${baiDangListById.tieu_de}"></c:out></a></li>
                                <li>In <a href="#"><c:out value="${baiDangListById.tieu_de}"></c:out></a></li>
                                <li><span class="fa fa-tags"></span><a href="#">Dental</a> <a href="#">Surgery</a> <a href="#">Cardiac</a></li>
                              </ul>
                            </div>
                            <div class="blog-content blog-details">
                              <h2><c:out value="${baiDangListById.tieu_de}"></c:out></h2>                              
                              <p><c:out value="${baiDangListById.noi_dung}"></c:out></p> 
                              <!-- Start Social Share-->
                              <div class="social-share">
                               <h3>Share is Awesome</h3>
                               <ul>
                                 <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                                 <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                 <li><a href="#"><span class="fa fa-pinterest"></span></a></li>
                                 <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                                 <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                               </ul>
                             </div>
                             <!-- Start Post Navigation -->
                             <div class="post-navigation">
                               <div class="postnav-left">
                                 <a class="prev-icon" href="#"><span class="fa fa-angle-left"></span></a>
                                 <h4 class="navg-title">Previous Title Text</h4>
                               </div>
                               <div class="postnav-right">
                                 <a class="next-icon" href="#"><span class="fa fa-angle-right"></span>
                                 </a>
                                 <h4 class="navg-title">Next Title Text</h4>
                               </div>
                             </div>
                              
                              <!-- Start Similar News -->
                              <div class="similar-post">
                              <c:forEach items="${similarPost}" var = "similar"> 
                                <h2>Similar News  </h2>
                                 <div class="row">
                                    <div class="col-md-6 col-sm-6">
                                      <div class="media">
                                        <div class="media-left">
                                          <a class="news-img" href="#">
                                            <img class="media-object" src="images/small-blog-img1.jpg" alt="img">
                                          </a>
                                        </div>
                                        <div class="media-body">
                                         <a href="#"><c:out value="${similar.tieu_de}"></c:out></a>
                                         <span class="feed-date"><c:out value="${similar.ngay_dang_bai}"></c:out></span>
                                        </div>
                                      </div>
                                   </div>
                                  </div>
                                </c:forEach>
                                </div>
                              <!-- Start Comments  -->
                              <div class="comments-area">
                                <h3 class="comments-title"><c:out value="${blList.size()}"></c:out> Comments</h3>
                                
                                <div class="comments">
                                  <ul class="commentlist">
                                 <c:forEach items="${blList}" var="bl">
                                    <li>
                                      <div class="media">
                                        <div class="media-left">    
                                            <img alt="img" src="resources/images/doctor-2.jpg" class="media-object news-img">      
                                        </div>
                                        <div class="media-body">
                                         <h4 class="author-name">User</h4>
                                         <span class="comments-date"><c:out value="${bl.ngay}"></c:out></span>
                                         <p><c:out value="${bl.noi_dung}"></c:out></p>
                                         <a class="reply-btn" href="#">Reply</a>
                                        </div>
                                      </div>
                                      
                                    </li>
                                    </c:forEach>
                                  </ul>
                                </div>
                              </div>
                              <!-- start Comments navigation -->
                              <nav>
                                <ul class="comments-pagination">
                                  <li>
                                    <a aria-label="Previous" href="#">
                                      <span class="fa fa-angle-left"></span>
                                    </a>
                                  </li>
                                  <li><a href="#">1</a></li>
                                  <li><a href="#">2</a></li>
                                  <li><a href="#">3</a></li>
                                  <li><a href="#">4</a></li>
                                  <li><a href="#">5</a></li>
                                  <li>
                                    <a aria-label="Next" href="#">
                                      <span class="fa fa-angle-right"></span>
                                    </a>
                                  </li>
                                </ul>
                              </nav>
                              <!-- Comments Responds -->
                              <div id="respond">
                                <h3 class="reply-title">Leave a Reply</h3>
                                <form id="commentform">
                                  <p class="comment-notes">
                                    Your email address will not be published. Required fields are marked <span class="required">*</span>
                                  </p>
                                  <p class="comment-form-author">
                                    <label for="author">Name <span class="required">*</span></label>
                                    <input type="text" required="required" size="30" value="" name="author">
                                  </p>
                                  <p class="comment-form-email">
                                    <label for="email">Email <span class="required">*</span></label>
                                    <input type="email" required="required" aria-required="true" value="" name="email">
                                  </p>
                                  <p class="comment-form-url">
                                    <label for="url">Website</label>
                                    <input type="url" value="" name="url">
                                  </p>
                                  <p class="comment-form-comment">
                                    <label for="comment">Comment</label>
                                    <textarea required="required" aria-required="true" rows="8" cols="45" name="comment"></textarea>
                                  </p>
                                  <p class="form-allowed-tags">
                                    You may use these <abbr title="HyperText Markup Language">HTML</abbr> tags and attributes:  <code>&lt;a href="" title=""&gt; &lt;abbr title=""&gt; &lt;acronym title=""&gt; &lt;b&gt; &lt;blockquote cite=""&gt; &lt;cite&gt; &lt;code&gt; &lt;del datetime=""&gt; &lt;em&gt; &lt;i&gt; &lt;q cite=""&gt; &lt;s&gt; &lt;strike&gt; &lt;strong&gt; </code>
                                  </p>
                                  <p class="form-submit">
                                    <input type="submit" value="Post Comment" class="submit" name="submit">
                                  </p>        
                                </form>
                              </div>                              
                            </div>
                          </div>                     
                        </div>
                      </div>
                      
                    <!-- Start Right Side bar -->
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
      <style type="text/css">.subiz_online { cursor: pointer; display: block; height: 35px; width: 158px; line-height: 22px; text-indent: -99999px; background: url(https://dashboard.subiz.com/public/img/button/gallery/subiz-button1-online.png) no-repeat scroll left center white; }.subiz_offline { cursor: pointer; display: block; height: 35px; width: 158px; line-height: 22px; text-indent: -99999px; background: url(https://dashboard.subiz.com/public/img/button/gallery/subiz-button1-offline.png) no-repeat scroll left center white; } </style><div class="subiz_status"></div>
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