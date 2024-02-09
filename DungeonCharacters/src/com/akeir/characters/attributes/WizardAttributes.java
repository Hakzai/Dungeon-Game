/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.characters.attributes;

import com.akeir.characters.model.CharAttributes;

/**
 *
 * @author Codeiro
 */
public class WizardAttributes extends CharAttributes {
    
    private final int wizardStdEnergy = 100;
    private final int wizardStdMana = 90;
    private final int wizardStdKarma = 0;
    private final int wizardStdAttackPoints = 50;
    private final int wizardStdDefensePoints = 20;
    
    public WizardAttributes()
    {
        setStdCharAttributesByCharClass();
    }

    @Override
    protected void setStdCharAttributesByCharClass()
    {
        energy = wizardStdEnergy;
        mana = wizardStdMana;
        karma = wizardStdKarma;
        attackPoints = wizardStdAttackPoints;
        defensePoints = wizardStdDefensePoints;
    }
}
