package com.akeir.view.controller;

import akeir.base.view.controller.ControllerBase;
import akeir.scene.dark.layout.AnchorPaneDark;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GameConfigScreenController extends ControllerBase{

    protected GameConfigScreenController() { }

    @Override
    public void windowOpener(Pane pane) {

    }

    public static void openGameWindow(Stage callerScreen)
    {
        Pane root = new AnchorPaneDark();

        callerScreen.hide();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("TELA DE JOGO");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setScene(scene);
        stage.showAndWait();

//        callerScreen.show(); // TOGGLE COMMENT == CLOSE GAME SCREEN OR NOT
    }
}
