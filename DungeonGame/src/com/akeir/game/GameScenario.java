/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.game;

import akeir.infra.exception.GameNotInitializedException;
import akeir.rooms.model.Room;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Codeiro
 */
class GameScenario {
    
    private int levelsQuantity;
    private int roomsQuantity;
    private int playersQuantity;
    private int machinePlayersQuantity;
    private List<ArrayList> levelsList;
    private List<Room> roomsList;
    private List<Player> playersList;

    private static GameScenario instance;

    public GameScenario(int levelsQty, int roomsQty, int playersQty, String difficulty)
    {
        if(instance == null)
        {
            this.levelsQuantity = levelsQty;
            this.roomsQuantity = roomsQty;
            this.playersQuantity = playersQty;
            this.machinePlayersQuantity = Math.max(4 - playersQuantity, 0);
            this.levelsList = new ArrayList();
            this.roomsList = createRoomsAccordingToDifficulty(difficulty);
            this.playersList = new ArrayList();

            instance = this;
        }
    }

    private List<Room> createRoomsAccordingToDifficulty(String difficulty)
    {
        if(difficulty.equals("easy"))
        {
            // Only Two Death Rooms
        }
        else if (difficulty.equals("normal"))
        {
            // Four Death Rooms
        }
        else
        {
            // Eight Death Rooms
        }

        return null;
    }

    public static GameScenario getGameScenario()
    {
        if(instance == null)
        {
            throw new GameNotInitializedException("Game has not been initialized yet");
        }

        return instance;
    }

    public int getLevelsQuantity()
    {
        return this.levelsQuantity;
    }

    public int getRoomsQuantity()
    {
        return this.roomsQuantity;
    }

    public int getPlayersQuantity()
    {
        return this.playersQuantity;
    }

    public int getMachinePlayersQuantity()
    {
        return this.machinePlayersQuantity;
    }

    public List<ArrayList> getLevelsList()
    {
        return this.levelsList;
    }

    public List<Room> getRoomsList()
    {
        return this.roomsList;
    }

    public List<Player> getPlayersList()
    {
        return this.playersList;
    }
}
