/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeongame;

import test.character.Zaharis;
import com.akeir.characters.model.Character;
import com.akeir.items.example.LifePotion;
import com.akeir.items.model.Item;
import com.akeir.monsters.model.Monster;
import com.akeir.rooms.example.DeathRoom;
import com.akeir.rooms.model.Room;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import test.monster.Apprentice;

/**
 *
 * @author Codeiro
 */
public class FXMLMainController implements Initializable {
    
    Character playerChar;
    Monster npcMonster;
    Room deathRoom;
    Item lifePotion; 
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("START GAME");
        
        if(null == playerChar)
            playerChar = new Zaharis();
        
        playerChar.speak();
        
        if(null == deathRoom)
            deathRoom = new DeathRoom();
        
        deathRoom.speak();
        
        if(null == npcMonster)
            npcMonster = new Apprentice();
        
        npcMonster.speak();
        
        if(null == lifePotion)
            lifePotion = new LifePotion();
        
        lifePotion.consume();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
