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
public class Main_StageController implements Initializable, ControlledScreen {

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
    private void goToNewGamePopUp(ActionEvent event){
       myController.setScreen(Game.NEWGAME_SCREEN);
    }
    
    @FXML
    private void goToContinueStage(ActionEvent event){
        myController.setScreen(Game.CONTINUE_SCREEN);
    }
    
}