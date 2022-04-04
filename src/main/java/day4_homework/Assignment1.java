package day4_homework;

import com.sun.jmx.snmp.Timestamp;

import java.io.IOException;
import java.io.PrintWriter;

public class Assignment1 {
    /*
    1:
    The JDK is a development environment for building applications, applets, and components using the Java programming language.

    Java runtime environment (JRE) is a set of components to create and run a Java application.

    The Java Virtual Machine (JVM) is the runtime engine of the Java Platform, which allows any program written in Java or other language compiled into Java bytecode to run on any computer that has a native JVM.

    2:
    A Java compiler is a program that takes the text file work of a developer and compiles it into a platform-independent Java file.

    3:
    The meaning of platform-independent is that the java compiled code(byte code) can run on all operating systems.

    4:
    An integrated development environment (IDE) is a software suite that consolidates basic tools required to write and test software.

    5:
    Yes.

    6:
    static: the field belongs to the class.
    final: cannot be changed.
    public: can be accessed from everywhere.
    private: can be accessed from within the class.
    void: no return type.
    null: a special literal of null type.
    package: a group of classes and packages.
    class: the basic unit of java programming.
    new: constructor means create new object.

    7:
    primitive type is the data type that belongs to java.
    reference type: a reference to a new object.

    8:
    Java is passed by value.

    9:
    A

    10:
    type a = value;

    11:
    String is not a primitive type.

    12:
    Integer.valueOf.
    */

    public void question13(int x) {
        if (x > 0) doSomething(x);
        else System.out.println("error x < 0");
    }

    public void doSomething(int x) {
        int i = 1, res = 0;
        while (i < x) {
            res += i++;
        }

        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        System.out.println("Current Time Stamp: "+timestamp);

        try {
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    public int[] question15(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int j = arr1.length; j < arr1.length + arr2.length; j++) {
            res[j] = arr2[j - arr1.length];
        }
        return res;
    }

    public int question15(int[] arr) {
        int max = Integer.MIN_VALUE; int secMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secMax = max;
                max = i;
            } else if (i > secMax) {
                secMax = i;
            }
        }

        return secMax;
    }
}
