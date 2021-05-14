<!DOCTYPE html>
<%@page import="ec.edu.ups.clases.Telefono"%>
<%@page import="java.util.LinkedList"%>
<%@page import="ec.edu.ups.JDBCDAO.JDBCTelefonoDAO"%>
<html>
<head>
<title>Buscar Telefono</title>
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


<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/dashboard/">



<!-- Bootstrap core CSS -->
<link href="/docs/5.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Favicons -->
<link rel="apple-touch-icon"
	href="/docs/5.0/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/5.0/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="/docs/5.0/assets/img/favicons/safari-pinned-tab.svg"
	color="#7952b3">
<link rel="icon" href="/docs/5.0/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">

</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Agenda
			Telefonica </a>
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="nav-link" href="#">Logout</a>
			</li>
		</ul>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-2 d-none d-md-block bg-light sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active"
							href="index.jsp"> <span data-feather="home"></span> Home <span
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
	<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">

		<h2>Lista de Telefonos</h2>
		<div class="table-responsive">
			<table class="table table-striped table-sm">
				<thead>
					<tr>
						<th>Codigo</th>
						<th>Numero</th>
						<th>Tipo</th>
						<th>Operador</th>
					</tr>
				</thead>

				<%
					LinkedList<Telefono> res = (LinkedList<Telefono>) session.getAttribute("listaTel");

				for (int i = 0; i < res.size(); i++) {
				%>
				<tr>
					<%
						out.println("<td>" + res.get(i).getCodigo());
					out.println("<td>" + res.get(i).getNumero() + "</td>");
					out.println("<td>" + res.get(i).getTipo() + "</td>");
					out.println("<td>" + res.get(i).getOperadora() + "</td>");
					%>
					<%
						}
					%>
				
			</table>
		</div>

		<a class="btn btn-warning" href="buscarTelefono.jsp">Nueva
			Busqueda</a>
	</main>
</body>
</html>