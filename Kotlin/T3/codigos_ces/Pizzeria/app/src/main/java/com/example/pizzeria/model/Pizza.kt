package com.example.pizzeria.model

class Pizza(
    var nombre: String,
    var info: String,
    var ingredientes: ArrayList<Ingrediente>,
    var estado: Boolean,
    var imagen: Int
) {

    var precio: Double = 0.0

    init {
        ingredientes.forEach {
            precio += it.precio
        }
    }
}