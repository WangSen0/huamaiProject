<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>华迈科技</title>
		<link rel="stylesheet" href="../../css/initial.css" />
		<link rel="stylesheet" href="../../css/header.css" />
		<link rel="stylesheet" href="../../css/log_in.css" />
		<link rel="stylesheet" href="../../css/bootstrap/bootstrap.min.css" />
	</head>

	<body>
		<header class="header">
			<h1>华迈科技</h1>
		</header>

		<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4"></div>
			<div class="outer col-sm-4 col-md-4 col-lg-4">
				<div class="">
					<form id="from" action="/user/login" method="post">
						<div class="mycenter">
							<div class="mysign">
								<div class="col-lg-5 text-center text-info col-sm-5 col-md-5">
									<h2>管理登录</h2>
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
									<input type="text" class="form-control" name="username" id="username" placeholder="请输入账户名" required autofocus />
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
									<input type="password" class="form-control" name="password"  id="password" placeholder="请输入密码" required autofocus />
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
								</div>
								<div class="col-lg-6 col-sm-5 mycheckbox checkbox col-md-5">
									<input type="checkbox" class="col-lg-1 col-sm-1 col-md-1" name="remember">记住密码</input>
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
									<button type="submit" id="btn" class="btn btn-success col-lg-12">登录</button>
								</div>
								<div class="col-lg-6 col-sm-5 col-md-5">
									<div id="info"></div>
								</div>
								${message}
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

		<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

	</body>

</html>