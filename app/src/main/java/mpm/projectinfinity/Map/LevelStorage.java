package mpm.projectinfinity.Map;

/**
 * hier werden die Level gespeichert und koennen abgerufen werden mit den enspr. Methoden
 * (ist jetzt fuers erste so geregelt, spaeter ne bessere Loesung)
 */

public class LevelStorage {

    /**
     * Karte in mit Integerwerten
     * 0=coast,1=forest,2=ground,3=river
     * @return
     */
    public int [][]getLevel1(){
         int [][]lev={{2,1,0,3,0,1,1},
                      {2,2,3,2,2,1,1},
                      {1,2,0,3,2,2,1},
                      {2,2,3,0,2,1,1},
                      {1,1,0,3,1,2,1}};

        return lev;
    }

}
