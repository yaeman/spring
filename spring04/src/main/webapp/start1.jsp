<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() { //body���� �ν��ϰ�, �ڹ� ��ũ��Ʈ���ּ���.
		$('.btn1').click(function() {
			console.log('�̹��� �߰� ��ư Ŭ����.')
			$('.d1').append('<img src=resources/img/school.jpg width=150 height=150>')
		});
	
		$('.btn2').click(function() {
			console.log('�ؽ�Ʈ �߰� ��ư Ŭ����.')
			$('.d1').append('<font color=blue>���� �߰���.</font>')
		});
		
	});
</script>
</head>
<body>
<input type="button" class="btn1" value="�̹��� �߰�">
<input type="button" class="btn2" value="�ؽ�Ʈ �߰�"><br>

<div class="d1"> </div>



</body>
</html>