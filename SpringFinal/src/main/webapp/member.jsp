<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
			<form action="insert">
				<table>
					<tr>
						<td>���̵�:</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>�н�����:</td>
						<td><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td>�̸�:</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>��ȭ:</td>
						<td><input type="text" name="tel"></td>
					</tr>
					<tr>
						<td colspan="2"><button type="submit">ȸ�� ���� ó��</button></td>
					</tr>
				</table>
			
				
			</form>
		</div>

	</div>




</body>
</html>







