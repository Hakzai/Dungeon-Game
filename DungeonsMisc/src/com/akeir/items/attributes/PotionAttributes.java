/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.items.attributes;

import com.akeir.items.model.ItemAttributes;

/**
 *
 * @author Codeiro
 */
public class PotionAttributes extends ItemAttributes {
    
    public PotionAttributes()
    {
        setBasePotionAttributes();
    }
    
    private void setBasePotionAttributes()
    {
        consumable = true;
        equipable = false;
        tradable = true;
        dropable = true;
        dropRate = DropRate.COMMON;
    }
}
