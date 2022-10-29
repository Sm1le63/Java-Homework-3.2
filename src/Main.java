public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 73;
        double heightM = 1.74;

        double bmi = service.calculate(weightKg, heightM);
        System.out.printf("%.2f", bmi);
    }
}



