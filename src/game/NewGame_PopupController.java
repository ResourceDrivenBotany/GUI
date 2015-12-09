package game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Angie
 */
public class NewGame_PopupController implements Initializable , ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goToMainStage(ActionEvent event){
       myController.setScreen(Game.MAIN_SCREEN);
    }
    @FXML
    private void goToGameStage(ActionEvent event){
       myController.setScreen(Game.GAME_SCREEN);
    }
}