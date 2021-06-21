package ro.java.ctrln.initial;

public class ComputeSum {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Sum sum = new Sum();
        System.out.println("Suma este: " + sum.sumOfNumbers(a,b));
        System.out.println("Suma este: " + sum.sumOfNumbers(b,a));
        System.out.println("Suma este: " + sum.sumOfNumbers(5,3));
        System.out.println("Suma este: " + sum.sumOfNumbers(3,5));

    }
}
