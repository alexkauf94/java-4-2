public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        double meters = 1.87;
        int kilograms = 98;
        int index = calculate.calculate(meters, kilograms);
        System.out.println(index);
    }
}