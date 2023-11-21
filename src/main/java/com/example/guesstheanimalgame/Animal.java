package com.example.guesstheanimalgame;

public class Animal {
    // Para esta entrega se deberá subir a la plataforma el código fuente del software
    //correspondiente con las clases que hacen parte del modelo, todas aquellas que incluyan lógica
    //de negocio junto con sus respectivas pruebas unitarias en JUnit.
    //El código fuente debe estar muy bien documentado a través de los comentarios de múltiple
    //línea hechos a cada uno de los miembros de las clases involucradas en el modelo y se debe
    //generar y entregar los correspondientes archivos Javadoc.

    private String nombre;
    private String sonido;
    private String imagenPath;

    public Animal(String nombre, String sonido, String imagenPath) {
        this.nombre = nombre;
        this.sonido = sonido;
        this.imagenPath = imagenPath;
    }

    // Constructor, getters y setters
    public String getSonido() {
        return sonido;
    }

    public String getImagenPath() {
        return imagenPath;
    }
}
