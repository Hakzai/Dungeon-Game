/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.monster;

import com.akeir.monsters.attributes.EvilWizardAttributes;
import com.akeir.monsters.model.Monster;
import com.akeir.monsters.types.MonsterClass;

/**
 *
 * @author Codeiro
 */
public class Apprentice extends Monster{
    
    public Apprentice()
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
        System.err.println("Adventurer, you shall meet your DooM now!");
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
