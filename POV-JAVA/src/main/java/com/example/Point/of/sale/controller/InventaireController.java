package com.example.Point.of.sale.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InventaireController {
    @GetMapping
    public String accueil(){
        return "Bienvenue sur le systeme de gestion d'inventaire !";
    }

    @GetMapping("/produits")
    public String getProduits(){
        return "Liste des produits";
    }

    @GetMapping("/stocks")
    public String getStocks(){
        return "Etat des stocks";
    }

    @GetMapping("/categories")
    public String getCategories(){
        return "Categories disponibles";
    }
}
