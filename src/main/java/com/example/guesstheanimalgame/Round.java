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
        // Código para seleccionar aleatoriamente un animal de la lista
        // Puedes utilizar la clase Random para esto
        Random random = new Random();
        int indiceAnimal = random.nextInt(animales.size());
        return animales.get(indiceAnimal);
    }

    private void mostrarImagenAnimal(Animal animal) {
        // Código para mostrar la imagen del animal en la interfaz
        // Puedes utilizar JavaFX para mostrar la imagen
        System.out.println("Mostrar imagen del animal: " + animal.getImagenPath());
    }

    private void reproducirSonidoAnimal(Animal animal) {
        // Código para reproducir el sonido del animal
        // Puedes utilizar JavaFX o alguna biblioteca para reproducir audio
        System.out.println("Reproducir sonido del animal: " + animal.getSonido());
    }

    private void iniciarTemporizador() {
        // Código para iniciar el temporizador
        // Puedes utilizar la clase TimerTask y Timer para esto
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                // Lógica para manejar cuando se acaba el tiempo
                System.out.println("¡Tiempo agotado!");
                // Puedes implementar la lógica para reducir vidas o marcar la respuesta como incorrecta
            }
        }, tiempoLimite * 1000);
    }

}
