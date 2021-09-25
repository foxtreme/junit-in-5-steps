package com.foxtreme.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();

	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterAll
	public static void afterclass() {
		System.out.println("After class");
	}
	
	/**
	 * MyMath.sum
	 * 1,2,3 => 6
	 */
	@Test
	public void sum_with3numbers() {
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}

	/**
	 * MyMath.sum
	 * 3 => 3
	 */
	@Test
	public void sum_with1number() {
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
