package mpm.projectinfinity.Map;

/**
 * das gesamte Tileslevel
 */

public class Level {
   private int height,width;
   private HexagonTile [][] map;
    /**
     *
     * @param height hoehe der Map
     * @param width breite der Map
     */
    Level(int height, int width){
        this.height=height;
        this.width=width;
        map=new HexagonTile[height][width];
        positionGround();

       // map[0][0]=new Ground(1, new Position(0,0));


    }

    /**
     * Boden wird auf der Map verteilt
     */
    private void positionGround(){
        int tilenumber=0;
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                tilenumber++;
                map[i][j]=new Ground(tilenumber,new Position(i,j));

            }
        }
    }

    /**
     * wandelt die Integer Map in eine Tiles Map um und gibt diese zurueck
     * @param imap vordefinierte Map, kodiert mit Integerwerten
     * @return Map mit dem Datentyp Hexagontile
     */
    public HexagonTile[][] makeTilemap(int [][] imap) {
        int tilescounter = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                tilescounter++;
                switch (imap[i][j]) {
                    case 0: //0==coast
                        this.map[i][j] = new Coast(tilescounter, new Position(i, j));
                        break;
                    case 1://1==Forest
                        this.map[i][j] = new Forest(tilescounter, new Position(i, j));
                        break;
                    case 2://2==Ground
                        this.map[i][j] = new Ground(tilescounter, new Position(i, j));
                        break;
                    case 3://3==River
                        this.map[i][j] = new River(tilescounter, new Position(i, j));
                        break;
                    default:
                        System.out.println("False int value!");


                }
            }

        }
        return map;
    }

    /**
     * gibt die gesamte Tilesmap zurueck
     * @return
     */
    public HexagonTile [][] getLevel(){

            return this.map;
    }

    /**
     * Breite der Map in Tiles
     * @return
     */
    public int getWidth(){

        return this.width;
    }

    /**
     * Hoehe der Map in Tiles
     * @return
     */
    public int getHeight(){

        return this.height;
    }


}
