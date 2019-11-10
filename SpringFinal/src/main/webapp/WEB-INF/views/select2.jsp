<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="resources/css/project.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div id="total">
		<!-- top�޴� ���� �κ�  -->
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<!-- ��ٱ��� ������ų ��  -->
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>

		<div id="content">
			<h3>�Խ��� ��ü �˻� ���</h3>
			<hr color="green">
			<table border="1">
				<tr>
					<td width="150">���̵�</td>
					<td width="300">${dto.id}</td>
				</tr>
				<tr>
					<td>�� ��</td>
					<td>${dto.title}</td>
				</tr>
				<tr>
					<td>�� ��</td>
					<td height="100" >${dto.content}</td>
				</tr>
				<tr>
					<td>����</td>
					<td>${dto.price}</td>
				</tr>
				<tr>
					<td>��ǥ�̹���</td>
					<td><img width=200 height=200 src=resources/img/${dto.img}></td>
				</tr>
				
				
			</table>
		</div>

		<hr color="lime">
		<div id="result">
			<c:forEach var="dto2" items="${list}">
			- ${dto2.content}, ${dto2.writer}<br>
			</c:forEach>
		</div>
	</div>




</body>
</html>














