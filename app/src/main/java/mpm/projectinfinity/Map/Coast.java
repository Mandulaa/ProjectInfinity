package mpm.projectinfinity.Map;

/**
 * Created by Mascha on 11.08.2017.
 */

public class Coast extends HexagonTile {
    final boolean isWalkable=true;

    Coast(int tilenumber, Position pos){
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
