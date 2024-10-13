package Conditional_Statments;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String a[]){
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        byte b = Number.nextByte();
        // String result = 'Hello';
        // if(b%2==0)
        //     // result = 'Even';
        //     System.out.println("Even");
        // else
        //     // result = 'Odd';
        //     System.out.println("Odd");

        // // System.out.println(result);
        String t = "Even";
        String f = "False";//'' valid in char not in string 
        // if(b%2==0)
        //     // result = 'Even';
        //     System.out.println(t);
        // else
        //     // result = 'Odd';
        //     System.out.println(f);

        String result = b%2==0? t : f;
        System.out.println(result);
    }
}
