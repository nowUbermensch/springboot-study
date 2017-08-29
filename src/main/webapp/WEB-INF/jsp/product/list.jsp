
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<!--
인터넷에서 적당한 무료 템플릿을 다운받아 CSS를 적용해보았습니다.
얼마든지 변경 가능하니..이것은 차차..
★디자인은 나중에 한 번에 입히고 우선은 기능 구현!! 부탁드립니다 :)
-->
	<meta charset="utf-8"> 
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

	<!-- Site title
   ================================================== -->
	<title>SpringBoot Study</title>

	<!-- Bootstrap CSS 가장 익숙하신 Bootstrap으로 ㅎㅎ..
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<!-- 인터넷에서 받아온 style(css)을 적용하는 방법입니다.
	 	 보통, jsp에서 해당 stylesheet를 찾아올 때, 경로를 인식하지 못하는 경우가 왕왕 있습니다.
	 	 그럴때,${pageContext.request.contextPath} 를 먹여주면 contextPath 에 맞게 잘 찾아서 가져옵니다.
	 	 application.yml 부에서 정의해줘도 잘 찾아오긴 하는데 제가 yml은 아직 너무 어려워서 ㅠㅠ...-->

	<!-- Animate CSS 애니메이션 효과 CSS 스타일 시트 로딩
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.min.css">

	<!-- Font Icons CSS 폰트랑 아이콘 로딩
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ionicons.min.css">

	<!-- Main CSS 
   ================================================== -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

	<!-- Google web font 요 아래 방법은 인터넷에있는 url을 링크로 불러와서 css 적용하는 방법입니다 :)
	CSS는 이처럼 외부에서 불러올 수도 있고, 내부에서 상대/절대경로를 통해서 적용 가능합니다.
	상대경로보다는 절대경로나 contextPath 지정해주는게 수정에 용이합니다.
   ================================================== -->	
  <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,300' rel='stylesheet' type='text/css'>
	
</head>
<body>


<!-- Preloader section
================================================== -->
<div class="preloader">

	<div class="sk-spinner sk-spinner-pulse"></div>

</div>


<!-- Navigation section
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
<section id="header" class="header-five">
	<div class="container">
		<div class="row">

			<div class="col-md-offset-3 col-md-6 col-sm-offset-2 col-sm-8">
          <div class="header-thumb">
              <h1 class="wow fadeIn" data-wow-delay="0.6s"></h1>
              <h3 class="wow fadeInUp" data-wow-delay="0.9s">Building a Web Page in a Cloud Envionment : Using SpringBoot </h3>
          </div>
			</div>

		</div>
	</div>		
</section>


<!-- Product List section
================================================== -->
<section id="blog">
   <div class="container">
      <div class="row">


<!-- 물건 리스트를 출력할 겁니다.
================================================== -->

<c:forEach items ="${productList}" var="list">
         <div class="wow fadeInUp col-md-6 col-sm-6" data-wow-delay="1s">
         	  <div class="blog-thumb">				<!-- 이미지 소스를 불러올 때에도 요렇게..이미지 경로를 지정해줍니다. DB에 넣어도 되는데 힘들어요 ㅠ.ㅠ -->
         		   <a href="/product/${list.id}"><img src="${pageContext.request.contextPath}/images/image-${list.id}.jpg" class="img-responsive" alt="Blog"></a>
         		   <a href="/product/${list.id}"><h1>${list.name}</h1></a>
         		     <div class="post-format">
						        <span><a href="#">별점 기능을 넣어줄까요?</a></span>
						        <span><i class="fa fa-date"></i>가격 : ${list.price }</span>
					       </div>
         		     <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet. Dolore magna aliquam erat volutpat sit amet, consectetuer adipiscing elit, sed diam nonumm.</p>
         		     <a href="/product/${list.id}" class="btn btn-default">자세히 보기</a>
         	    </div>
		    </div>

</c:forEach>
 
        
        <div class="wow fadeInUp col-md-12 col-sm-12" data-wow-delay="1.3s">
          <h1>Interdum et malesuada fames</h1>
          <p>Sed quis laoreet purus, a luctus ligula. Suspendisse nec urna a dolor sodales venenatis. Donec et sem quam. Fusce faucibus neque sit amet arcu auctor tincidunt. Etiam feugiat nibh orci, quis sagittis velit pretium ac. Suspendisse egestas ex a dolor dictum gravida. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce sagittis urna id odio consequat fringilla.</p>
          <p>Integer eu rhoncus libero. Nulla dignissim laoreet eros quis interdum. Proin ut placerat dui, eget vehicula ipsum. Mauris id molestie eros. Vestibulum fringilla dui nunc, vitae euismod ligula consectetur eget. Sed accumsan, ipsum in scelerisque euismod, nisi quam placerat urna, ac porttitor augue sapien varius velit.</p>
       </div>

      </div>
   </div>
</section>



<!-- Javascript 
================================================== -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/js/custom.js"></script>

</body>
</html>


