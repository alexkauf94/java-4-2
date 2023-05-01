public class BmiService {
    public int calculate(double meters, int kilograms) {
        return (int) (kilograms / (meters * meters));
    }
}
