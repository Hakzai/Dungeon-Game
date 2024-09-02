package com.akeir.view.builder;

import akeir.base.view.builder.BuilderBase;
import com.akeir.game.GameAttributes;
import com.akeir.view.GameConfigScreen;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class GameConfigScreenBuilder extends BuilderBase {

    private GameConfigScreen scene;

    public GameConfigScreenBuilder(AnchorPane scene)
    {
        if(scene instanceof GameConfigScreen)
        {
            this.scene = (GameConfigScreen) scene;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void doBuild()
    {
        super.doBuild();

        this.scene.getLbGameAttributes().setId("lbGameAttributes");
        this.scene.getLbGameAttributes().setText("Game Attributes");
        this.scene.getLbGameAttributes().setStyle("-fx-text-fill: White;");
        this.scene.getLbGameAttributes().setLayoutX(10.0);
        this.scene.getLbGameAttributes().setLayoutY(10.0);
        this.scene.getLbGameAttributes().setPrefWidth(100.0);
        this.scene.getLbGameAttributes().setPrefHeight(30.0);
        this.scene.getLbGameAttributes().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbGameAttributes());

        this.scene.getLbNumberOfPlayers().setId("lbNumberOfPlayers");
        this.scene.getLbNumberOfPlayers().setText("Number of Players");
        this.scene.getLbNumberOfPlayers().setStyle("-fx-text-fill: White;");
        this.scene.getLbNumberOfPlayers().setLayoutX(10.0);
        this.scene.getLbNumberOfPlayers().setLayoutY(50.0);
        this.scene.getLbNumberOfPlayers().setPrefWidth(100.0);
        this.scene.getLbNumberOfPlayers().setPrefHeight(30.0);
        this.scene.getLbNumberOfPlayers().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbNumberOfPlayers());

        this.scene.getTxtNumberOfPlayers().setId("txtNumberOfPlayers");
        this.scene.getTxtNumberOfPlayers().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getTxtNumberOfPlayers().setLayoutX(120.0);
        this.scene.getTxtNumberOfPlayers().setLayoutY(50.0);
        this.scene.getTxtNumberOfPlayers().setPrefWidth(100.0);
        this.scene.getTxtNumberOfPlayers().setPrefHeight(30.0);
        this.scene.getTxtNumberOfPlayers().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getTxtNumberOfPlayers());

        this.scene.getLbNumberOfLevels().setId("lbNumberOfLevels");
        this.scene.getLbNumberOfLevels().setText("Number of Levels");
        this.scene.getLbNumberOfLevels().setStyle("-fx-text-fill: White;");
        this.scene.getLbNumberOfLevels().setLayoutX(10.0);
        this.scene.getLbNumberOfLevels().setLayoutY(90.0);
        this.scene.getLbNumberOfLevels().setPrefWidth(100.0);
        this.scene.getLbNumberOfLevels().setPrefHeight(30.0);
        this.scene.getLbNumberOfLevels().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbNumberOfLevels());

        this.scene.getTxtNumberOfLevels().setId("txtNumberOfLevels");
        this.scene.getTxtNumberOfLevels().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getTxtNumberOfLevels().setLayoutX(120.0);
        this.scene.getTxtNumberOfLevels().setLayoutY(90.0);
        this.scene.getTxtNumberOfLevels().setPrefWidth(100.0);
        this.scene.getTxtNumberOfLevels().setPrefHeight(30.0);
        this.scene.getTxtNumberOfLevels().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getTxtNumberOfLevels());

        this.scene.getLbDifficult().setId("lbDifficult");
        this.scene.getLbDifficult().setText("Difficult");
        this.scene.getLbDifficult().setStyle("-fx-text-fill: White;");
        this.scene.getLbDifficult().setLayoutX(10.0);
        this.scene.getLbDifficult().setLayoutY(130.0);
        this.scene.getLbDifficult().setPrefWidth(100.0);
        this.scene.getLbDifficult().setPrefHeight(30.0);
        this.scene.getLbDifficult().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbDifficult());

        this.scene.getCbDifficult().setId("cbDifficult");
        this.scene.getCbDifficult().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getCbDifficult().setLayoutX(120.0);
        this.scene.getCbDifficult().setLayoutY(130.0);
        this.scene.getCbDifficult().setPrefWidth(100.0);
        this.scene.getCbDifficult().setPrefHeight(30.0);
        this.scene.getCbDifficult().setItems(FXCollections.observableArrayList(GameAttributes.Difficult.values()));
        this.scene.getChildren().add(this.scene.getCbDifficult());

        this.scene.getLbPlayerHandicap().setId("lbPlayerHandicap");
        this.scene.getLbPlayerHandicap().setText("Player Handicap");
        this.scene.getLbPlayerHandicap().setStyle("-fx-text-fill: White;");
        this.scene.getLbPlayerHandicap().setLayoutX(10.0);
        this.scene.getLbPlayerHandicap().setLayoutY(170.0);
        this.scene.getLbPlayerHandicap().setPrefWidth(100.0);
        this.scene.getLbPlayerHandicap().setPrefHeight(30.0);
        this.scene.getLbPlayerHandicap().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbPlayerHandicap());

        this.scene.getTxtPlayerHandicap().setId("txtPlayerHandicap");
        this.scene.getTxtPlayerHandicap().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getTxtPlayerHandicap().setLayoutX(120.0);
        this.scene.getTxtPlayerHandicap().setLayoutY(170.0);
        this.scene.getTxtPlayerHandicap().setPrefWidth(100.0);
        this.scene.getTxtPlayerHandicap().setPrefHeight(30.0);
        this.scene.getTxtPlayerHandicap().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getTxtPlayerHandicap());

        this.scene.getLbGameScenario().setId("lbGameScenario");
        this.scene.getLbGameScenario().setText("Game Scenario");
        this.scene.getLbGameScenario().setStyle("-fx-text-fill: White;");
        this.scene.getLbGameScenario().setLayoutX(10.0);
        this.scene.getLbGameScenario().setLayoutY(210.0);
        this.scene.getLbGameScenario().setPrefWidth(100.0);
        this.scene.getLbGameScenario().setPrefHeight(30.0);
        this.scene.getLbGameScenario().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbGameScenario());

        this.scene.getLbLevelsQuantity().setId("lbLevelsQuantity");
        this.scene.getLbLevelsQuantity().setText("Levels Quantity");
        this.scene.getLbLevelsQuantity().setStyle("-fx-text-fill: White;");
        this.scene.getLbLevelsQuantity().setLayoutX(10.0);
        this.scene.getLbLevelsQuantity().setLayoutY(250.0);
        this.scene.getLbLevelsQuantity().setPrefWidth(100.0);
        this.scene.getLbLevelsQuantity().setPrefHeight(30.0);
        this.scene.getLbLevelsQuantity().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbLevelsQuantity());

        this.scene.getCbLevelsQuantity().setId("cbLevelsQuantity");
        this.scene.getCbLevelsQuantity().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getCbLevelsQuantity().setLayoutX(120.0);
        this.scene.getCbLevelsQuantity().setLayoutY(250.0);
        this.scene.getCbLevelsQuantity().setPrefWidth(100.0);
        this.scene.getCbLevelsQuantity().setPrefHeight(30.0);
        this.scene.getChildren().add(this.scene.getCbLevelsQuantity());

        this.scene.getLbRoomsQuantity().setId("lbRoomsQuantity");
        this.scene.getLbRoomsQuantity().setText("Rooms Quantity");
        this.scene.getLbRoomsQuantity().setStyle("-fx-text-fill: White;");
        this.scene.getLbRoomsQuantity().setLayoutX(10.0);
        this.scene.getLbRoomsQuantity().setLayoutY(290.0);
        this.scene.getLbRoomsQuantity().setPrefWidth(100.0);
        this.scene.getLbRoomsQuantity().setPrefHeight(30.0);
        this.scene.getLbRoomsQuantity().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbRoomsQuantity());

        this.scene.getCbRoomsQuantity().setId("cbRoomsQuantity");
        this.scene.getCbRoomsQuantity().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getCbRoomsQuantity().setLayoutX(120.0);
        this.scene.getCbRoomsQuantity().setLayoutY(290.0);
        this.scene.getCbRoomsQuantity().setPrefWidth(100.0);
        this.scene.getCbRoomsQuantity().setPrefHeight(30.0);
        this.scene.getChildren().add(this.scene.getCbRoomsQuantity());

        this.scene.getLbPlayersQuantity().setId("lbPlayersQuantity");
        this.scene.getLbPlayersQuantity().setText("Players Quantity");
        this.scene.getLbPlayersQuantity().setStyle("-fx-text-fill: White;");
        this.scene.getLbPlayersQuantity().setLayoutX(10.0);
        this.scene.getLbPlayersQuantity().setLayoutY(330.0);
        this.scene.getLbPlayersQuantity().setPrefWidth(100.0);
        this.scene.getLbPlayersQuantity().setPrefHeight(30.0);
        this.scene.getLbPlayersQuantity().setAlignment(Pos.CENTER);
        this.scene.getChildren().add(this.scene.getLbPlayersQuantity());

        this.scene.getCbPlayersQuantity().setId("cbPlayersQuantity");
        this.scene.getCbPlayersQuantity().setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.scene.getCbPlayersQuantity().setLayoutX(120.0);
        this.scene.getCbPlayersQuantity().setLayoutY(330.0);
        this.scene.getCbPlayersQuantity().setPrefWidth(100.0);
        this.scene.getCbPlayersQuantity().setPrefHeight(30.0);
        this.scene.getChildren().add(this.scene.getCbPlayersQuantity());
    }

    @Override
    protected void createInstanceForElements()
    {
        this.scene.setLbGameAttributes(new Label());
        this.scene.setLbNumberOfPlayers(new Label());
        this.scene.setTxtNumberOfPlayers(new TextField());
        this.scene.setLbNumberOfLevels(new Label());
        this.scene.setTxtNumberOfLevels(new TextField());
        this.scene.setLbDifficult(new Label());
        this.scene.setCbDifficult(new ComboBox<>());
        this.scene.setLbPlayerHandicap(new Label());
        this.scene.setTxtPlayerHandicap(new TextField());
        this.scene.setLbGameScenario(new Label());
        this.scene.setLbLevelsQuantity(new Label());
        this.scene.setCbLevelsQuantity(new ComboBox<>());
        this.scene.setLbRoomsQuantity(new Label());
        this.scene.setCbRoomsQuantity(new ComboBox<>());
        this.scene.setLbPlayersQuantity(new Label());
        this.scene.setCbPlayersQuantity(new ComboBox<>());
    }
}
