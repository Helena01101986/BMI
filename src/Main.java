public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50.0;
        double height = 1.60;
        double bmi = service.calculate(weight, height);

        System.out.println(bmi);
    }
}