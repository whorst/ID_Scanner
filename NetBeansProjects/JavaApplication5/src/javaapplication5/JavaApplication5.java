/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Willy
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x = (System.currentTimeMillis()) + 4000;
        System.out.println(x);
        System.out.println(System.currentTimeMillis());

		//currTimeCheck(x);
    }

    public static void currTimeCheck(long x) {

        while (x == (System.currentTimeMillis() / 1000)) {

            System.out.println("Hi");
        }

    }
}
