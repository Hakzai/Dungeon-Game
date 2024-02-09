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
public abstract class Room {
    
    public static int ROOM_ID;
    protected static RoomAttributes ATTRIBUTES;
    protected static RoomConnection EXIT_ONE;
    protected static RoomConnection EXIT_TWO;
    protected static RoomConnection EXIT_THREE;
    
    public void speak()
    {
        System.err.println("Entering Room");
    }
    
}
