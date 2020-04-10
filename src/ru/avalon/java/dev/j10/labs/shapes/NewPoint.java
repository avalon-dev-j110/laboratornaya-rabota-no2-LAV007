
package ru.avalon.java.dev.j10.labs.shapes;

public class NewPoint implements Point{
    
    private final float x;
    private final float y;
    
    public NewPoint(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
}
