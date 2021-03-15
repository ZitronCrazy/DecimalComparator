public class Main {

    public static void main(String[] args) {
        boolean a = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        boolean b = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean c = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean d = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123);
    }
}
