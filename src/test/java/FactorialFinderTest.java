import org.junit.jupiter.api.Test;

class FactorialFinderTest {

    @Test
    void shouldReturnOneForZero() {
        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.getFactorial(0) == 1;
    }

    @Test
    void shouldReturnOneForOne() {

        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.getFactorial(1) == 1;
    }

    @Test
    void shouldReturnOneTwentyForFive() {

        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.getFactorial(5) == 120;
    }
}