/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.monsters.model;

import com.akeir.monsters.types.MonsterLevel;

/**
 *
 * @author Codeiro
 */
public abstract class MonsterAttributes {
    
    protected int energy;
    protected int attackPoints;
    protected int defensePoints;
    protected double epicItemDropRate;
    protected double rareItemDropRate;
    protected double commonItemDropRate;
    protected MonsterLevel level;
    
    protected abstract void setStdCharAttributesByCharClass();

    public int getEnergy() 
    {
        return energy;
    }

    public int getAttackPoints() 
    {
        return attackPoints;
    }

    public int getDefensePoints() 
    {
        return defensePoints;
    }

    public double getEpicItemDropRate() 
    {
        return epicItemDropRate;
    }

    public double getRareItemDropRate() 
    {
        return rareItemDropRate;
    }

    public double getCommonItemDropRate() 
    {
        return commonItemDropRate;
    }

    public MonsterLevel getLevel() 
    {
        return level;
    }
    
    public void setLevel(MonsterLevel level) 
    {
        this.level = level;
    }
}
