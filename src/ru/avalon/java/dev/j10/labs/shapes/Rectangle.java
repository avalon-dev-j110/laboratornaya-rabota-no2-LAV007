package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon {
    private float firstSide;
    private float secondSide;

    public float getFirstSide() {
        return firstSide;
    }
    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public float getSecondSide() {
        return secondSide;
    }
    public void setSecondSide(float secondSide) {
        this.secondSide = secondSide;
    }

    public Rectangle(float firstSide, float secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    
    
    
    @Override
    public float getArea(){
        float s = getFirstSide() * getSecondSide();
        return s;
    }
    
    @Override
    public float getPerimeter(){
        float p = (getFirstSide() + getSecondSide()) * 2;
        return p;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "The area of RECTANGLE is " + String.format("%.2f", getArea())  + "\n" +
                "The perimeter of RECTANGLE is " + String.format("%.2f", getPerimeter());
    }
    
    public String getName(){
        return "rectangle";
    }
}
