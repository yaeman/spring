<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insert2">
	���̵� <input type="text" name='id'><br>
	�н�����<input type="text" name='title'><br>
	�̸� <input type="text" name='content'><br>
	��ȭ��ȣ <input type="text" name='writer'><br>
	<input type="submit" value="������ ����">
</form>	
<form action="select">
	���̵� <input type="text" name='id'><br>
	<input type="submit" value="id�� �˻�">
</form>
<hr color="red">
<form action="delete2">
	���̵� <input type="text" name='id'><br>
	<input type="submit" value="id�� ����">
</form>
<hr color="red">	
</body>
</html>