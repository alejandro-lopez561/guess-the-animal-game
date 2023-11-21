package com.example.guesstheanimalgame;
import java.util.List;

public class Game {
    private List<Animal> animales;
    private Player jugador;
    private int puntuacion;

    // Constructor
    public Game(List<Animal> animales, Player jugador, int puntuacion) {
        this.animales = animales;
        this.jugador = jugador;
        this.puntuacion = puntuacion;
    }

    // Métodos para gestionar rondas, puntuaciones, etc.
}
