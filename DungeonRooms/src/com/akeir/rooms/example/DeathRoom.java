/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.rooms.example;

import com.akeir.rooms.attributes.DeathRoomAttributes;
import com.akeir.rooms.model.Room;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Codeiro
 */
public class DeathRoom extends Room {
    
    public DeathRoom()
    {
        ROOM_ID = ThreadLocalRandom.current().nextInt(1,16);
        ATTRIBUTES = new DeathRoomAttributes();
    }
    
    @Override
    public void speak()
    {
        super.speak();
        System.err.println("YOU ARE IN THE DEATH ROOM! Mwa ha ha ha");
    }
    
}
