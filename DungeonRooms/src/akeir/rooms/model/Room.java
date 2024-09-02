/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.model;

import akeir.rooms.infra.RoomGlobals;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Codeiro
 */
public abstract class Room implements RoomActions {
    
    protected final int roomID;
    protected RoomAttributes roomAttributes;
    protected boolean canExit;
    
    protected final Set<String> playersOnRoom = new HashSet<>();
    protected final Set<String> playerHistory = new HashSet<>();
    
    public Room(RoomAttributes roomAttrs)
    {
        this.roomID = RoomGlobals.defineRoomID();
        this.roomAttributes = roomAttrs;
        this.canExit = roomAttrs.exitCondition.isEmpty();
    }
    
    @Override
    public void enter()
    {
        System.err.println("Entering Room");
    }
    
    @Override
    public void exit()
    {
        if(isCanExit())
        {
            System.err.println("Will leave the Room");
        }
        else
        {
            System.err.println("Cannot leave Room Now");
        }
    }
    
    public final int getRoomId()
    {
        return this.roomID;
    }
    
    public final RoomAttributes getRoomAttributes()
    {
        return this.roomAttributes;
    }
    
    public final Set getPlayersOnRoom()
    {
        return playersOnRoom;
    }
    
    public final Set getPlayerHistory()
    {
        return playersOnRoom;
    }
    
    public final boolean isCanExit()
    {
        return canExit;
    }
        
    public final void setCanExit()
    {
        canExit = true;
    }
}
