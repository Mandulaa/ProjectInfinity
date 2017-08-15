package mpm.projectinfinity.Character;

/**
 * Created by manue on 15.08.2017.
 */

public class Rider extends Character {
    private int stamina;
    public Rider (int stamina) {
        super(150,10,1,0,1);
        this.stamina=stamina;
        super.setMaxmovement(7);

    }
}
