package mpm.projectinfinity.Map;

/**
 * Position innerhalb eines Levels (auch fuer Pointer?)
 */

public  class Position {
    int x;
    int y;

    /**
     *
     * @param x
     * @param y
     */
    public Position(int x,int y){
        this.x=x;
        this.y=y;
    }

    /**
     *
     * @return x-Koordinate
     */
    public int getPositionX(){
        return this.x;
    }

    /**
     *
     * @return y-Koodinate
     */
    public int getPositionY(){
        return this.y;
    }
}
