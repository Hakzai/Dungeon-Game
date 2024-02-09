/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Codeiro
 */
public class GameAttributes {
    
    int numberOfPlayers; // 2-6
    int numberOfLevels; // playable range varies on number of players
    enum Difficult { EASY, NORMAL, HARD };
    int playerHandicap; // according to difficult, might be not used
}
