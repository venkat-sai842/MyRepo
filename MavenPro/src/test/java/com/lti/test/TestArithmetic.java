package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class TestArithmetic {
    private Arithmetic arth;
	
	@Before
	public void init() {
		arth = new Arithmetic();
	}
	
	
	@Test
	public void testSum() {
		assertEquals(10,arth.sum(4, 6));
	}
	
	@Test
	public void testSub() {
		assertEquals(5, arth.sub(5, 10));
	}


}