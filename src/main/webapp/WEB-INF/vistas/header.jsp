<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/all.css">
    <link rel="stylesheet" href="css/estilos.css">
    <link rel="stylesheet" href="css/estilos-promociones.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- En la etiqueta meta que posee el content, todo el contenido largo es el Id del cliente el cual lo configuramos desde
    la consola de google -->
     
     <meta name="google-signin-client_id" content="25726419475-rm6t8p2suuin4vef4aoja01cicq9iij9.apps.googleusercontent.com">
       <script src="https://apis.google.com/js/platform.js" async defer></script>
     <meta name="google-signin-scope" content="profile email">

    <title>Perfil</title>

</head>
<body>
    <header class="row">
          
        <div class="col-3 col-logo">
            <p class="logo">LOGO</p>
        </div>
        <div class="col-6">

        </div>
            
        <div class="col-3 col-iconos">
            <i class="fas fa-search"></i>
            <a href="https://www.facebook.com/"><i class="fab fa-facebook-f"></i></a>
            <a href="https://www.whatsapp.com/?lang=es"><i class="fab fa-whatsapp"></i></a>
            <a href="https://www.instagram.com/ "><i class="fab fa-instagram"></i></a>

            <a href="login"><i class="fas fa-sign-in-alt"></i></a></i>
        </div>

        <nav class="navegacion-superior">
                <ul>
                <li><a href="index" class="opciones-menu">Home</a></li>
                <li><a href="perfil" class="opciones-menu">Perfil</a></li>
                <li><a href="proyectos" class="opciones-menu">Proyectos</a></li>
                <li><a href="votaciones" class="opciones-menu">Votaciones</a></li>
                <li><a href="contacto" class="opciones-menu">Contacto</a></li>
                <li><a href="nosotros" class="opciones-menu">Sobre Nosotros</a></li>
                </ul>
        </nav>

            <div id="boton-responsive" >
            <button id="button-responsive" class="bg-dark"><i class="fas fa-bars"></i></button>
            </div>

            <nav id="navegacion-responsive" class="navegacion">
            <ul>
                <li><a href="inicio">Inicio</a></li>
                <li><a href="perfil">Perfil</a></li>
                <li><a href="proyectos">Proyectos</a></li>
                <li><a href="votaciones">Votaciones</a></li>
                <li><a href="contacto">Contacto</a></li>
                <li><a href="nosotros">Sobre Nosotros</a></li>
            </ul>
            </nav>
</header>