/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.infra;

/**
 *
 * @author Codeiro
 */
public final class RoomGlobals {
    
    private static int ROOM_ID_SEQUENCE = 0;
    
    public static int DEATH_ROOM_COUNT = 0;
    public static int TREASURE_ROOM_COUNT = 0;
    public static int BATTLE_ROOM_COUNT = 0;
    public static int DESTINY_ROOM_COUNT = 0;
    public static int EMPTY_ROOM_COUNT = 1;
    public static int EMPTY_ROOM_COUNT_MIN = 1;
    
    // TO DEFINE ACCORDING TO DIFFICULT WHEN INITIALIZING GAME
    public static int ROOM_ID_SEQUENCE_MAX;
    public static int DEATH_ROOM_COUNT_MIN;
    public static int DEATH_ROOM_COUNT_MAX;
    public static int TREASURE_ROOM_COUNT_MIN;
    public static int TREASURE_ROOM_COUNT_MAX;
    public static int BATTLE_ROOM_COUNT_MIN;
    public static int BATTLE_ROOM_COUNT_MAX;
    public static int DESTINY_ROOM_COUNT_MIN;
    public static int DESTINY_ROOM_COUNT_MAX;
    
    private RoomGlobals() { }
    
    public synchronized static int defineRoomID()
    {
        int curValue = ROOM_ID_SEQUENCE;
        ROOM_ID_SEQUENCE++;
        
        return curValue;
    }
}
