package com.company;

public class Main {

    public static void main(String[] args) {
        // вариант 5
        Formula test = new Formula();
        test.set(-15.246 ,4.642*Math.pow(10,-2),20.001*Math.pow(10,2));
        test.run();
        test.print();

    }
}
class Formula {
    double x, y, z, result;

    void set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void run() {
        double result =Math.log(Math.pow(y,Math.pow(Math.abs(y),(-0.5)))*(x-(0.5*y)))+Math.pow(Math.sin(Math.atan(z)),2);
        this.result = result;
    }


    void print() {
        System.out.print(result);
    }
}