<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>

	<main>
        <section class="container">
            <article class="container row">
                <div class="col-md-3">
                    <a href=""><i class="fas fa-user" id="icono-usuario"></i></a>
                </div>
                <div class="col-md-9">
                    <h2 id="nombre-usuario">MARIO GONZALEZ</h2>
                    <h4 id="nombre-especialidad">DESARROLLADOR BACKEND</h4>
                </div>
            </article>
            <article class="container row">
                <div class="col-6 col-md-6">

                </div>
                <div class="col-3 col-md-3 boton-modificar-contraseña">
                    <a href="modificar-contraseña" class="btn btn-primary" id="boton-modificar-contraseña">MODIFICAR CONTRASEÑA</a>
                </div>
                <div class="col-3 col-md-3">
                    <label for="fecha-cumpleaños">CUMPLEAÑOS</label>
                    <input type="text" class="form-control" placeholder="10/11/1999">
                </div>
            </article>
            <article class="container row">
                <form action="" method="post">
                    <div class="col-12 col-md-12 form-group">
                        <label for="biografia">BIOGRAFIA</label>
                        <input type="text" id="biografia" class="form-control">
                    </div>
                    
                    <div class="col-6 col-md-6 form-group">
                        <label for="email">EMAIL</label>
                        <input type="email" id="email" class="form-control">
                    </div>
                    <div class="col-6 col-md-6 form-group">
                        <label for="telefono">TELEFONO</label>
                        <input type="text" id="telefono" class="form-control">
                    </div>
                   
                    <div class="col-4 col-md-4 form-group">
                        <label for="pais">PAIS</label>
                        <input type="text" id="pais" class="form-control">
                    </div>
                    <div class="col-4 col-md-4 form-group">
                        <label for="provincia">PROVINCIA</label>
                        <input type="text" id="provincia" class="form-control">
                    </div>
                    <div class="col-4 col-md-4 form-group">
                        <label for="ciudad">CIUDAD</label>
                        <input type="text" id="ciudad" class="form-control">
                    </div>

                    <div class="boton-guardar">
                        <button type="submit" class="btn btn-primary" id="boton-guardar">GUARDAR</button>
                    </div> 

                </form>
            </article>
        </section>
    </main>
    
<%@include file="footer.jsp" %>