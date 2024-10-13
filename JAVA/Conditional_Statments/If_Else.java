package Conditional_Statments;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = num.nextInt();
        System.out.println("Enter a number : ");
        int b = num.nextInt();
        System.out.println("Enter a number : ");
        int c = num.nextInt();
        int x = 10;
        if(x>=a)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        if(c>b){
            System.out.println("C is greater than B and the value of C is " + c);
        }
        else{
            System.out.println("Hehe");
        }//for else if it is "else if"(syntax)
    }
}
