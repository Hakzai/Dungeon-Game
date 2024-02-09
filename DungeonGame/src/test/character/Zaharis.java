/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.character;

import com.akeir.characters.attributes.WizardAttributes;
import com.akeir.characters.model.Character;
import com.akeir.characters.types.CharClass;
import com.akeir.characters.types.Weapon;

/**
 *
 * @author Codeiro
 */
public class Zaharis extends Character{
    
    public Zaharis()
    {
        NAME = this.getClass().getSimpleName();
        CLASS = CharClass.WIZARD;
        PRIMARY_WEAPON = Weapon.STAFF;
        ATTRIBUTES = new WizardAttributes();
        BAG = new Object[5];
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
