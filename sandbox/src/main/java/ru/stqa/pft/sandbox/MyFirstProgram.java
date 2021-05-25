package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        double len = 5;
        System.out.println("площадь квадрата состороной"+len + "=" + area(len));

        double a=4;
        double b=6;
        System.out.println("площадь прямоугольника со сторонами"+a+ "и" +b+ "=" + area(a,b));

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
        int l = 7;
        int s = l * l;
        System.out.println("площадь квадрата со стороной " + l+ "=" + s);
        double k = 8;
        double q = k * k;
        System.out.println("площадь квадрата со стороной " + k+ "=" + q);
    }
    public static void hello(String somebody) {
        System.out.println("hello " + somebody + " !!!!!");
    }
    public static double area(double pi) {
        return pi * pi;
    }
    public static double area (double a, double b){
        return a * b;
    }


}
