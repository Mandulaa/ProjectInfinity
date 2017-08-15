package mpm.projectinfinity.Character;

/**
 * Created by Paul on 29.07.2017.
 */

public class Character {
    private int health;
    private int baseDamage;
    private int mana;
    private int level;

    public Character(int health, int baseDamage, int mana, int level){
        this.health=health;
        this.baseDamage=baseDamage;
        this.mana=mana;
        this.level=level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
