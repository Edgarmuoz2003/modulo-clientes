<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Modulo Clientes</title>
    </head>
    

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="agregar.htm">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>RAZON SOCIAL</th>
                                <th>TELEFONO</th>
                                <th>DIRECCION</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="datos" items="${lista}">
                            <tr>
                                <td>${datos.ID}</td>
                                <td>${datos.RazonSocial}</td>
                                <td>${datos.TELEFONO}</td>
                                <td>${datos.DIRECCION}</td>
                                <td>
                                    <a href="editar.htm?id=${datos.ID}" class="btn btn-warning" >Editar</a>
                                    <a class="btn btn-danger" >Eliminar</a> 
                                </td>
                            </tr>
                        </c:forEach>    
                        </tbody>
                    </table>

                </div>
            </div>
            
        </div>
            
        
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
