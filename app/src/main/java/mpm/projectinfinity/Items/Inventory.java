package mpm.projectinfinity.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maria on 14.08.2017.
 */

public class Inventory {
    private int gold;

    List<Armor> armorList =new ArrayList<Armor>();
    List<Shield> shieldList= new ArrayList<Shield>();
    List<Weapon> weaponList=new ArrayList<Weapon>();

    /**
     * Aufheben und Lagern von einem Gegenstand
     * @param o
     */
    public void pickUp(Object o){
        //!!!Was ueberlegen, falls das Inventar voll ist
        //vllt statt einer Liste ein Array benutzen?
        if (o instanceof Armor){
            armorList.add((Armor) o);
        }
        if (o instanceof Shield){
            shieldList.add((Shield) o);
        }
        if (o instanceof Weapon){
            weaponList.add((Weapon) o);
        }
    }

    /**
     * Anzahl an Gold veraendern
     * (beim Verkaufen/Kaufen/Finden ect.)
     * @param gold
     */
    public void setGold(int gold){
        this.gold=gold;
    }

    public void removeArmorFromList(Armor a){
        armorList.remove(a);
    }

    public void removeShieldFromList(Shield s){
        shieldList.remove(s);
    }

    public void removeWeaponFromList(Weapon w){
        weaponList.remove(w);
    }
}
