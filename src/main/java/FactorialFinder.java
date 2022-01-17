public class FactorialFinder {
    public int getFactorial(int i) {

        int result = 1;
        if (i == 0 || i == 1) return result;

        for (int x = 1; x <= i; x++) result *= x;
        return result;
    }
}
