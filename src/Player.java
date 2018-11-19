import java.awt.Color;
import java.awt.Graphics;

public class Player extends GraphicsObject{

    double x;
    double y;
    double speed_x;

    public Player(double x, double y){
        super(x,y);
        this.x = x;
        this.y = y;
        this.speed_x = 6;
    }
    public void draw(Graphics g){
        g.setColor(new Color(0, 0, 0));
        g.fillRect((int)this.x, (int)this.y, 30, 30);
    }

}