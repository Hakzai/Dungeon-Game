/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.characters.model;

import com.akeir.characters.types.CharClass;
import com.akeir.characters.types.Weapon;

/**
 *
 * @author Codeiro
 */
public abstract class Character {
    
    protected static String NAME;
    protected static CharClass CLASS;
    protected static Weapon PRIMARY_WEAPON;
    protected static CharAttributes ATTRIBUTES;
    protected static Object[] BAG;
    
    public void speak()
    {
        System.out.println("Hello adventurer!");
        System.out.println("I'm " + NAME + " and I'll be your arm in the field!");
        System.out.println("I have a " + PRIMARY_WEAPON + " and I'm a " + CLASS);
    }
            
    public abstract void attack();
    
    public abstract void defend();
    
}

/**
 * A character is a player representative. Characters are exclusive and cannot have clones.
 * The characters can be chosen during gaming start.
 */