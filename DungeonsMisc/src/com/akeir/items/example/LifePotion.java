/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.items.example;

import com.akeir.items.attributes.PotionAttributes;
import com.akeir.items.model.Item;
import com.akeir.items.types.ItemType;

/**
 *
 * @author Codeiro
 */
public class LifePotion extends Item {
    
    public LifePotion()
    {
        NAME = this.getClass().getSimpleName();
        TYPE = ItemType.POTION;
        ATTRIBUTES = new PotionAttributes();
    }
    
    @Override
    public void consume()
    {
        System.err.println("You used a Life Potion and this has restored 50 Energy!");
    }
    
}
