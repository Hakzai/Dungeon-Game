/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.items.model;

import com.akeir.items.attributes.DropRate;

/**
 *
 * @author Codeiro
 */
public abstract class ItemAttributes {

    protected boolean consumable;
    protected boolean equipable;
    protected boolean tradable;
    protected boolean dropable;
    protected DropRate dropRate;
    
    public boolean isConsumable() 
    {
        return consumable;
    }

    public boolean isEquipable() 
    {
        return equipable;
    }

    public boolean isTradable() 
    {
        return tradable;
    }

    public boolean isDropable() 
    {
        return dropable;
    }
    
    public DropRate getDropRate()
    {
        return dropRate;
    }
}
