/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.monsters.model;

import com.akeir.monsters.types.MonsterClass;

/**
 *
 * @author Codeiro
 */
public abstract class Monster {
    
    protected static String NAME;
    protected static MonsterClass CLASS;
    protected static MonsterAttributes ATTRIBUTES;
    protected static Object[] ABILITIES;
    protected static Object[] DROP;
    
    public void speak()
    {
        System.err.println("Gwaargh!");
    }
    
    public abstract void attack();
    
    public abstract void defend();
}
