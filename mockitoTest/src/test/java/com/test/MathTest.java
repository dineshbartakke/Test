package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathTest {
	Math mathObj;

	@Before
	public void create() {
		mathObj = new Math();
	}

	@Test
	public void testAdd() {
		assertEquals(5, mathObj.add(2, 3));
		// assertEquals(message, expected, actual);

		//assertNull(mathObj);
		assertEquals(5, mathObj.add(2,3));
	}

}
