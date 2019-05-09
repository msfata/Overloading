
package com.oop.overload;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author msfata programming help
 */
public class OverLoading {
	private int num;

	/*
	 * method overloading
	 */
	public static int plus(OverLoading a, OverLoading b) {
		a.num = 100;
		b.num = 20;
		return a.num + b.num;
	}

	public static int min(OverLoading a, OverLoading b) {
		a.num = 100;
		b.num = 20;
		return a.num - b.num;
	}

	public static int dev(OverLoading a, OverLoading b) {
		a.num = 100;
		b.num = 20;
		return a.num / b.num;
	}

	public static int mult(OverLoading a, OverLoading b) {
		a.num = 100;
		b.num = 20;
		return a.num * b.num;
	}

	/*
	 * testing plus method
	 */
	@Test
	void plusTest() {
		OverLoading o1 = new OverLoading();
		OverLoading o2 = new OverLoading();
		assertEquals(120, plus(o1, o2));
	}

	/*
	 * testing mult method
	 */
	@Test
	void multTest() {
		OverLoading o1 = new OverLoading();
		OverLoading o2 = new OverLoading();
		assertEquals(2000, mult(o1, o2));
	}

	/*
	 * testing min method
	 */
	@Test
	void minTest() {
		OverLoading o1 = new OverLoading();
		OverLoading o2 = new OverLoading();
		assertEquals(80, min(o1, o2));
	}

	/*
	 * testing dev method
	 */
	@Test
	void devTest() {
		OverLoading o1 = new OverLoading();
		OverLoading o2 = new OverLoading();
		assertEquals(5, dev(o1, o2));
	}
}
