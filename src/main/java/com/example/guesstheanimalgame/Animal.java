package com.example.guesstheanimalgame;

public class Animal {
    private String nombre;
    private String sonido;
    private String imagenPath;

    // Constructor
    public Animal(String nombre, String sonido, String imagenPath) {
        this.nombre = nombre;
        this.sonido = sonido;
        this.imagenPath = imagenPath;
    }

    // Metodos
    public String getSonido() {
        return sonido;
    }

    public String getImagenPath() {
        return imagenPath;
    }
}
