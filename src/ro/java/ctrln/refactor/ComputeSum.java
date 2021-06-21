package ro.java.ctrln.refactor;

public class ComputeSum {
    public static void main(String[] args) {
        Sum sumInMain = new Sum();
        sumInMain.setA(3);
        sumInMain.setB(5);
        Adder adder = new Adder();
        System.out.println("Suma este: " + adder.sumOfNumbers(sumInMain));
    }
}
