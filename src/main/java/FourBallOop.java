import java.util.ArrayList;
import processing.core.PApplet;

public class FourBallOop extends PApplet{

    private ArrayList<Ball> ball = new ArrayList<>();
    private int start=0;

    public static void main(String[] args){
        String[] processingArgs = {"FourBallOop"};
        FourBallOop fourBallOop=new FourBallOop();
        PApplet.runSketch(processingArgs, fourBallOop);
    }


    public void settings(){
        size(500, 500);
        for(int i=1;i<=4;i++) {
            ball.add(new Ball(this,this.start, (float)i*height / 5,i));
        }
    }
    public void draw(){
        for(Ball b : ball){
            b.step();
        }
    }
}
