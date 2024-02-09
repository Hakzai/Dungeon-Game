/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.monsters.attributes;

import com.akeir.monsters.model.MonsterAttributes;

/**
 *
 * @author Codeiro
 */
public class EvilWizardAttributes extends MonsterAttributes {

    private final int stdEnergy = 150;
    
    public EvilWizardAttributes()
    {
        setStdCharAttributesByCharClass();
    }
    
    @Override
    protected void setStdCharAttributesByCharClass()
    {
        energy = stdEnergy;
        attackPoints = 70;
        defensePoints = 15;
        epicItemDropRate = 0.005;
        rareItemDropRate = 0.015;
        commonItemDropRate = 0.50;
    }
    
}
