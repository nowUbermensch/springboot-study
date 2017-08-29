<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<head>
	<meta charset="utf-8"> 
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

	<!-- Site title
   ================================================== -->
	<title>SpringBoot Study</title>

	<!-- Bootstrap CSS
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

	<!-- Animate CSS
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.min.css">

	<!-- Font Icons CSS
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ionicons.min.css">

	<!-- Main CSS
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

	<!-- Google web font 
   ================================================== -->	
  <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,300' rel='stylesheet' type='text/css'>
	
</head>
<body>

<!-- Navigation section : 요거는 나중에 가능하면 Navigation jsp로 분리할게요!
================================================== -->
<div class="nav-container">
   <nav class="nav-inner transparent">

      <div class="navbar">
         <div class="container">
            <div class="row">

              <div class="brand">
                <a href="index.html">2017 SpringBoot Study</a>
              </div>

              <div class="navicon">
                <div class="menu-container">

                  <div class="circle dark inline">
                    <i class="icon ion-navicon"></i>
                  </div>

                  <div class="list-menu">
                    <i class="icon ion-close-round close-iframe"></i>
                    <div class="intro-inner">
                     	<ul id="nav-menu">
                     	<!-- 페이지 안 만들었으니까  네비게이터 눌러도 400에러 뜹니다-->
                         <li><a href="/product/list">Home</a></li> 
                       	 <li><a href="about.html">Admin</a></li>
                       	 <li><a href="blog.html">Blog</a></li>
                       	 <li><a href="contact.html">Contact</a></li>
                      </ul>
                    </div>
                  </div>

                </div>
              </div>

            </div>
         </div>
      </div>

   </nav>
</div>

<!-- Header section
================================================== -->
<section id="header" style=" background: url('../images/image-${product.id }.jpg') no-repeat;">
	<div class="container">
		<div class="row">

			<div class="col-md-offset-3 col-md-6 col-sm-offset-2 col-sm-8">
          <div class="header-thumb">
              <h1 class="wow fadeIn" data-wow-delay="0.6s"></h1>
              <h3 class="wow fadeInUp" data-wow-delay="0.9s">${product.name }</h3>
          </div>
			</div>

		</div>
	</div>		
</section>
<!-- Single Post section
================================================== -->
<section id="single-post">
   <div class="container">
      <div class="row">

         <div class="wow fadeInUp col-md-offset-1 col-md-10 col-sm-offset-1 col-sm-10" data-wow-delay="2.3s">
         	  <div class="blog-thumb">
         		   
         		   <h1>1개 ${product.price }원</h1> <a href="#" class="btn btn-default">★장바구니 담기 기능을 구현할게요</a>
         			    <div class="post-format">
						        <span><a href="#">★해당제품의 평균 별점을 출력해주세요</a></span>
						        <span><i class="fa fa-date"></i>★리뷰 갯수를 출력해주세요</span>
					       </div>
               <blockquote>${product.contents }</blockquote>


               <div class="blog-comment">
                 <h3>Comments</h3>
                    <div class="media">
                        <div class="media-object pull-left">
                            <img src="images/comment1.jpg" class="img-responsive" alt="blog">
                       </div>
                      <div class="media-body">
                        <h4 class="media-heading">★리뷰 타이틀을 출력해주세요</h4>
                        <h5>★리뷰 작성일을 출력해주세요</h5><h5>★해당 리뷰의 별점을 출력해주세요 - 별점 담당자</h5>
                        <p>★리뷰 내용을 출력해주세요</p>
                      </div>
                    </div>
                    <div class="media">
                        <div class="media-object pull-left">
                            <img src="images/comment2.jpg" class="img-responsive" alt="blog">
                       </div>
                      <div class="media-body">
                        <h4 class="media-heading">이거를 하드코딩 말고 ForEach문으로 뽑아보아요!</h4>
                        <h5>4 June 2016, Saturday</h5>
                        <p>Lorem ipsum dolor sit amet, maecenas eget vestibulum justo imperdiet, wisi risus purus augue vulputate voluptate neque, curabitur.</p>
                      </div>
                    </div>
               </div>


			<!-- 이거는 정말 여력이 되면 구현합시다 ^^; -->
               <div class="blog-comment-form">
                  <h3>Leave a comment</h3>
                    <form action="#" method="post">
                      <input type="text" class="form-control" placeholder="Name" name="name" required>
                      <input type="email" class="form-control" placeholder="Email" name="email" required>
                      <textarea class="form-control" placeholder="Comment" rows="5" name"Your Comments" required id="comment"></textarea>
                      <div class="contact-submit">
                      	<input name="submit" type="submit" class="form-control" id="submit" value="Submit a comment">
                      </div>
                   </form>
               </div>
         	  </div>
		    </div>

      </div>
   </div>
</section>
<!-- Footer section
================================================== -->
<footer>
	<div class="container">
		<div class="row">

			<div class="col-md-12 col-sm-12">
				<p class="wow fadeInUp"  data-wow-delay="0.3s">Copyright © 2017 SK 주식회사, 에너지/화학사업 팀 - ★SNS공유기능을 구현해 보아요</p>
				<ul class="social-icon wow fadeInUp"  data-wow-delay="0.6s">
					<li><a href="#" class="fa fa-facebook"></a></li>
					<li><a href="#" class="fa fa-twitter"></a></li>
					<li><a href="#" class="fa fa-dribbble"></a></li>
					<li><a href="#" class="fa fa-behance"></a></li>
					<li><a href="#" class="fa fa-google-plus"></a></li>
				</ul>
			</div>
			
		</div>
	</div>
</footer>

<!-- Javascript 
================================================== -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/js/custom.js"></script>

</body>
</html>


