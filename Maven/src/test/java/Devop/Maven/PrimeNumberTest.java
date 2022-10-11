package Devop.Maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeNumberTest {
	@Test
public void check() {
           PrimeNumber n = new PrimeNumber();
           boolean b = PrimeNumber.isPrime(19);
           assertEquals(true,b);
}

}

