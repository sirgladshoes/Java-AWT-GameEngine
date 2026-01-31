import java.awt.*;
public class Sprite {

    public void draw(Graphics graphics, EngineMath.Vector2 position) {
    }

    public static class Rect extends Sprite{
        int width, height;
        Color color;

        public Rect(int width, int height, Color color){
            this.width = width;
            this.height = height;
            this.color = color;
        }

        @Override
        public void draw(Graphics graphics, EngineMath.Vector2 position){
            graphics.setColor(color);
            graphics.fillRect((int)position.x, (int)position.y, width, height);
        }

    }
}
