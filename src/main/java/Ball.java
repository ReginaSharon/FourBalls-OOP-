
import processing.core.PApplet;

public class Ball extends PApplet {

    private PApplet sketch;
    private float x;
    private float y;
    private float size;
    private float xSpeed;

    public Ball(PApplet sketch, float x,float y, float xSpeed){
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.size =  10;
        this.xSpeed=xSpeed;
    }


    public void step(){
        sketch.ellipse(x, y, size, size);
        this.x += this.xSpeed;
    }
}
