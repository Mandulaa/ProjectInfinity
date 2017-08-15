package mpm.projectinfinity;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;



/**
 * Created by Paul on 11.08.2017.
 */

public class SceneManager {
    public ArrayList<Scene> scenes=new ArrayList<Scene>();
    public static int ACTIVE_SCENE;

    public SceneManager(){
        ACTIVE_SCENE=1;
        scenes.add(new MainMenu());

    }

    public void recieveTouch(MotionEvent event){
        scenes.get(ACTIVE_SCENE).recieveTouch(event);
    }

    public void draw(Canvas canvas){
        scenes.get(ACTIVE_SCENE).draw(canvas);
    }

    public void update(){
        scenes.get(ACTIVE_SCENE).update();
    }
}
