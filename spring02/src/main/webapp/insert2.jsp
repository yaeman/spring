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
	아이디 <input type="text" name='id'><br>
	패스워드<input type="text" name='title'><br>
	이름 <input type="text" name='content'><br>
	전화번호 <input type="text" name='writer'><br>
	<input type="submit" value="서버로 전송">
</form>	
<form action="select">
	아이디 <input type="text" name='id'><br>
	<input type="submit" value="id로 검색">
</form>
<hr color="red">
<form action="delete2">
	아이디 <input type="text" name='id'><br>
	<input type="submit" value="id로 삭제">
</form>
<hr color="red">	
</body>
</html>