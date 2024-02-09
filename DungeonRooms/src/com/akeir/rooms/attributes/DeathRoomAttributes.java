/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.rooms.attributes;

import com.akeir.rooms.model.RoomAttributes;
import com.akeir.rooms.types.RoomType;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Codeiro
 */
public class DeathRoomAttributes extends RoomAttributes {
    
    public DeathRoomAttributes()
    {
        ROOM_LEVEL = 1;
        ROOM_TYPE = RoomType.DEATH_ROOM;
        HAS_MONSTER = ThreadLocalRandom.current().nextBoolean();
        HAS_TREASURE = ThreadLocalRandom.current().nextBoolean();
        HAS_TIMER = false;
        NUMBER_OF_EXITS = 3;
        if(HAS_MONSTER)
        {
            EXIT_CONDITION = "KILL MONSTER";
        }
        else
        {
            EXIT_CONDITION = "KILL PLAYER";
        }
    }
}
