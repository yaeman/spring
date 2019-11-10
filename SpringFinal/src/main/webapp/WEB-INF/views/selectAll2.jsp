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
					<th>���̵�</th>
					<th>����</th>
					<th>����</th>
					<th>����</th>
					<th>��ǥ�̹���</th>
				</tr>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.id}</td>
						<td>
						<a href="select2?id=${dto.id}">${dto.title}</a>
						</td>
						<td>${dto.content}</td>
						<td>${dto.price}</td>
						<td>
						<img width=200 height=200 src=resources/img/${dto.img}>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</div>




</body>
</html>














