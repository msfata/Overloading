/**
 * 
 */
package com.oop.overload;

/**
 * @author msfata programmingHelp
 *
 */
public class MethodOverload {
	/*
	 * run method int
	 */
	private void run(int number) {
		System.out.println("Integer : " + number);
	}

	/*
	 * run method double
	 */
	private void run(double number) {
		System.out.println("Double : " + number);
	}

	/*
	 * run method float
	 */
	private void run(float number) {
		System.out.println("Float : " + number);
	}

	/*
	 * testing three forms of run methods
	 */
	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		mo.run(100);
		mo.run(100.2);
		mo.run(100.2f);
	}
}
