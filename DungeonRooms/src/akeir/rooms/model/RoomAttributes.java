/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.model;

import akeir.rooms.types.RoomType;

/**
 *
 * @author Codeiro
 */
public abstract class RoomAttributes {

    protected int roomLevel;
    protected RoomType roomType;
    protected boolean hasTreasure;
    protected boolean hasTimer;
    protected String exitCondition;
    
    public RoomAttributes(RoomType roomType, int roomLevel)
    {
        this.roomType = roomType;
        this.roomLevel = roomLevel;
    }
    
    public int getRoomLevel() 
    {
        return roomLevel;
    }

    public RoomType getRoomType() 
    {
        return roomType;
    }

    public boolean hasTreasure() 
    {
        return hasTreasure;
    }

    public boolean hasTimer() 
    {
        return hasTimer;
    }

    public String getExitCondition() 
    {
        return exitCondition;
    }
}
