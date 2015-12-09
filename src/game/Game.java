/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Amanuel
 */

public class Game extends Application {
    
     public static final String MAIN_SCREEN = "Main_Stage"; 
     public static final String MAIN_SCREEN_FXML = "Main_Stage.fxml"; 
     
     public static final String NEWGAME_SCREEN = "NewGame_Popup"; 
     public static final String NEWGAME_SCREEN_FXML = "NewGame_Popup.fxml";
     
     public static final String GAME_SCREEN = "Game_Stage"; 
     public static final String GAME_SCREEN_FXML = "Game_Stage.fxml";
     
     public static final String CONTINUE_SCREEN = "Continue_Game"; 
     public static final String CONTINUE_SCREEN_FXML = "Continue_Game.fxml";
     
    @Override
    public void start(Stage primaryStage) {
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Game.MAIN_SCREEN, Game.MAIN_SCREEN_FXML);
        mainContainer.loadScreen(Game.NEWGAME_SCREEN, Game.NEWGAME_SCREEN_FXML);
        mainContainer.loadScreen(Game.GAME_SCREEN, Game.GAME_SCREEN_FXML);
        mainContainer.loadScreen(Game.CONTINUE_SCREEN, Game.CONTINUE_SCREEN_FXML);
        
        mainContainer.setScreen(Game.MAIN_SCREEN);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
