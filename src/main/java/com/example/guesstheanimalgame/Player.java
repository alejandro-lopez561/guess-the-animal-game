package com.example.guesstheanimalgame;

public class Player {
    private String nombre;
    private int puntuacion;
    private int vidas;

    public Player(String nombre) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void restarVida() {
        if (vidas > 0) {
            vidas--;
        }
    }
}
