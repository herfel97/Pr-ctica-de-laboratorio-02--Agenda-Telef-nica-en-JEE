<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<!--Custom styles-->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="/docs/4.1/assets/img/favicons/favicon.ico">

<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="index.css" rel="stylesheet">

</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Agenda de: <%
 	out.println(session.getAttribute("usuario"));
 %>
		</a>
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link" href="logout">Logout</a>
			</li>
		</ul>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active"
							href="index.jsp"> <span data-feather="home"></span> <svg
									xmlns="http://www.w3.org/2000/svg" width="24" height="24"
									viewBox="0 0 24 24" fill="none" stroke="currentColor"
									stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
									class="feather feather-home">
									<path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
									<polyline points="9 22 9 12 15 12 15 22"></polyline></svg> Home <span
								class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link"
							href="registrarTelefono.jsp"> <span data-feather="file"></span>
								Registro
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="shopping-cart"></span> Eliminar
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="shopping-cart"></span> Buscar
						</a></li>
						<li class="nav-item"><a class="nav-link"
							href="listarTelefonos.jsp"> <span data-feather="users"></span>
								Listar
						</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
		<div
			class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
			<h1 class="h2">Nuevo Contacto</h1>
		</div>
		<div class="d-flex justify-content-center h-100">
			<div class="card">

				<div class="card-body">
					<form action="ServRegistroContactos" method="post">

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>
									Numero: </span>
							</div>
							<input type="text" class="form-control"
								placeholder="00000
                            " name="numero">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>Tipo:
								</span>
							</div>
							<select class="form-select" aria-label="Default select example" name="tipo">
								<option selected>Seleccione</option>
								<option value="FIJO">FIJO</option>
								<option value="MOVIL">MOVIL</option>
							</select>
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>Operador:
								</span>
							</div>
							<select class="form-select" aria-label="Default select example" name="operador">
								<option selected>Seleccione</option>
								<option value="CLARO">CLARO</option>
								<option value="MOVISTAR">MOVISTAR</option>
								<option value="TUENTI">TUENTI</option>
								<option value="CNT">CNT</option>
							</select>

						</div>
						<div class="form-group">
							<input type="submit" value="ADD (+)"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>

			</div>
		</div>
		</div>

		<canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>
</body>
</html>