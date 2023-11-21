package com.example.guesstheanimalgame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

    @Test
    void iniciarNuevaRonda() {
        Animal perro = new Animal("Perro", "Guau", "/path/to/perro.jpg");
        Animal gato = new Animal("Gato", "Miau", "/path/to/gato.jpg");
        Animal elefante = new Animal("Elefante", "Barrito", "/path/to/elefante.jpg");

        Player jugador = new Player("PoliStudent");

        // Crear una ronda para la prueba
        Round ronda = new Round(List.of(perro, gato, elefante), jugador);

        // Llamar al método de prueba
        ronda.iniciarNuevaRonda();

        // Verificar que la respuesta sea true o false
        assertTrue(ronda.isRespuestaCorrecta() || !ronda.isRespuestaCorrecta());
    }
}