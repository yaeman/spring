<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('.fruit').keyup(function() {
			correct = 'apple'
			
			fruitValue = $('.fruit').val()
			if(fruitValue== correct){
				$('.d1').text('����.')
			}else{
			//alert('�Է°� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
				$('.d1').text('����.')
			} // else end.
		});	//keyup end.
	});	// $ end.
	
	
</script>

</head>
<body>
	���� ���� �̸� �Է�: <input type="text" name="fruit" class="fruit"><br>
	<div class="d1" style="color:red;"></div><br>
</body>
</html>