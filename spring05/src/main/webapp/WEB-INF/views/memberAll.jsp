<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- ������ -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="background: pink;">
�˻���� �Դϴ�.<br>
<hr color="red">

<c:forEach var="result" items="${list2}">
	�˻��� id: ${result.id}<br> 
	�˻��� pw: ${result.pw}<br>
	�˻��� name: ${result.name}<br>
	�˻��� tel: ${result.tel}<br>
	<hr color="lime">
</c:forEach>

</body>
</html>