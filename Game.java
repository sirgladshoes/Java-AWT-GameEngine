
import java.awt.Color;

public class Game{
    public static void main(String[] args) {
        Engine gameInstance = new Engine("window", 540, 320);

        double frameTimeStamp;

        EngineMath.Vector2 position1 = new EngineMath.Vector2(0, 0);
        EngineMath.Rect collider1 = new EngineMath.Rect(10, 10, position1);

        EngineMath.Vector2 position2 = new EngineMath.Vector2(0, 0);
        EngineMath.Rect collider2 = new EngineMath.Rect(100, 10, position2);

        while(true){
            frameTimeStamp = System.currentTimeMillis();

            position1.x+=1;

            System.out.println(collider1.isRectOverlaping(collider2));

            Sprite rect2 = new Sprite.Rect(100, 10, Color.GREEN);
            gameInstance.drawSprite(rect2, position2);

            Sprite rect = new Sprite.Rect(10, 10, Color.blue);
            gameInstance.drawSprite(rect, position1);

            gameInstance.drawFrame();

            try{ Thread.sleep(16); } catch (InterruptedException e){}
            //System.out.println(System.currentTimeMillis() - frameTimeStamp);


        }
    }
}
