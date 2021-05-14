<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>Registro Usuario Nuevo</h3>
				</div>
				<div class="card-body">
					<form action="ServletRegistro" method="post">
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-id-card"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="N° de cedula"
								name="cedula">
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Nombre"
								name="nombre">
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Apellido"
								name="apellido">
						</div>
						
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-mail-bulk"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="correo"
								name="correo">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input required type="password" class="form-control" placeholder="clave" name="clave">
						</div>
						<div class="form-group">
							<input type="submit" value="+"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>
				<div class="card-footer">
					<h8>UPS</h8>
					<br>
					<a href= "login.html" color="c6247c">atras</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>