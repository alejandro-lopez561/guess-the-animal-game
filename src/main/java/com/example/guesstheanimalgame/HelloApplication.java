package com.example.guesstheanimalgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Start Game!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Animal perro = new Animal("Perro", "Guau", "/path/to/perro.jpg");
        Animal gato = new Animal("Gato", "Miau", "/path/to/gato.jpg");
        Animal elefante = new Animal("Elefante", "Barrito", "/path/to/elefante.jpg");

        // Crear la lista de animales
        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(perro);
        listaAnimales.add(gato);
        listaAnimales.add(elefante);

        // Crear jugador y juego
        Player jugador = new Player("NombreDelJugador");
        Round ronda = new Round(listaAnimales, jugador);

        // Iniciar nueva ronda
        ronda.iniciarNuevaRonda();

        launch();

    }
}