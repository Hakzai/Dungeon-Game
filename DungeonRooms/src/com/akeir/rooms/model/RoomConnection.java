/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.rooms.model;

/**
 *
 * @author Codeiro
 */
class RoomConnection {
    
    private final Room currentRoom;
    private final Room destinationRoom;
    
    public RoomConnection(Room currentRoom, Room destinationRoom)
    {
        this.currentRoom = currentRoom;
        this.destinationRoom = destinationRoom;
    }

    public Room getCurrentRoom() 
    {
        return currentRoom;
    }

    public Room getDestinationRoom()
    {
        return destinationRoom;
    }
}
