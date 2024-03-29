<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<script type="text/javascript"
	src="https://gc.kis.v2.scr.kaspersky-labs.com/38C520C0-86FF-224E-AAFC-57EAB1CD887F/main.js"
	charset="UTF-8"></script>
</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		<div class="content">
			<!-- Page Content -->
			<!-- Loading the home content -->
			<c:if test="${userClickHome == true }">
				<%@ include file="home.jsp"%>
			</c:if>

			<!-- About Us -->
			<c:if test="${userClickAbout == true }">
				<%@ include file="about.jsp"%>
			</c:if>

			<!-- Contact Us -->
			<c:if test="${userClickContact == true }">
				<%@ include file="contact.jsp"%>
			</c:if>

			<!-- Category Products -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
				<%@ include file="listProducts.jsp"%>
			</c:if>
		</div>

		<!-- Footer -->
		<%@ include file="./shared/footer.jsp"%>
		<!-- /.container -->

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Self Coded javaScript-->
		<script src="${js}/myapp.js"></script>
	</div>
  </body>
</html>