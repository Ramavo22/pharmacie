<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion Pharmacie</title>
    <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="#">Pharmacie</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownInsertion" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Insertion
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownInsertion">
                        <a class="dropdown-item" href="insert/insertLaboratoire.jsp">Laboratoire</a>
                        <a class="dropdown-item" href="insert/insertTypeProduit.jsp">Type Produit</a>
                        <a class="dropdown-item" href="insert/insertMaladie.jsp">Maladie</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownRecherche" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Recherche
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownRecherche">
                        <a class="dropdown-item" href="recherche/rechercheProduit.jsp">Produit</a>
                        <a class="dropdown-item" href="recherche/rechercheMaladie.jsp">Maladie</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
