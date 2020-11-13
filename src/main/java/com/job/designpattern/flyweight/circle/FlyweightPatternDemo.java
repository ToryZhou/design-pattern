package com.job.designpattern.flyweight.circle;

/**
 * @author toryzhou
 * @since 10/20/20
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        //为了直观展示，所以输出结果看, 看看x的值
        Circle circle1 = (Circle)ShapeFactory.getCircle("Red");
        circle1.setX(1);
        System.out.println("size: " + ShapeFactory.getCircleMap().size());
        Circle circle2 = (Circle)ShapeFactory.getCircle("Red");
        circle2.setX(2);
        System.out.println("size: " + ShapeFactory.getCircleMap().size());
        System.out.println("circle1.getX(): " + circle1.getX());
        System.out.println("circle2.getX(): " + circle2.getX());
        circle1.draw();
        circle2.draw();
        // 结论: x的值是外部状态，是会随着客户端环境变化，所以circle1的 x 的值也改变了

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
