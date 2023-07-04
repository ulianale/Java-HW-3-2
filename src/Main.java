public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 57;
        double meter = 1.77;
        System.out.println(service.calculate(kg, meter));
    }
}
