<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

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
	<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Agenda
		Telefonica </a>

	<ul class="navbar-nav px-3">
		<li class="nav-item text-nowrap"><a class="nav-link"
			href="logout">Logout</a></li>
	</ul>
	</nav>

	<div class="container-fluid">
		<br>
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
			<div class="sidebar-sticky">
				<ul class="nav flex-column">
					<li class="nav-item"><a class="nav-link active"
						href="index.jsp"> <span data-feather="home"></span>Home<span
							class="sr-only">(current)</span>
					</a></li>

					<li class="nav-item"><a class="nav-link"
						href="registrarTelefono.jsp"> <span data-feather="file"></span>
							Registro
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="buscarTelefono.jsp"> <span data-feather="shopping-cart"></span>
							Buscar
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
	<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4"> <divclass
		="d-flexjustify-content-betweenflex-wrapflex-md-nowrapalign-items-centerpt-3pb-2mb-3border-bottom">

	<form action="EmailSendingServlet" method="post">
		<table border="0" width="35%" align="center">
			
			<tr>
				<td width="50%">Destinatario:</td>
				<td><input type="text" name="recipient" size="50" /></td>
			</tr>
			<tr>
				<td>Asunto</td>
				<td><input type="text" name="subject" size="50" /></td>
			</tr>
			<tr>
				<td>Contenido</td>
				<td><textarea rows="10" cols="39" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Send" /></td>
			</tr>
		</table>

	</form>
	</divclass>
</body>
</html>