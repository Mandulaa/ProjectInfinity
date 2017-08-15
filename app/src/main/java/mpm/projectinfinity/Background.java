package mpm.projectinfinity;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Paul on 11.08.2017.
 */

public class Background {
    private Bitmap image;
    private int x,y;

    public Background(Bitmap res){
        image=res;
    }

    public void update(){
        x+=1;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(image,x,y,null);
    }

}
