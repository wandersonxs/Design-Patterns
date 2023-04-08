package structural.flyweight;

import java.util.Random;

public class FlyweightSimulator {

    private Random random;

    private String[] colors = { "RED", "GREEN", "BLUE"};
    
    private ShapeFactory shapeFactory;

    public FlyweightSimulator() {
        random = new Random();
        shapeFactory = new ShapeFactory();
    }
    
    public void run(){
        for (int i = 0; i<30;++i){
            Shape rectangle = shapeFactory.getShape(getRandomColor());
            ((Rectangle)rectangle).setX(getRandomCoordinate());
            ((Rectangle)rectangle).setY(getRandomCoordinate());
            rectangle.draw();
        }
    }

    private String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    private int getRandomCoordinate(){
        return random.nextInt(50);
    }
}
