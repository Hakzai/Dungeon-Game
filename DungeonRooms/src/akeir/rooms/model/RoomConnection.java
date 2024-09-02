/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.model;

/**
 *
 * @author Codeiro
 */
class RoomConnection {
    
    private final int currentRoomId;
    private final int destinationRoomId;
    
    public RoomConnection(int currentRoomId, int destinationRoomId)
    {
        this.currentRoomId = currentRoomId;
        this.destinationRoomId = destinationRoomId;
    }

    public int getCurrentRoomId() 
    {
        return currentRoomId;
    }

    public int getDestinationRoomId()
    {
        return destinationRoomId;
    }
}
