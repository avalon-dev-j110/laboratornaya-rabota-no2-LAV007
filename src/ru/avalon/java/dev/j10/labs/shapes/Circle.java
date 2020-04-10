package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Ellipse{
    
    private final NewPoint center;
    private final float radius;
    
    public Circle (NewPoint center, float radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public float getX(){
        return center.getX();
    }
    
    public float getY(){
        return center.getY();
    }
    
    @Override
    public float getArea(){        
        float s = (float) Math.PI * (this.radius * this.radius);        
        return s;
    }
    
    @Override
    public float getLength(){
        float l = (float) (2 * Math.PI) * this.radius;
        return l;    
    }
    
    @Override
    public String toString() {
        return "The area of CIRCLE is = " + String.format("%.2f", getArea()) + "\n" +
                "The length of CIRCLE is = " + String.format("%.2f", getLength());
    }
    
    
    public String getName(){
        return "circle";
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
}
