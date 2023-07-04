public class BmiService {

    public int calculate(int kg, double meter) {
        int index = (int) (kg / (meter * meter));
        return index;
    }
}
