package ra.session04.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng quadraticEquation
        QuadraticEquation eq = new QuadraticEquation();
        eq.setA(1);
        eq.setB(-2);
        eq.setC(1);

        System.out.println(eq.getDiscriminant());
        System.out.println("Nghiệm 1 = " + eq.getRoot1());
        System.out.println("Nghiệm 2 = " + eq.getRoot2());
    }
}
