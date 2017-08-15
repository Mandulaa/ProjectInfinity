package mpm.projectinfinity.Character;

/**
 * Created by Paul on 29.07.2017.
 */

public class Character {
    private int health;
    private int baseDamage;
    private int mana;
    private int level;
    private int minmovement;
    private int maxmovement;

    public Character(int health, int baseDamage, int minmovement, int mana, int level){
        this.health=health;
        this.baseDamage=baseDamage;
        this.mana=mana;
        this.level=level;
        this.minmovement=minmovement;
    }

    public void setMaxmovement(int maxmovement){this.maxmovement=maxmovement;}

    public int getMaxmovement() {return maxmovement;}

    public void setMinmovement(int minmovement) {this.minmovement=minmovement;}

    public int getMinmovement() {return minmovement;}

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
