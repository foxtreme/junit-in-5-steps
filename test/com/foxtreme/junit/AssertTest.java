package com.foxtreme.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(2, 2);
	}
	
	@Test
	void test1() {
		assertTrue(3>1);
	}
	
	@Test
	void test2() {
		assertFalse(3==1);
	}

	@Test
	void test3() {
		assertNotNull(3==1);
	}
	
	@Test
	void test4() {
		assertNull(null);
	}
	
	@Test
	void test5() {
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
	}



}
