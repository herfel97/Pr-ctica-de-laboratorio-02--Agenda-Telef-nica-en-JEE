<%@page import="ec.edu.ups.clases.Telefono"%>
<%@page import="ec.edu.ups.JDBCDAO.JDBCTelefonoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Contacto</title>
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
	<%
	JDBCTelefonoDAO t = new JDBCTelefonoDAO();
	String id = request.getParameter("id");
	Telefono x = t.read(id);
	%>

	<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
		<div
			class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
			<h1 class="h2">Actualizar Contacto</h1>
		</div>
		<div class="d-flex justify-content-center h-100">
			<div class="card">

				<div class="card-body">
					<form action="ServActualizar" method="post">

						<div class="input-group form-group">

							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>
									Cod: </span>
							</div>
							<input readonly type="text" class="form-control"
								value="<%=x.getCodigo()%>" name="codigo">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>
									Numero: </span>
							</div>
							<input type="text" class="form-control"
								value="<%=x.getNumero()%>" name="numero">
						</div>

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i>Tipo:
								</span>
							</div>
							<select class="form-select" aria-label="Default select example"
								name="tipo">
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
							<select class="form-select" aria-label="Default select example"
								name="operador">
								<option selected>Seleccione</option>
								<option value="CLARO">CLARO</option>
								<option value="MOVISTAR">MOVISTAR</option>
								<option value="TUENTI">TUENTI</option>
								<option value="CNT">CNT</option>
							</select>

						</div>

						<div class="form-group">
							<a href="listarTelefonos.jsp" class="btn btn-danger">Cancelar</a>
							<input type="submit" class="btn btn-success" value="ACTUALIZAR"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>

			</div>
		</div>
	</main>

</body>
</html>