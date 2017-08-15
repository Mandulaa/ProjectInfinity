package mpm.projectinfinity.Character;

/**
 * Created by manue on 15.08.2017.
 */

public class Knight extends Character{
    private int stamina;
    public Knight() {
        super(200,20,1,0,1);
        super.setMaxmovement(3);
    }

    public void setStamina(int stamina) {
        this.stamina=stamina;
    }

    public int getStamina() {
        return stamina;
    }




}
