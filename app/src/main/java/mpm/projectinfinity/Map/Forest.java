package mpm.projectinfinity.Map;

/**
 * Created by Mascha on 11.08.2017.
 */

public class Forest extends HexagonTile {
    final boolean isWalkable=true;

    Forest(int tilenumber, Position pos){
        super(tilenumber, pos);
    }


    /**
     * gibt zurueck, ob der Tile begehbar ist
     * true=begehbar
     * @return
     */
    public boolean walk(){
        return this.isWalkable;
    }
}
