<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Crud</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Registro</h4>
                </div>
                <div class="card-body" >
                    <form method="POST">
                        <label>Identificacion</label>
                        <input type="text" name="ID" class="form-control" value="${lista[0].ID}">
                        <label>Razon social</label>
                        <input type="text" name="RazonSocial" class="form-control" value="${lista[0].RazonSocial}">
                        <label>Telefono</label>
                        <input type="text" name="TELEFONO" class="form-control" value="${lista[0].TELEFONO}">
                        <label>Direccion</label>
                        <input type="text" name="DIRECCION" class="form-control" value="${lista[0].DIRECCION}">
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="index.htm" >Regresar</a>
                    </form>
                </div>
            </div>
            
        </div>
    </body>
</html>
