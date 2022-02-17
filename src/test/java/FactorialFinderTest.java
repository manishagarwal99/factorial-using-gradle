import org.junit.jupiter.api.Test;

class FactorialFinderTest {
    //use @setup
    //check test template for exception
    @Test()
    void shouldReturnOneForZero() {
        int actual_fact, expected_fact=1;
        FactorialFinder factorialFinder = new FactorialFinder();
        actual_fact = factorialFinder.getFactorial(0);
        assert actual_fact==expected_fact;
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