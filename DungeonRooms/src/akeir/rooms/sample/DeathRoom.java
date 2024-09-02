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
public class DeathRoom extends Room {
    
    public DeathRoom()
    {
        super(new DeathRoomAttributes());
    }
    
    @Override
    public void enter()
    {
        super.enter();
        speak();
    }
    
    @Override
    public void exit()
    {
        super.exit();
    }
    
    @Override
    public void speak()
    {
        System.err.println("YOU ARE IN THE DEATH ROOM! Mwa ha ha ha");
    }

    @Override
    public void interact() 
    {
        System.out.println("To leave the room you must fight to death with other incoming player. If no player comes in three rounds, you may be able to leave without fighting.");
    }

    @Override
    public void lookTreasure() 
    {
        if(!getRoomAttributes().hasTreasure())
        {
            System.err.println("THIS ROOM HAS NO TREASURE!");
        }
        else
        {
            System.err.println("YOU FOUND AN ITEM!");
        }
    }

    @Override
    public void checkCondition()
    {
        if(!isCanExit() && roomAttributes.getExitCondition().isEmpty()) // DUMMY CONDITION TO MAKE canExit AS TRUE
        {
            setCanExit();
            System.out.println("You can leave the room now");
            return;
        }
        
        // INFORMATIONAL
        if(isCanExit())
        {
            System.err.println("WHY HAVEN'T YOU LEAVED YET??");
        }
        else
        {
            System.err.println("CONDITION IS NOT FULFILLED");
        }
    }
    
}
