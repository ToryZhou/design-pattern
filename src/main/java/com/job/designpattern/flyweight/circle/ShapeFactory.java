package com.job.designpattern.flyweight.circle;

import java.util.HashMap;

/**
 * @author toryzhou
 * @since 10/20/20
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    // 需要看下对象数量，检查有没有共享
    public static HashMap<String, Shape> getCircleMap() {
        return circleMap;
    }
}
