public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 57;
        int height = 177;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}
