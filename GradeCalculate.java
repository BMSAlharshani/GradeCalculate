/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculate;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mczo4
 */
public class GradeCalculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in); 
        System.out.print(" please enter the number of courses :  "); 
        int sum = 0 ;
        int num = scan.nextInt(); 
        int [] Grads = new int[num] ;
        for (int i = 0 ; i <Grads.length ; i++ ){
            System.out.println("Enter the grade " +(i+1));
            Grads[i] = scan.nextInt(); 
            sum = Grads[i]+sum;
            
        }
        System.out.println(Arrays.toString(Grads));
        System.out.println("the avarge is " + (sum)/(num));
    }
    
}
