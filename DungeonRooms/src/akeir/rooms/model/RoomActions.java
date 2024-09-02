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
public interface RoomActions {
    
    void enter();
    
    void exit();
    
    void interact();
    
    void lookTreasure();
    
    void speak();
    
    /**
     * This method should be called at the beginning of every round to confirm if condition to leave has been fulfilled
     */
    void checkCondition();
}
