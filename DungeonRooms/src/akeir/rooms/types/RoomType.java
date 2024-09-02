/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.types;

/**
 *
 * @author Codeiro
 */
public enum RoomType {
    BATTLE_ROOM, // TWO PLAYERS, ONE WINS AND PROCEED
    DEATH_ROOM, // TWO PLAYERS, ONE DIES
    MONSTER_ROOM, // MONSTER ENCOUNTER, STRENGTH IS RANDOM ACCORDING TO LEVEL
    EMPTY_ROOM, // NOTHING HAPPENS, LITERALLY EMPTY
    DESTINY_ROOM, // SOMETHING VERY GOOD/BAD CAN HAPPEN TO PLAYER
    TRAP_ROOM, // PLAYERS MUST OVERCOME DIFFERENT CHALLENGES TO NOT LOSE HEALTH
    PUZZLE_ROOM, // MUST SOLVE PUZZLE TO CONTINUE
    REST_ROOM, // ROOM TO RECOVER ATTRIBUTES/HEALTH
    TREASURE_ROOM // HIDDEN TREASURE, LOSES TIME IF STAYING
}
