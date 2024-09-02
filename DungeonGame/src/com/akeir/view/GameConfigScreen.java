package com.akeir.view;

import com.akeir.base.SceneBase;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.akeir.view.builder.GameConfigScreenBuilder;

@SuppressWarnings("rawtypes")
public class GameConfigScreen extends SceneBase {

    private Label lbGameAttributes;
    private Label lbNumberOfPlayers;
    private TextField txtNumberOfPlayers;
    private Label lbNumberOfLevels;
    private TextField txtNumberOfLevels;
    private Label lbDifficult;
    private ComboBox cbDifficult;
    private Label lbPlayerHandicap;
    private TextField txtPlayerHandicap;

    private Label lbGameScenario;
    private Label lbLevelsQuantity;
    private ComboBox cbLevelsQuantity;
    private Label lbRoomsQuantity;
    private ComboBox cbRoomsQuantity;
    private Label lbPlayersQuantity;
    private ComboBox cbPlayersQuantity;

    public GameConfigScreen()
    {
        this.builder = new GameConfigScreenBuilder(this);
        this.executeBuild();
        this.setElementsAction();
    }

    @Override
    protected void setElementsAction() {

    }

    public Label getLbGameAttributes()
    {
        return lbGameAttributes;
    }

    public void setLbGameAttributes(Label lbGameAttributes)
    {
        this.lbGameAttributes = lbGameAttributes;
    }

    public Label getLbNumberOfPlayers()
    {
        return lbNumberOfPlayers;
    }

    public void setLbNumberOfPlayers(Label lbNumberOfPlayers)
    {
        this.lbNumberOfPlayers = lbNumberOfPlayers;
    }

    public TextField getTxtNumberOfPlayers()
    {
        return txtNumberOfPlayers;
    }

    public void setTxtNumberOfPlayers(TextField txtNumberOfPlayers)
    {
        this.txtNumberOfPlayers = txtNumberOfPlayers;
    }

    public Label getLbNumberOfLevels()
    {
        return lbNumberOfLevels;
    }

    public void setLbNumberOfLevels(Label lbNumberOfLevels)
    {
        this.lbNumberOfLevels = lbNumberOfLevels;
    }

    public TextField getTxtNumberOfLevels()
    {
        return txtNumberOfLevels;
    }

    public void setTxtNumberOfLevels(TextField txtNumberOfLevels)
    {
        this.txtNumberOfLevels = txtNumberOfLevels;
    }

    public Label getLbDifficult()
    {
        return lbDifficult;
    }

    public void setLbDifficult(Label lbDifficult)
    {
        this.lbDifficult = lbDifficult;
    }

    public ComboBox getCbDifficult()
    {
        return cbDifficult;
    }

    public void setCbDifficult(ComboBox cbDifficult)
    {
        this.cbDifficult = cbDifficult;
    }

    public Label getLbPlayerHandicap()
    {
        return lbPlayerHandicap;
    }

    public void setLbPlayerHandicap(Label lbPlayerHandicap)
    {
        this.lbPlayerHandicap = lbPlayerHandicap;
    }

    public TextField getTxtPlayerHandicap()
    {
        return txtPlayerHandicap;
    }

    public void setTxtPlayerHandicap(TextField txtPlayerHandicap)
    {
        this.txtPlayerHandicap = txtPlayerHandicap;
    }

    public Label getLbGameScenario()
    {
        return lbGameScenario;
    }

    public void setLbGameScenario(Label lbGameScenario)
    {
        this.lbGameScenario = lbGameScenario;
    }

    public Label getLbLevelsQuantity()
    {
        return lbLevelsQuantity;
    }

    public void setLbLevelsQuantity(Label lbLevelsQuantity)
    {
        this.lbLevelsQuantity = lbLevelsQuantity;
    }

    public ComboBox getCbLevelsQuantity()
    {
        return cbLevelsQuantity;
    }

    public void setCbLevelsQuantity(ComboBox cbLevelsQuantity)
    {
        this.cbLevelsQuantity = cbLevelsQuantity;
    }

    public Label getLbRoomsQuantity()
    {
        return lbRoomsQuantity;
    }

    public void setLbRoomsQuantity(Label lbRoomsQuantity)
    {
        this.lbRoomsQuantity = lbRoomsQuantity;
    }

    public ComboBox getCbRoomsQuantity()
    {
        return cbRoomsQuantity;
    }

    public void setCbRoomsQuantity(ComboBox cbRoomsQuantity)
    {
        this.cbRoomsQuantity = cbRoomsQuantity;
    }

    public Label getLbPlayersQuantity()
    {
        return lbPlayersQuantity;
    }

    public void setLbPlayersQuantity(Label lbPlayersQuantity)
    {
        this.lbPlayersQuantity = lbPlayersQuantity;
    }

    public ComboBox getCbPlayersQuantity()
    {
        return cbPlayersQuantity;
    }

    public void setCbPlayersQuantity(ComboBox cbPlayersQuantity)
    {
        this.cbPlayersQuantity = cbPlayersQuantity;
    }
}
