package mpm.projectinfinity.Map;

/**
 * Boden
 */

public class Ground extends HexagonTile {
    final boolean isWalkable=true;

    /**
     *
     * @param tilenumber Nummer des Tiles innerhalb des levels
     * @param pos
     */
    Ground(int tilenumber, Position pos){
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
