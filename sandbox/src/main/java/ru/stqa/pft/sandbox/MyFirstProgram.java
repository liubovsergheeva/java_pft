package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("площадь квадрата состороной"+s.l + "=" + area(s));

        Rectangle r = new Rectangle(4,6);
        System.out.println("площадь прямоугольника со сторонами"+r.a+ "и" +r.b+ "=" + area(r));

        hello("world");
        hello("user");
        hello("Liubov");
        String somebody = "world";
        System.out.println("Hello" + somebody + "!");
        System.out.println("Hello, world!");
        System.out.println(2+2);
        System.out.println(2*2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);
        System.out.println(1.0 / 2);
        System.out.println("1.0" + "2");
        System.out.println("1" + 2);
        System.out.println((2+2)*6);
        System.out.println("2+2=" + 2 + 2);
        System.out.println("2+2=" + (2 + 2));
        System.out.println("Hello"+ "world!");
        System.out.println("площадь квадрата со стороной " + 6 + "=" + (6 * 6));
        int i = 7;
        int ss = i * i;
        System.out.println("площадь квадрата со стороной " + i+ "=" + ss);
        double k = 8;
        double q = k * k;
        System.out.println("площадь квадрата со стороной " + k+ "=" + q);
    }
    public static void hello(String somebody) {
        System.out.println("hello " + somebody + " !!!!!");
    }
    public static double area(Square s) {
        return s.l * s.l;
    }
    public static double area (Rectangle r){
        return r.a * r.b;
    }


}
