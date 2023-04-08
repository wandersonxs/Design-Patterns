package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private Map<String, Shape> shapes;

    public ShapeFactory() {
        this.shapes = new HashMap<>();
    }

    public Shape getShape(String color){
        if(shapes.containsKey(color)){
            return shapes.get(color);
        }
        System.out.println("Creating shape for color " + color);
        Shape shape = new Rectangle(color);
        shapes.put(color,shape);
        return shape;
    }
}
