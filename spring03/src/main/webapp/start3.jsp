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
		$('.id').keyup(function() {
			
			idValue = $('.id').val()
			if(idValue.length >= 5){
				$('.d1').text('�Է��� ���ڰ� �����մϴ�.')
			}else{
			//alert('�Է°� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
				$('.d1').text('�Է°� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
			} // else end.
		});	//keyup end.
	});	// $ end.
	
	
</script>

</head>
<body>
	���̵� �Է�: <input type="text" name="id" class="id"><br>
	<div class="d1"></div>
</body>
</html>