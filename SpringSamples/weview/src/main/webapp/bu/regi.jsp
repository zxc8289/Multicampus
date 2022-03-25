<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weview - 회원가입</title>
<link
	href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding|Noto+Sans+KR&display=swap"
	rel="stylesheet">
<style>
* {
	margin: 0;
	padding: 0;
}

h1 {
	text-align: center;
	margin: 55px 0 35px 0;
}

h3 {
	margin-left: 15%;
	margin-bottom: 10px;
}

#btn1 {
	text-align: center;
	margin: 55px 0 35px 0;
}

#sub:hover {
	background-color: #316aff;
	color: white;
}

#sub {
	border: 2px solid #316aff;
	border-radius: 50px;
	padding: 10px 70px;
	text-decoration: inherit;
	font-weight: 30;
	font-size: 20px;
	color: #316aff;
	-webkit-transition-duration: 200ms;
	transition-duration: 200ms;
}

.ta {
	border-top: 2px solid #999999;
	border-bottom: 2px solid #999999;
	width: 70%;
	margin: auto;
}

.ta th, .ta td {
	height: 40px;
	border-top: 1px solid #cccccc;
	border-left: 1px solid #cccccc;
	font-size: 13px;
}

.ta th:first-child {
	border-left: none;
}

.ta tr:first-child th {
	border-top: none;
}

.ta tr:first-child td {
	border-top: none;
}

.ta th {
	padding: 10px 10px 10px 55px;
	text-align: left;
	font-size: 13px;
	color: #222222;
}

.ta td {
	padding: 10px 55px;
	color: #777777;
}

.ab {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
}

.tel {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-left: 5px;
}

.m {
	margin-left: 5px;
}

.bo {
	width: 60px;
	height: 25px;
	padding-bottom: 5px;
}

.box {
	width: 90px;
	height: 25px;
	padding-bottom: 5px;
}

.ap {
	vertical-align: middle;
	margin: 0 10px 0 10px;
	border: 1px solid rgb(190, 186, 186);
	background-color: #dddcdc;
	border-radius: 50px;
	padding: 2px 6px;
}

.bb {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-top: 10px;
}

.ac {
	padding: 0 20px;
	width: 100%;
	height: 25px;
	font-size: 13px;
	color: #373737;
	border: 1px solid #cccccc;
	background: #ffffff;
	transition: all 0.5s;
	vertical-align: middle;
	line-height: 38px;
	box-sizing: border-box;
	margin-right: 10px;
}

.app {
	text-decoration: none;
	color: black;
	font-family: 'Noto Sans KR', sans-serif;
}

.re {
	text-decoration: none;
	border: 2px solid gray;
	padding: 5px 20px;
	border-radius: 50px;
	color: black;
}

.h4 {
	text-align: center;
	margin-top: 20px;
	margin-left: 800px;
}
</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>

	<h1>회원가입</h1>
	<h3 class="h3">입력사항</h3>
	<form id="frm" action="regiAf.do" method="post" enctype="multipart/form-data">
		<table class="ta">
			<caption></caption>
			<colgroup>
				<col style="width: 200px;">
				<col>
			</colgroup>
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" class="ab" name="id" id="id"
						style="width: 150px"> <span class="ap"><a href="#"
							id="btn" class="app">아이디 중복</a></span><span class="info">아이디 입력 후
							<strong>'아이디 중복확인'</strong> 버튼을 클릭해주세요
					</span> <br>
						<p id="idcheck" style="font-size: 12px; margin-top: 10px"></p></td>
				</tr>
				<tr>
					<th>패스워드</th>
					<td><input type="password" class="ac" name="pwd" id="pwd"
						style="width: 150px;"><span class="info">비밀번호는
							4~10자리로 입력해주시기 바랍니다.</span></td>

				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" id="name" class="ab"
						style="width: 150px;"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email" id="email" class="ab"
						style="width: 150px;"></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input type="text" name="nickname" id="nickname" class="ab"
						style="width: 150px;">
					</td>
				</tr>
				<tr>
					<th>프로필 사진</th>
					<td><input type="file" name="picture" id="profile"
						style="width: 150px;">
					</td>
				</tr>
				
			</tbody>
		</table>
		<h4 class="h4">
			<a href="login.do" class="re">돌아가기</a>
		</h4>
		<h3 id="btn1">
			<button type="button" onclick="account()" id="sub">가입하기</button>
		</h3>
	</form>
	<script type="text/javascript">
		$(document).ready(function() {

			$("#btn").click(function() {
				//	alert('btn click');
				//	let id = $("#id").val();
				//	alert(id);

				// id 확인 -> ajax
				$.ajax({
					url : "idcheck.do",
					type : "post",
					data : {
						id : $("#id").val()
					},
					success : function(msg) {
						//	alert('success');
						//	alert(msg);

						if (msg == "YES") {
							$("#idcheck").css("color", "#0000ff");
							$("#idcheck").html("사용할 수 있는 아이디입니다");
						} else {
							$("#idcheck").css("color", "#ff0000");
							$("#idcheck").html("사용 중인 아이디입니다");
							$("#id").val("");
						}
					},
					error : function() {
						alert('error');
					}
				});
			});
		});

		function account() {
			//	alert('account');

			if ($("#id").val() == '') {
				alert('아이디를 입력해 주십시오');
			} else if ($("#pwd").val() == '') {
				alert('패스워드를 입력해 주십시오');
			} else if ($("#name").val() == '') {
				alert('이름를 입력해 주십시오');
			} else if ($("#email").val() == '') {
				alert('이메일을 입력해 주십시오');
			} else if ($("#nickname").val() == '') {
				alert('닉네임을 입력해 주십시오');
			} else {
				$("#frm").submit();
			}
		}
	</script>




</body>
</html>







