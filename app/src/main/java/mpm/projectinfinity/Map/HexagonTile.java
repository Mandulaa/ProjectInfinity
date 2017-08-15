package mpm.projectinfinity.Map;

/**
 * Sechseckiger Tile, Element der Map
 */

public class HexagonTile {
    int tilenumber;//Nummer innerhalb der Map: 1 bis hoehe*breite
    int type;
    Position pos;//Position innerhalb der Map
    int nw,no,o,so,sw,w;//tilenumber der Nachbartiles, kodiert in Himmelsrichtungen

    HexagonTile(){

    }

    /**
     * Variante 1:
     * zus. Unterscheidung nach Typ
     * @param tilenumber
     * @param type
     * @param pos
     */
    HexagonTile(int tilenumber, int type, Position pos){
        this.pos=pos;
        this.tilenumber=tilenumber;
        this.type=type;
        calculateNeighbours();
    }

    /**
     * Variante 2:
     * Typ wird in der extended Klasse festgesetzt
     * @param tilenumber
     * @param pos
     */
    HexagonTile(int tilenumber, Position pos){
        this.pos=pos;
        this.tilenumber=tilenumber;
       // this.type=type;
        calculateNeighbours();
    }

    /**
     * berechnet welche Nummern die Nachbarn das aktuelle Tile besitzt.
     * Falls eine Nummer <=0 ist, gehoert sie nicht mehr zum Spielfeld
     */
    public void calculateNeighbours(){
        int height=5;//WICHTIG!! Diese parameter sind eigentlich aus dem Level zu nehmen!!!
        int width=7;
        this.nw=tilenumber-width;
        this.no=tilenumber-width+1;
        this.w=tilenumber-1;
        this.o=tilenumber+1;
        this.sw=tilenumber+width;
        this.so=tilenumber+width+1;
    }



}
