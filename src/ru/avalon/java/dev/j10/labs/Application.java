package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;


public class Application {

    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[10];
        for(int i = 0; i < 10; i++){
            int x = (int)(Math.random()*3);
            switch (x){
                case 0:
                    shapes[i] = new Circle(new NewPoint((float)(Math.random()*100), (float)(Math.random()*100)),
                            (float)(Math.random()*100));
                    break;
                case 1:
                    shapes[i] = new Rectangle((float)Math.random() * 10f, (float)Math.random() * 10f);
                    break;
                case 2:
                    //shapes[i] = new Triangle(3f, 4f, 5f);
                    shapes[i] = new Triangle((float)Math.random() * 10f, (float)Math.random() * 10f, (float)Math.random() * 10f);
                    break;
            }
        }
           for (int i = 0; i < shapes.length; i++) System.out.println(shapes[i] + "\n");
           
           
                      
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * +1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */        
    } 
    
    public static String findMaxArea(Shape[] shapes){
            float max = 0;
            String name = null;
            for(int i = 0; i < shapes.length; i++){
                if(max < shapes[i].getArea()){
                    max = shapes[i].getArea();
                    name = shapes[i].getName();
            }
        }
        return "The maximum area is " + name + "'s area with result is " + String.format("%.2f", max);
        }
}
