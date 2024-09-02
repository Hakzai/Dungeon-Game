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
public abstract class Room {
    
    protected int roomID;
    protected RoomAttributes roomAtrributes;
    protected RoomConnection exitOne;
    protected RoomConnection exitTwo;
    protected RoomConnection exitThree;
    
    protected Set<String> playersOnRoom = new HashSet<>();
    protected Set<String> playerHistory = new HashSet<>();
    
    public Room()
    {
        defineRoomIDandIncreaseGlobalSequence();
        defineRoomConnections();
    }
    
    public void speak()
    {
        System.err.println("Entering Room");
    }
        
    public abstract void interact();
    
    public abstract void lookTreasure();
    
    public abstract void exit();
    
    private void defineRoomIDandIncreaseGlobalSequence()
    {
        roomID = RoomGlobals.ROOM_ID_SEQUENCE;
        RoomGlobals.ROOM_ID_SEQUENCE++;
    }
    
    private void defineRoomConnections()
    {
        
    }
}
