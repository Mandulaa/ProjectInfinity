package mpm.projectinfinity.Items;

/**
 * Created by Maria on 14.08.2017.
 */

public abstract class Armor {
    String name;//Bezeichung
    int damage;//Schutzwert
    int goldvalue;//Goldwert=Verkaufspreis
    boolean canBeUsedByChar;//ueberprueft, ob der Gegenstand von der Char. Klasse benutzt werden kann
    String description;//Beschreibung des Gegenstands
    boolean inUse;//wird der Gegenstand benutzt?

    /**
     * Werte des Characters, u.A. Boni wie Staerkeerh., werden hier veraendert
     */
    abstract void useArmor();

    /**
     * gibt die Beschreibung des Gegenstands als String zurueck
     * @return
     */
    public String getDescription(){
        return this.description;
    }

    public String getName(){
       return this.name;
    }

    /**
     *
     * @return Goldwert wird zurueckgegeben
     */
    public int getGoldvalue(){
        return this.goldvalue;
    }

    /**
     * gibt zurueck, ob ein Gegenstand benutzt wird
     * @return true=wird benutzt
     */
    public boolean isUsed(){
        return this.inUse;
    }

    /**
     * ueberprueft, ob der Gegenstand von der Characterklasse benutzt werden darf
     * Muss noch ergaenzt werden!!
     * @return
     */
    abstract boolean armorCanBeUsedByChar(String Charactertype);

    /**
     * setzt den Goldwert
     * @param gold
     */
    public void setgoldvalue(int gold){
        this.goldvalue=gold;
    }

    /**
     * Setzt den Schutz
     * @param damage
     */
    public void setDamage(int damage){
        this.damage=damage;
    }


    /**
     *
     * @param used true=wird benutzt
     */
    public void setInUse(boolean used){
        this.inUse=used;
    }
}
