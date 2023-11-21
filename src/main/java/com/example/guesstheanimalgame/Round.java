package com.example.guesstheanimalgame;
import java.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.TimerTask;

public class Round {
    private List<Animal> animales;
    private Player jugador;
    private boolean respuestaCorrecta;
    private Timer temporizador;
    private int tiempoLimite = 10;

    public Round(List<Animal> animales, Player jugador) {
        this.animales = animales;
        this.jugador = jugador;
        this.respuestaCorrecta = false;
        this.temporizador = new Timer();
    }

    // Método para verificar si la respuesta fue correcta
    public boolean isRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    // Método para iniciar una nueva ronda
    public void iniciarNuevaRonda() {
        // Se elige aleatoriamente un animal de la lista
        Animal animal = elegirAnimalAleatorio();

        // Decidir aleatoriamente si mostrar la imagen o el sonido
        boolean mostrarImagen = new Random().nextBoolean();

        if (mostrarImagen) {
            mostrarImagenAnimal(animal);
        } else {
            reproducirSonidoAnimal(animal);
        }

        // Iniciar temporizador para la ronda
        iniciarTemporizador();
    }

    private Animal elegirAnimalAleatorio() {
        // Logica para seleccionar aleatoriamente un animal de la lista
        Random random = new Random();
        int indiceAnimal = random.nextInt(animales.size());
        return animales.get(indiceAnimal);
    }

    private void mostrarImagenAnimal(Animal animal) {
        // Logica para mostrar la imagen del animal en la interfaz, por ahora se imprime en consola
        System.out.println("Animal image: " + animal.getImagenPath());
    }

    private void reproducirSonidoAnimal(Animal animal) {
        // Logica para reproducir el sonido del animal, por ahora se imprime en consola
        System.out.println("Animal sound: " + animal.getSonido());
    }

    private void iniciarTemporizador() {
        // Código para iniciar el temporizador
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                // Lógica para manejar cuando se acaba el tiempo, por ahora se imprime en consola al acabarse los 10 segundos
                System.out.println("Time is Over! You lost 1 life :(");
                respuestaCorrecta = false;
            }
        }, tiempoLimite * 1000);
    }

}
