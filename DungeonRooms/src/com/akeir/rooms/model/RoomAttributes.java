/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.rooms.model;

import com.akeir.rooms.types.RoomType;

/**
 *
 * @author Codeiro
 */
public abstract class RoomAttributes {

    protected int ROOM_LEVEL;
    protected RoomType ROOM_TYPE;
    protected boolean HAS_MONSTER;
    protected boolean HAS_TREASURE;
    protected boolean HAS_TIMER;
    protected int NUMBER_OF_EXITS;
    protected String EXIT_CONDITION;
    
    public int getROOM_LEVEL() {
        return ROOM_LEVEL;
    }

    public RoomType getROOM_TYPE() {
        return ROOM_TYPE;
    }

    public boolean isHAS_MONSTER() {
        return HAS_MONSTER;
    }

    public boolean isHAS_TREASURE() {
        return HAS_TREASURE;
    }

    public boolean isHAS_TIMER() {
        return HAS_TIMER;
    }

    public int getNUMBER_OF_EXITS() {
        return NUMBER_OF_EXITS;
    }

    public String getEXIT_CONDITION() {
        return EXIT_CONDITION;
    }
}
