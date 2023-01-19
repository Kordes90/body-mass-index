public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(150, 50);
        System.out.println(bmi);
    }
}