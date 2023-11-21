package com.example.guesstheanimalgame;
import java.util.List;

public class Game {
    private List<Animal> animales;
    private Player jugador;
    private int rondasJugadas;
    private int rondasTotales;
    private int puntajeTotal;

    // Constructor
    public Game(List<Animal> animales, Player jugador) {
        this.animales = animales;
        this.jugador = jugador;
        this.rondasJugadas = 0;
        this.puntajeTotal = 0;
        this.rondasTotales = 10;
    }

    public void iniciarNuevaPartida() {
        // Lógica para iniciar una nueva partida, la idea es gestionar las rondas, puntuaciones y demas
        while (jugador.getVidas() > 0) {
            Round ronda = new Round(animales, jugador);
            ronda.iniciarNuevaRonda();
            gestionarRonda(ronda);
        }
        // La partida ha terminado, por ahora se imprime el puntaje total en consola
        System.out.println("Game Over!. Total Score: " + puntajeTotal);
    }

    private void gestionarRonda(Round ronda) {
        // Lógica para gestionar el resultado de una ronda sencilla
        while (rondasJugadas <= rondasTotales) {
            if (ronda.isRespuestaCorrecta()) {
                // Se van a incrementar los puntos de a 10, por cada respuesta correcta
                puntajeTotal += 10;
            } else {
                // Si la respuesta no es correcta, se resta una vida al jugador
                jugador.restarVida();
            }
            rondasJugadas++;
        }
    }
}
