package ra.session04.ex2;

public class QuadraticEquation {
    private double a,b,c;



    public QuadraticEquation() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = (b*b) - (4*a*c);
        return delta;
    }

    public double getRoot1() {
        double root1 = ( -b - Math.sqrt(getDiscriminant()) / 2*a);
        return root1;
    }

    public double getRoot2() {
        double root2 = ( -b + Math.sqrt(getDiscriminant()) / 2*a);
        return root2;
    }



}
