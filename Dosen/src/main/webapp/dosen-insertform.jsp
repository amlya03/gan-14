<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<html>
<head>
<title>Data Dosen</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark" style="background-color: rgb(20, 77, 133);">
	 		<div>
	   			<a href="<%=request.getContextPath()%>/list" 
	   			class="navbar-brand">Administrasi Fakultas</a>
	   		</div>
	   		
	   		<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a href="<%=request.getContextPath()%>/list" class="nav-link">Daftar Data Dosen</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action="insert" method="post">
					<h2>Menambahkan Data Dosen</h2>
					<div class="form-group">
						<label>Kode Dosen</label> <input type="text"
							value="<c:out value='${dosen.id}' />" class="form-control"
							name="id" required="required" placeholder="Masukkan Kode Dosen">
						<span role="alert" id="kodeError" style="color: red">Kode Dosen harus diisi dan hanya berupa angka</span>
					</div>
			
					<div class="form-group">
						<label>Nama Dosen</label> <input type="text"
							value="<c:out value='${dosen.nama}' />" class="form-control"
							name="nama" required="required" placeholder="Masukkan Nama Dosen">
						<span role="alert" id="namaError" style="color: red">Nama Dosen harus diisi</span>
					</div>
			
					<button type="submit" class="btn btn-success">Simpan</button>
				</form>
    		</div>
    	</div>
    </div>
</body>
</html>