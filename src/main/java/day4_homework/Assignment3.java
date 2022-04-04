package day4_homework;

import java.util.*;

public class Assignment3 {
    /*
     * 1:
     * Polymorphism allows us to put same action in different way.
     *
     * 2:
     * Overloading means implement same method with different parameters.
     *
     * 3:
     * Overriding means inherit the same with method with different implementation.
     *
     * 4:
     * It means you cannot change this object within this method.
     *
     * 5:
     * We will get a compilation error.
     *
     * 6:
     * cannot.
     *
     * 7:
     * Interface cannot have any implementation, abstract class can.
     *
     * 8:
     * Yes.
     *
     * 9:
     * It could be used by its subclass to initialize the non-abstract method.
     *
     * 10:
     * Native methods are Java methods that start in a language other than Java.
     *
     * 11:
     * A marker interface is an interface that has no methods or constants inside it.
     *
     * 12:
     * You must override hashCode() in every class that overrides equals().
     * Failure to do so will result in a violation of the general contract for Object.hashCode(),
     * which will prevent your class from functioning properly in conjunction with all hash-based collections,
     * including HashMap, HashSet, and Hashtable.
     *
     * 13:
     * Integer is the wrapper class of int.
     *
     * 14:
     * Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
     *
     *
     * */

    public List<Integer> quesiont15(List<Integer> list, Map<String, String> map) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (String s : map.keySet()) {
            set.add(Integer.valueOf(map.get(s)));
        }
        for (int i : list) {
            if (!set.contains(i)) list.add(i);
        }
        return res;
    }

    //Question16
    public abstract class Shape implements Comparable<Shape> {
        public abstract double area();
        public int compareTo(Shape s) {
            return (int) (this.area() - s.area());
        }
    }

    public class Rectangle extends Shape {
        private final double width, length;
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        @Override
        public double area() {
            return width * length;
        }
    }

    public class Circle extends Shape {
        private final double radius;
        final double pi = Math.PI;
        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return pi * Math.pow(radius, 2);
        }
    }

    public class Square extends Shape {
        private final double a;
        public Square(double a) {
            this.a = a;
        }

        @Override
        public double area() {
            double s = a * a;
            return s;
        }
    }
}
