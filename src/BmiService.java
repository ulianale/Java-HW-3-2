public class BmiService {

    public int calculate(int weight, int height) {
        return 10_000 * weight / (height * height);
    }
}
