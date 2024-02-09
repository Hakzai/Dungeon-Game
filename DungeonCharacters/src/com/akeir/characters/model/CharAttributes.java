/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.characters.model;

/**
 *
 * @author Codeiro
 */
public abstract class CharAttributes {
    
    protected int energy;
    protected int mana;
    protected int karma;
    protected int attackPoints;
    protected int defensePoints;
    
    protected abstract void setStdCharAttributesByCharClass();

    public int getEnergy() 
    {
        return energy;
    }

    public int getMana() 
    {
        return mana;
    }

    public int getKarma() 
    {
        return karma;
    }

    public int getAttackPoints() 
    {
        return attackPoints;
    }

    public int getDefensePoints() 
    {
        return defensePoints;
    }
}
