/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.items.model;

import com.akeir.items.types.ItemType;

/**
 *
 * @author Codeiro
 */
public abstract class Item {

    protected static String NAME;
    protected static ItemType TYPE;
    protected static ItemAttributes ATTRIBUTES;
    
    public void consume()
    {
        if(!ATTRIBUTES.isConsumable())
        {
            System.err.println(NAME + " is not consumable!");
        }
    }
    
    public void equip()
    {
        if(!ATTRIBUTES.isEquipable())
        {
            System.err.println(NAME + " is not equipable!");
        }
    }
    
    public void trade()
    {
        if(!ATTRIBUTES.isTradable())
        {
            System.err.println(NAME + " is not tradable!");
        }
    }
    
    public void drop()
    {
        if(!ATTRIBUTES.isDropable())
        {
            System.err.println(NAME + " is not dropable!");
        }
    }
    
}
