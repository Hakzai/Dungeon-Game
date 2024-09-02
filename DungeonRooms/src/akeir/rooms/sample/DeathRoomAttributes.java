/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.sample;

import akeir.rooms.model.RoomAttributes;
import akeir.rooms.types.RoomType;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Codeiro
 */
public class DeathRoomAttributes extends RoomAttributes {
    
    public DeathRoomAttributes()
    {
        super(RoomType.DEATH_ROOM, 10);

        hasTreasure = ThreadLocalRandom.current().nextBoolean();
        hasTimer = false;
            
        exitCondition = "A PLAYER IS DEAD";
    }
}
