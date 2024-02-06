package Exercises.Final;

class Class1 {
    int i, y;

    Class1(int x) {
        i = x;
        y = x * x;
    }

    int func1() {
        return func3();
    }

    int func2() {
        return 5 * y;
    }

    int func3() {
        return 100 - func2() + y;
    }
}

public class Exercise1 extends Class1 {
    int i;
    static int v;

    Exercise1(int x) {
        super(x);
        i = x;
    }

    int func2() {
        return 2 * i;
    }

    int func3() {
        return y + (int) Math.pow(func2(), 0.5);
    }

    public static void main(String args[]) {
        Class1 e = new Class1(1);
        Exercise1 s = new Exercise1(5);
        Class1 e2 = s;
        System.out.println(e.i);
        System.out.println(s.i);
        System.out.println(e.func1());
        System.out.println(s.func2());
        System.out.println(e2.func1());
        System.out.println(Exercise1.v); // Accessing static variable using class name
    }
}
