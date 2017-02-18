package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidN(){
        factorial.factorial(-1);
    }

    @Test
    public void factorialOfZero() {
        assertThat(factorial.factorial(0)).isEqualTo(1);
    }

    @Test
    public void factorialOfOne() {
        assertThat(factorial.factorial(1)).isEqualTo(1);
    }

    @Test
    public void factorialOfTwo() {
        assertThat(factorial.factorial(2)).isEqualTo(2);
    }

    @Test
    public void factorialOfThree() {
        assertThat(factorial.factorial(3)).isEqualTo(6);
    }

    @Test
    public void factorialOfFour() {
        assertThat(factorial.factorial(4)).isEqualTo(24);
    }
}
