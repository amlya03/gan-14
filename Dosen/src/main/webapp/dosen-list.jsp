<%@ page import="com.prodemy.bean.Dosen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Dosen</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<header>
	<nav class="navbar navbar-dark" style="background-color: rgb(20, 77, 133);">
	  <div class="container-fluid">
	    <h1 class="navbar-brand">Administrasi Fakultas</h1>
		<form class="d-flex">
	      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
	      <button class="btn btn-outline-success" type="submit">Search</button>
	    </form>
  	</div>
	</nav>
	</header>
	<br>
	<div class="row">
		<div class="container">
			<h3 class="text-center">Daftar Data Dosen</h3>
			<hr>
			<div class="container text-right">
				<a href="new" class="btn btn-success">Menambahkan Data Dosen</a>
				<a href="list" class="btn btn-success">Menampilkan Seluruh Data Dosen</a>
			</div>
			<br>
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th>Kode Dosen</th>
						<th>Nama Dosen</th>
						<th></th>
					</tr>		
				</thead>
				<tbody>
					<c:forEach var="dosen" items="${daftarDosen}">
						<tr>
							<td><c:out value="${dosen.id}" /></td>
							<td><c:out value="${dosen.nama}" /></td>
							<td>
								<a href="edit?id=<c:out value="${dosen.id}" />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="delete?id=<c:out value="${dosen.id}" />" onclick="return confirm('Anda yakin menghapus data ini ?')" style="color: red">Hapus</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>