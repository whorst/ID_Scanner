/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Willy
 */
public class carrot {

    static Scanner in = new Scanner(System.in);

    static int first;
    static int second;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

             while (in.hasNext()) {
            if (in.hasNextInt()) {
                first = in.nextInt();
                second = in.nextInt();
            
                describe(first, second);
                
                // System.out.println(in.nextInt());
            } else {
                in.next();
            }
        }
    }

    public static void describe(int first, int second) {
        for(int i = 0; i < first; i++){
            Scanner kb = new Scanner(System.in);
            kb.nextLine();
        
        }
        System.out.println(second);
        
    }
}
