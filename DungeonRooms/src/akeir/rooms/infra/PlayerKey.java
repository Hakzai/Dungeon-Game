/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeir.rooms.infra;

import java.util.Random;

/**
 *
 * @author Codeiro
 */
public final class PlayerKey {
    
    protected static String PLAYER_ONE_KEY;
    protected static String PLAYER_TWO_KEY;
    protected static String PLAYER_THREE_KEY;
    protected static String PLAYER_FOUR_KEY;
    
    private static PlayerKey instance;
    
    private PlayerKey()
    {
        PLAYER_ONE_KEY = generateRandomStringKey(10);
        PLAYER_TWO_KEY = generateRandomStringKey(10);
        PLAYER_THREE_KEY = generateRandomStringKey(10);
        PLAYER_FOUR_KEY = generateRandomStringKey(10);
    }
    
    public static PlayerKey getPlayerKey()
    {
        if(null == instance)
        {
            instance = new PlayerKey();
        }
        
        return instance;
    }

    public static String getPLAYER_ONE_KEY() 
    {
        return PLAYER_ONE_KEY;
    }

    public static String getPLAYER_TWO_KEY() 
    {
        return PLAYER_TWO_KEY;
    }

    public static String getPLAYER_THREE_KEY() 
    {
        return PLAYER_THREE_KEY;
    }

    public static String getPLAYER_FOUR_KEY() 
    {
        return PLAYER_FOUR_KEY;
    }
    
    private String generateRandomStringKey(int targetLength) 
    {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(targetLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
    }
}
