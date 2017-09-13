package com.jys.epi.cfour;

public class BitOperations {

	/**
	 * Convert decimal to binary representation. assuming int is 32 bits max.
	 * 
	 * @param x
	 * @return binary representation of input int in string format
	 */
	public String toBinary(int x) {
		int binary[] = new int[32];
		int index = 0;
		while (x > 0) {
			binary[index++] = x % 2;
			x = x / 2;
		}

		StringBuilder sb = new StringBuilder(index);
		for (int i = index - 1; i >= 0; i--) {
			sb.append(binary[i]);
		}

		return sb.toString();
	}

	/**
	 * Counts number of 1's in given int in bits.
	 * 
	 * While x is not 0, see
	 * 
	 * @param x
	 * @return number of bits
	 */
	public short countBitsOfOne(int x) {
		short numBits = 0;
		while (x != 0) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	
	

}
