public class FactorialFinder {
    public int getFactorial(int number) {

        int result = 1;
        if (number == 0 || number == 1) return result;

        for (int x = 1; x <= number; x++) result *= x;
        return result;
    }
}