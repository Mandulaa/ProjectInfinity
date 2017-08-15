package mpm.projectinfinity;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Paul on 11.08.2017.
 */

public interface Scene {
    public void draw(Canvas canvas);
    public void update();
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
