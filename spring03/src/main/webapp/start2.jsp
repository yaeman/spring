<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	//jquery�� �̿��� �ž�.!!
	//body�� ���� �а� �ڹٽ�ũ��Ʈ�� ��������ּ���.!!
	$(function() {
		//1. btnŬ������ ��ư�� ������,
		$('.btn').click(function() {
			//2. id, pwŬ������ ���� ������ ������.
			idValue = $('.id').val()
			pwValue = $('.pw').val()
			
			//3. id, pw�� Ȯ�� ���
			console.log('�Է��� id>>' + idValue)
			console.log('�Է��� pw>>' + pwValue)
			console.log('�Է��� id�� ���̴�>>' + idValue.length)
			
			if(idValue.length >= 5){
				location.href="insert.do?id=" + idValue + "&pw=" + pwValue
			}else{
				//alert('�Է°� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
				$('.d1').text('�Է°� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
			}
			
			if(pwValue.length >= 5){
				location.href="insert.do?id=" + idValue + "&pw=" + pwValue
			}else{
				//alert('�Է°� pw�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
				$('.d2').text('�Է°� pw�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
			}
		});
		
		
	});
	
	
</script>

</head>

<body>
������ 3�����Դϴ�.<br>
���̵� �Է�: <input type="text" name="id" class="id"><br>
<div class="d1" style="color:red;"></div><br>

�н����� �Է�: <input type="text" name="pw" class="pw"><br>
<div class="d2" style="color:blue;"></div><br>

<input type="button" value="�Է°� üũ" class="btn">
</body>
</html>