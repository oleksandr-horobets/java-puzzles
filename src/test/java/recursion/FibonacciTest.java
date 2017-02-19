package recursion;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    private Fibonacci fibonacci;

    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidN() {
        fibonacci.fibonacci(0);
    }

    @Test
    public void first() {
        assertThat(fibonacci.fibonacci(1)).isEqualTo(1);
    }

    @Test
    public void second() {
        assertThat(fibonacci.fibonacci(2)).isEqualTo(1);
    }

    @Test
    public void third() {
        assertThat(fibonacci.fibonacci(3)).isEqualTo(2);
    }

    @Test
    public void fourth() {
        assertThat(fibonacci.fibonacci(4)).isEqualTo(3);
    }

    @Test
    public void fifth() {
        assertThat(fibonacci.fibonacci(5)).isEqualTo(5);
    }

    @Test
    public void sixth() {
        assertThat(fibonacci.fibonacci(6)).isEqualTo(8);
    }
}
