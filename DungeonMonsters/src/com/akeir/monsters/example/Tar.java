/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akeir.monsters.example;

import com.akeir.monsters.attributes.EvilWizardAttributes;
import com.akeir.monsters.types.MonsterClass;
import com.akeir.monsters.model.Monster;

/**
 *
 * @author Codeiro
 */
public class Tar extends Monster{
    
    public Tar()
    {
        NAME = this.getClass().getSimpleName();
        CLASS = MonsterClass.EVIL_WIZARD;
        ATTRIBUTES = new EvilWizardAttributes();
        ABILITIES = new Object[3];
        DROP = new Object[3];
    }
    
    @Override
    public void speak()
    {
        super.speak();
    }

    @Override
    public void attack() 
    {
        System.out.println("Hit " + ATTRIBUTES.getAttackPoints() + " damage");
    }

    @Override
    public void defend() 
    {
        System.out.println("Defended " + ATTRIBUTES.getDefensePoints() + " damage");
    }
    
    
    
}
