package mpm.projectinfinity;


import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Paul on 11.08.2017.
 */

public class MainMenu implements Scene {

    public Background bg;

    public MainMenu(){
        bg=new Background(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.redbg1));
    }


    public void terminate(){

        SceneManager.ACTIVE_SCENE=0;
    }

    @Override
    public void recieveTouch(MotionEvent event) {

    }

    @Override
    public void draw(Canvas canvas) {
        bg.draw(canvas);
    }

    @Override
    public void update() {
        bg.update();
    }
}
