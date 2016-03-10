/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Willy
 */
public class exception {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		long x = (System.currentTimeMillis() / 100) + 40;
		System.out.println(x);
		System.out.println(System.currentTimeMillis() / 100);

		//currTimeCheck(x);

	}

	public static void currTimeCheck(long x) {

		while (x == (System.currentTimeMillis() / 1000)) {

			System.out.println("Hi");
		}
	}
}