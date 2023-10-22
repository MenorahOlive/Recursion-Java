/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author olive
 */

public class Recursion {
private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    private static void countdown(){
      
        System.out.println("Kindly input a value");
        int n = scanner.nextInt();
        if  (n > 0){
        System.out.println(n);
        }
        else
        {
        System.out.println("done");
        }
             
    }
    public static void main(String[] args) {
      countdown();
    }
    
}
