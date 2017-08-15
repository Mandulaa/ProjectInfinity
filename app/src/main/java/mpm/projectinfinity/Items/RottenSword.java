package mpm.projectinfinity.Items;

import mpm.projectinfinity.Character.Character;

/**
 * Created by Maria on 14.08.2017.
 */

public class RottenSword extends Weapon {

    public RottenSword(){
        this.damage=10;
        this.description="verrostetes Schwert";
        this.goldvalue=5;
        this.name="Schnittwunden und Rostvergiftung in Einem!";
    }


    @Override
    void useArmor() {
    }

    @Override
    boolean weaponCanBeUsedByChar(String Charactertype) {
        return false;
    }
}
