import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import  java.util.ArrayList;
import java.util.List;

public class Engine {
    private Frame window;
    private Canvas canvas;
    private List<Sprite> sprites;

    public Engine (String name, int width, int height){
        window = new Frame(name);
        window.setSize(width, height);

        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                //when window closed
                System.exit(0);
            }
        });

        canvas = new Canvas();
        window.add(canvas);

        window.setVisible(true);

        canvas.createBufferStrategy(2);

        sprites = new ArrayList<Sprite>();
    }

    public void drawSprite(Sprite sprite, EngineMath.Vector2 position){
        Graphics graphics = canvas.getBufferStrategy().getDrawGraphics();
        sprite.draw(graphics, position);
    }

    public void drawFrame(){
        BufferStrategy bufferStrat = canvas.getBufferStrategy();
        Graphics graphics = bufferStrat.getDrawGraphics();
        
        graphics.dispose();
        bufferStrat.show();
        
        //draw backround
        graphics = bufferStrat.getDrawGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}