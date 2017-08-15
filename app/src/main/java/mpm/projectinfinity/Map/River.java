package mpm.projectinfinity.Map;

/**
 * Fluss
 */

public class River extends HexagonTile {
    final boolean isWalkable=false;//ein Fluss ist nicht begehbar

    River(int tilenumber, Position pos){
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
