<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<main>
        <section class="container">
            
            <article class="col-12 contenedor-form-registro border">
                <form:form action="registrar-usuario" method="post" modelAttribute="usuario">
                    <div class="text-center">
                        <h2>REGISTRO DE USUARIO</h2>
                    </div>
                    <div class="col-12 col-md-12 form-group">
                        <label for="nombre">NOMBRE COMPLETO</label>
                        <form:input path="nombre" id="nombre" type="text" class="form-control" />
                    </div>

                    <div class="col-12 col-md-12 form-group">
                        <label for="tipo-usuario">TIPO USUARIO</label>
                        <form:input type="text" path="tipo-usuario" list="tipo-usuario" class="form-control" />
                    
                    <datalist id="tipo-usuario">
                        <label for="tipo-usuario">TIPO USUARIO</label>
                        <option value="Desarrollador">Desarrollador</option>
                        <option value="Recluiter IT">Recluiter IT</option>
                        <option value="Empresa">Empresa</option>
                    </datalist>
                    </div>
                    
                    <div class="col-6 col-md-6 form-group">
                        <label for="email">EMAIL</label>
                        <form:input path="email" id="email" type="email" class="form-control" />
                    </div>

                    <div class="col-6 col-md-6 form-group">
                        <label for="contraseña">CONTRASEÑA</label>
                        <form:input path="password" id="contraseña" type="password" class="form-control" />
                    </div>            
                   
                    <div class="col-4 col-md-4 form-group">
                        <label for="pais">PAIS</label>
                        <form:input path="pais" id="pais" type="text" class="form-control" />
                    </div>
                    <div class="col-4 col-md-4 form-group">
                        <label for="provincia">PROVINCIA</label>
                        <form:input path="provincia" id="provincia" type="text" class="form-control" />
                    </div>
                    <div class="col-4 col-md-4 form-group">
                        <label for="ciudad">CIUDAD</label>
                        <form:input path="ciudad" id="ciudad" type="text"  class="form-control" />
                    </div>

                    <div class="boton-guardar">
                        <button type="submit" class="btn btn-primary" id="boton-guardar">REGISTRARME</button>
                    </div> 

                </form:form>
            </article>
            
        </section>
    </main>
    