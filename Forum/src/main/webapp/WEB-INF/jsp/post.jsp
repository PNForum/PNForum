<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>PN Forum : Post</title>

<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/AdminLTE.min.css">

</head>

<body>
	<div class="wrapper">
	<form:form action="add" modelAttribute="postNew" method="POST" enctype="multipart/form-data">
				<aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">Post</li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-files-o"></i>
                <span>Tag</span>
              </a>
              <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> OOP</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> Swing</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> .NET</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> PHP</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> Spring</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> Database</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> JSP/Servlet</a></li>
                <li><a href="#"><i class="fa fa-circle-o"></i> HTML/CSS</a></li>
              </ul>
            </li>



            <li class="treeview">
              <a href="#">
                <i class="fa fa-table"></i> <span>Features Images</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <button type="button" class="btn btn-primary">Image</button>
              </ul>
            </li>
            <li>
              <a href="#">
                <i class="fa fa-calendar"></i> <span>Draft</span>
              </a>
            </li>
            <li>
              <a href="#">
                <i class="fa fa-envelope"></i> <span>More Option</span>
              </a>
            </li>
            <li">
            <button type="button" class="btn btn-primary btn-lg" >Publish</button>
            </li>
          </ul>
        </section>
      </aside>


	<div class="content-wrapper">
        <section class="content">
          <div class="row">

				<%-- <form:form action="add" modelAttribute="postNew" method="POST" enctype="multipart/form-data"> --%>
					<form:hidden path="id" />
					<!--  get titles -->
					<div class="col-md-12">
						<form:input path="tieu_de" type="text" placeholder="TITLES"
							class="form-control input-lg" />
						<p><form:errors path = "tieu_de" cssClass="error"></form:errors></p>
					</div>
					<!--  get content -->
					<div class="col-lg-12">
						<label for="comment">Contents:</label>
						<form:textarea type="text" path="noi_dung" class="form-control" rows="15"
							id="comment"></form:textarea>
							<p><form:errors path = "noi_dung" cssClass="error"></form:errors></p>
					</div>
					<div>
						<p>Please choose image upload</p>
						<input type="file" name="file">
						</td>
						<button style="margin: 25px" type="submit" value="submit"
							class="btn btn-primary btn-lg">Save
							
							<script>
								function myFunction() {
								    alert("I am an alert box!");
								}
							</script>	
						</button>
					</div>
				</form:form>

			</div>
            
          </div>
        </section>
      </div>

		
</body>
<script src="resources/js/app.min.js"></script>
</html>
