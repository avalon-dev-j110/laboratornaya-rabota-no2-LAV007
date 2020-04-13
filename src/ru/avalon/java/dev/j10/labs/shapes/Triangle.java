package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
    
    private float firstSide;
    private float secondSide;
    private float thirdSide;
    
    public Triangle(float firstSide, float secondSide, float thirdSide){
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.thirdSide = thirdSide;
    }

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

    public float getThirdSide() {
        return thirdSide;
    }
    public void setThirdSide(float thirdSide) {
        this.thirdSide = thirdSide;
    }
        
    @Override
    public float getArea(){
        float p = (float)getPerimeter() * 0.5f;
        float s = (float) Math.sqrt(p * (p - getFirstSide()) * (p - getSecondSide()) *
                   (p - getThirdSide()));
        return s;
    }
    
    /**
     *  if (Float.valueOf(i).isNaN()) System.out.println("Значение функции не определено");
               else System.out.println(shapes[i] + "\n");
     */
    
    @Override
    public float getPerimeter(){
        float p = getFirstSide() + getSecondSide() + getThirdSide();
        return p;
    }
    
    @Override
    public String toString() {
        return "The area of TRIANGLE is " + String.format("%.2f", getArea()) + "\n" +
                "The perimeter of TRIANGLE is " + String.format("%.2f", getPerimeter());
    }
        
    public String getName(){
        return "triangle";
    }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
