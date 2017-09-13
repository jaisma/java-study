package com.jys.epi;

/**
 * Variant 4.1 
 * Write expressions that use bitwise operators, equality checks,
 * and boolean operators to do the following in o(1) time.
 * 
 * Assuming good input for all. void methods, sysout result - no test cases.
 * 
 * @author js044486
 *
 */
public class C4P1 {

	/**
	 * Right propagate the rightmost set bit in x, e.g., turns (01010000)_2 to
	 * (01011111)_2.
	 * 
	 * @param x
	 *            long input number
	 */
	public void rightPropagate(long x) {
		System.out.println("Input:  " + Long.toBinaryString(x));
		long oneOff = x - 1;
		System.out.println("Output: " + Long.toBinaryString(x | oneOff));

		// improvements:
		// if i break down the input into multiple segments, it will be faster
		// x & ~ (x - 1) extracts lowest set bit of x. i can prob use this
	}

	/**
	 * Compute x mod a power of two, e.g., returns 13 for 77 mod 64.
	 * 
	 * @param x
	 *            int input number
	 * @param exp
	 *            int input power
	 */
	public void computeModPowerTwo(int x, int exp) {
		System.out.println("Input number: " + x + " Input power: " + exp);
		if (x > 0 && exp > 0 && (exp & (exp - 1)) == 0) {
			System.out.println(x % exp);
			return;
		}
		System.out.println("invalid input");

		// improvements:
		//
	}

	/**
	 * Test if x is a power of 2, i.e., evaluates to true for x = 1,2,4,8,..., false
	 * for all other values.
	 * 
	 * @param x
	 *            int input number
	 */
	public void isPowerOfTwo(long x) {
		if (x > 0 && (x & (x - 1)) == 0) {
			System.out.println(true);
			return;
		}
		System.out.println(false);

		// improvements:
		//
	}
}