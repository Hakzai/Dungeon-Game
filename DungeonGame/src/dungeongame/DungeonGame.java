/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

import akeir.base.view.sample.TestScene;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.akeir.view.GameConfigScreen;

/**
 *
 * @author Codeiro
 */
public class DungeonGame extends Application {
    
    @Override
    public void start(Stage stage) {
        Parent root = new GameConfigScreen();
//        Parent root = new TestScene();

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
