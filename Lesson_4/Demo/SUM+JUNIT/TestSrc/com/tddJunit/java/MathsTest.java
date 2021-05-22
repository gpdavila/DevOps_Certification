package com.tddJunit.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {

	private Maths maths;
	
	@Before
	public void setUp() throws Exception {

		
		maths = new Maths();
	}

	@Test
	public void testAdd() {
		//comment-3 : fail("Not yet implemented");

		long result = 10+2;
		assertEquals(result,maths.add(10,2));
		
	}

	@Test
	public void testSubtract() {
	//comment-5: fail("Not yet implemented");
	/* comment-6: long result = 10-2;
		assertEquals(result, classundertest.subtract(10,2));*/	
		long result = 10-2;
		assertEquals(result, maths.subtract(10,2));
		
	}

}
