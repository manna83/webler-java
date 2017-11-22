package hu.webler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindOutTheNumberTest {

	@Test
	void testCheck() {
		FindOutTheNumber test = new FindOutTheNumber();
		test.secret = 50;
		
		assertEquals(test.check(51), "kisebb");
		assertEquals(test.check(49), "nagyobb");
		assertEquals(test.check(50), "BINGÓ");
	}

}
