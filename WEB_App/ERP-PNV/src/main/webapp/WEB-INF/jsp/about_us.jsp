<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!--=============================================== 
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>PN Forum : About Us</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="resources/images/favicon.ico"/>

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
              <!--  <a class="navbar-brand" href="index.html"><img src="resources/images/logo.png" alt="logo"></a>   -->                    
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="<%=request.getContextPath()%>/">Home</a></li>
                <li><a href="<%=request.getContextPath()%>/discuss">Discuss</a></li>
                
                <li><a href="forum.html">Forum</a></li>
               <li class="active"><a href="<%=request.getContextPath()%>/about_us">About us</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Login <span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="<%=request.getContextPath()%>/login">Sign in</a></li>
                    <li><a href="<%=request.getContextPath()%>/about_us">Regiser</a></li>
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
    <section id="blogArchive">      
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="blog-breadcrumbs-area">
            <div class="container">
              <div class="blog-breadcrumbs-left">
                <h2>About Us</h2>
              </div>
              <div class="blog-breadcrumbs-right">
                <ol class="breadcrumb">
                  <li>You are here</li>
                  <li><a href="#">Home</a></li>                  
                  <li class="active">About Us</li>
                </ol>
              </div>
            </div>
          </div>
        </div>        
      </div>      
    </section>
    
    
            <!--=========== BEGIN Top Feature SECTION ================-->
    <section id="topFeature">
      <div class="row">
        <!-- Start Single Top Feature -->
        <div class="col-lg-4 col-md-4">
          <div class="row">
            <div class="single-top-feature">
              <span class="fa fa-building"></span>
              <h3>PHILIPPINES</h3>
              <p>CONTEXT AND RESULTS
In the Philippines, while the economy was experiencing a strong growth rate (+7%), the country saw both an increase in unemployment and a rise in the poverty rate. 70% of the population live with less than PHP100 per day (less than $3). </p>
              <div class="readmore_area">
                <a href="http://www.passerellesnumeriques.org/philippines/" data-hover="Read More"><span>Read More</span></a>
              </div>
            </div>
          </div>
        </div>
        <!-- End Single Top Feature -->
         
        <!-- Start Single Top Feature -->
        <div class="col-lg-4 col-md-4">
          <div class="row">
            <div class="single-top-feature opening-hours">
              <span class="fa fa-star-o"></span>
              <h3>Viet Nam</h3>
              <p></p>
              In 2010, the first selection process covered three provinces in 2010: Quang Nam, Quang Ngai and the countryside surrounding Da Nang. PN strongly believes that IT provides a unique opportunity to develop poor regions of Central Vietnam.              
            </div>
          </div>
        </div>
        <!-- End Single Top Feature -->

        <!-- Start Single Top Feature -->
        <div class="col-lg-4 col-md-4">
          <div class="row">
            <div class="single-top-feature">
              <span class="fa fa-university"></span>
              <h3>CAMPODIA</h3>
              <p>In Cambodia, a society still traumatized by 30 years of civil war and the Khmer Rouge tragedy, 31% of the population still live on less than $1.25 per day. The persistent corruption, political crises and the slow emergence of a middle class restrains the development of a fair society.</p>
              <div class="readmore_area">
                <a href="http://www.passerellesnumeriques.org/cambodge/" data-hover="Read More"><span>Read More</span></a>
              </div>

            </div>
          </div>
        </div>
        <!-- End Single Top Feature -->
      </div>
    </section>
    <!--=========== END Top Feature SECTION ================-->
    <!--=========== END Top Feature SECTION ================-->

    <!--=========== BEGIN Service SECTION ================-->
    <section id="service">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="service-area">
              <!-- Start Service Title -->
              <div class="section-heading">
                <h2>Our Training</h2>
                <div class="line"></div>
              </div>
              <!-- Start Service Content -->
              <div class="service-content">
                <div class="row">
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-laptop service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">Software Developer</a></h3>
                      <p>C/C+, JAVA, .NET</p>
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-heartbeat service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">WEB DEVELOPER</a></h3>
                        <p>HTML/ CSS / JAVASCRIPT
                <br/>PHP, RUBY, CMS
                      </p>
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-android service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">MOBILE DEVELOPER</a></h3>
                      <p>Android<br/>IOS</p>
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-medkit service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">TESTING</a></h3>
                      <p>Manual testing<br/>Automation testing</p>
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-user-md service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">PLT</a></h3>
                      <p>Soft skills</p>
                    </div>
                  </div>
                  <!-- Start Single Service -->
                  <div class="col-lg-4 col-md-4">
                    <div class="single-service">
                      <div class="service-icon">
                        <span class="fa fa-graduation-cap service-icon-effect"></span>  
                      </div>                      
                      <h3><a href="#">Education</a></h3>
                      <p>Life skills</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== End Service SECTION ================-->

    <!--=========== BEGAIN Why Choose Us SECTION ================-->
    <section id="whychooseSection">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="service-area">
              <!-- Start Service Title -->
              <div class="section-heading">
                <h2>Value of us</h2>
                <div class="line"></div>
              </div>              
            </div>
          </div>
          <div class="col-lg-12 col-md-12">
            <div class="row">
              <div class="col-lg-5 col-md-6 col-sm-6 col-xs-12">
                <div class="whyChoose-left">
                  <div class="whychoose-slider">
                    <div class="whychoose-singleslide">
                      <img src="resources/images/trust.jpg" alt="img">
                    </div>
                    <div class="whychoose-singleslide">
                      <img src="resources/images/respon.jpg" alt="img">
                    </div>
                    <div class="whychoose-singleslide">
                      <img src="resources/images/solida.jpg" alt="img">
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-lg-7 col-md-6 col-sm-6 col-xs-12">
                <div class="whyChoose-right">
                  <div class="media">
                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-plus"></span>
                      </a>
                    </div>
                    <div class="media-body">
                      <h4 class="media-heading">Trust</h4>
                      <p>Trust yourself. You know more than you think you do</p>  
                      <p></p>
                    </div>
                  </div>
                  <div class="media">
                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-plus-square-o"></span>
                      </a>
                    </div>
                    <div class="media-body">
                      <h4 class="media-heading">Responsibility</h4>
                      <p> </p>  
                    </div>
                  </div>
                  <div class="media">

                    <div class="media-left">
                      <a href="#" class="media-icon">
                        <span class="fa fa-plus-square"></span>
                      </a>
                    </div>
                    <div class="media-body">
                      <h4 class="media-heading">Solidarity</h4>
                      <p>I can do it. Trust yourself, friends, teachers and PN</p>  
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>          
        </div>
      </div>
    </section>
    <!--=========== END Why Choose Us SECTION ================-->
    
    <!--=========== BEGAIN Doctors SECTION ================-->
    <section id="meetDoctors">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12">
            <div class="meetDoctors-area">
             <!-- Start Service Title -->
              <div class="section-heading">
                <h2>TEAM EXECUTE</h2>
                <div class="line"></div>
              </div>
              <div class="doctors-area">
                <ul class="doctors-nav">
                  <li>
                    <div class="single-doctor">
                      <a class="tdoctor" href="#" data-path-hover="m 180,34.57627 -180,0 L 0,0 180,0 z">
                        <figure>
                          <img src="resources/images/doctor-1.jpg" />
                          <svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,218 0,0 180,0 z"/></svg>
                          <figcaption>
                            <h2>VÕ MÃ ĐIỀN</h2>
                            <p>PRODUCT OWNER</p>
                            <button>View</button>             
                          </figcaption>
                        </figure>
                      </a>
                      <div class="single-doctor-social">
                        <a href="https://www.facebook.com/profile.php?id=100008932388689&fref=ts"><span class="fa fa-facebook"></span></a>
                        <a href="https://twitter.com/Dienvm95"><span class="fa fa-twitter"></span></a>
                        <a href="#"><span class="fa fa-google-plus"></span></a>
                        <a href="#"><span class="fa fa-linkedin"></span></a>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="single-doctor">
                      <div class="single-doctor">
                      <a class="tdoctor" href="#" data-path-hover="m 180,34.57627 -180,0 L 0,0 180,0 z">
                        <figure>
                          <img src="resources/images/doctor-2.jpg" />
                          <svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,218 0,0 180,0 z"/></svg>
                          <figcaption>
                            <h2>DOÃN THỊ NHƯ VY</h2>
                            <p>TEAM MEMBER</p>
                            <button>View</button>             
                          </figcaption>
                        </figure>
                      </a>
                      <div class="single-doctor-social">
                        <a href="https://www.facebook.com/profile.php?id=100005383577253"><span class="fa fa-facebook"></span></a>
                        <a href="#"><span class="fa fa-twitter"></span></a>
                        <a href="#"><span class="fa fa-google-plus"></span></a>
                        <a href="#"><span class="fa fa-linkedin"></span></a>
                      </div>
                    </div>
                    </div>
                  </li>
                  <li>
                    <div class="single-doctor">
                      <div class="single-doctor">
                      <a class="tdoctor" href="#" data-path-hover="m 180,34.57627 -180,0 L 0,0 180,0 z">
                        <figure>
                          <img src="resources/images/doctor-3.jpg" />
                          <svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,218 0,0 180,0 z"/></svg>
                          <figcaption>
                            <h2>HUỲNH VĂN SƠN</h2>
                            <p>CSRUM MASTER</p>
                            <button>View</button>             
                          </figcaption>
                        </figure>
                      </a>
                      <div class="single-doctor-social">
                        <a href="https://www.facebook.com/huynh.vanson.1?fref=ts"><span class="fa fa-facebook"></span></a>
                        <a href="https://twitter.com/SonhvSon"><span class="fa fa-twitter"></span></a>
                        <a href="#"><span class="fa fa-google-plus"></span></a>
                        <a href="#"><span class="fa fa-linkedin"></span></a>
                      </div>
                    </div>
                    </div>
                  </li>
                  <li>
                    <div class="single-doctor">
                      <div class="single-doctor">
                      <a class="tdoctor" href="#" data-path-hover="m 180,34.57627 -180,0 L 0,0 180,0 z">
                        <figure>
                          <img src="resources/images/doctor-5.jpg" />
                          <svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,218 0,0 180,0 z"/></svg>
                          <figcaption>
                            <h2>ĐỖ THỊ HẬU</h2>
                            <p>TEAM MEMBER</p>
                            <button>View</button>             
                          </figcaption>
                        </figure>
                      </a>
                      <div class="single-doctor-social">
                        <a href="https://www.facebook.com/hau.dt.92?fref=ts"><span class="fa fa-facebook"></span></a>
                        <a href="#"><span class="fa fa-twitter"></span></a>
                        <a href="#"><span class="fa fa-google-plus"></span></a>
                        <a href="#"><span class="fa fa-linkedin"></span></a>
                      </div>
                    </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== End Doctors SECTION ================-->

     <!--=========== BEGIN Google Map SECTION ================-->
    <section id="googleMap">
      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3833.8908835199613!2d108.21524931426589!3d16.071151143656557!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x314218368c16c0d3%3A0xb16d0ccefe9f4300!2zODAgTMOqIER14bqpbiwgVGjhuqFjaCBUaGFuZywgUS4gSOG6o2kgQ2jDonUsIMSQw6AgTuG6tW5nLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1457170614662" width="100%" height="500" frameborder="0" style="border:0" allowfullscreen></iframe>
    </section>
    <!--=========== END Google Map SECTION ================-->
    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-7 col-md-7 col-sm-6">
            <div class="contact-form">
              <div class="section-heading">
                <h2>Contact Us</h2>
                <div class="line"></div>
              </div>
              <p>Fill out all required Field to send a Message. Please don't spam,Thank you!</p>
              <form class="submitphoto_form">
                <input type="text" class="wp-form-control wpcf7-text" placeholder="Your name">
                <input type="mail" class="wp-form-control wpcf7-email" placeholder="Email address">          
                <input type="text" class="wp-form-control wpcf7-text" placeholder="Subject">
                <textarea class="wp-form-control wpcf7-textarea" cols="30" rows="10" placeholder="What would you like to tell us"></textarea>
               <button class="wpcf7-submit button--itzel" type="submit"><i class="button__icon fa fa-envelope"></i><span>Send Message</span></button>                
              </form>
            </div>
          </div>
          <div class="col-lg-5 col-md-5 col-sm-6">
            <div class="contact-address">
              <div class="section-heading">
                <h2>Our Partners</h2>
                <div class="line"></div>
              </div>
               <div class="whychoose-slider">
                    <div class="whychoose-singleslide">
                      <img src="resources/images/logigear.jpg" alt="img">
                    </div>
                    <div class="whychoose-singleslide">
                      <img src="resources/images/DaNangUniversity.jpg" alt="img">
                    </div>
                    <div class="whychoose-singleslide">
                      <img src="resources/images/AxonActive.png" alt="img">
                    </div>
                  </div>
              <h3>Social Media</h3>
              <div class="social-share">               
               <ul>
                 <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                 <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                 <li><a href="#"><span class="fa fa-pinterest"></span></a></li>
                 <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                 <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
               </ul>
             </div>
            </div>
          </div>
        </div>
      </div>
    </section>

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