package homework2_1;

import java.util.Comparator;

public class homework2_1 {
    /*
    1: What is JVM?
        A Java virtual machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs
        written in other languages that are also compiled to Java bytecode.
        It is composited with:
        1.classloader.
        2.JVM memory:
            Method Area, Heap, JVM Language Stacks, PC Registers, Native Method Stacks
        3.Execution Engine.
        4.Native Method Interface.
        5.Native Method Libraries.
    * */
    public static void main(String[] args) {
        class MyNode implements Comparable<MyNode> {
            int value;

            public MyNode(int v) {
                this.value = v;
            }

            @Override
            public int compareTo(MyNode other) {
                return value - other.value;
            }
        }

        class myComparator implements Comparator<MyNode> {
            public int compare(MyNode m1, MyNode m2) {
                return m1.value - m2.value;
            }
        }
    }
}
