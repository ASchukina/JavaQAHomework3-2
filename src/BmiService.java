public class BmiService {
    public int calculate (double weightKg, double heightM) {
        double result = weightKg / (heightM * heightM);
        int index = (int) result;
        return index;
    }
}
