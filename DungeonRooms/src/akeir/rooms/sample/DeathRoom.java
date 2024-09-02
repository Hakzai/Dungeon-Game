/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.sample;

import akeir.rooms.model.Room;

/**
 *
 * @author Codeiro
 */
public abstract class DeathRoom extends Room {
    
    public DeathRoom()
    {
        super();
    }
    
    @Override
    public void speak()
    {
        super.speak();
        System.err.println("YOU ARE IN THE DEATH ROOM! Mwa ha ha ha");
    }
    
}
