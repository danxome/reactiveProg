package com.example.myapplication

class Product{
    var nom:String;
    var marque:String;
    var codeBarre:String;
    var nutriscore:String;
    var urlImage:String;
    var quantite:String;
    val listePaysVendu:List<String>;
    val ingredients:List<String>;
    val substancesAllergenes:List<String>;
    var additifs:List<String>;

    constructor(
        nom: String,
        marque: String,
        codeBarre: String,
        nutriscore: String,
        urlImage: String,
        quantite: String,
        listePaysVendu: List<String>,
        ingredients: List<String>,
        substancesAllergenes: List<String>,
        additifs: List<String>
    ) {
        this.nom = nom
        this.marque = marque
        this.codeBarre = codeBarre
        this.nutriscore = nutriscore
        this.urlImage = urlImage
        this.quantite = quantite
        this.listePaysVendu = listePaysVendu
        this.ingredients = ingredients
        this.substancesAllergenes = substancesAllergenes
        this.additifs = additifs
    }


}