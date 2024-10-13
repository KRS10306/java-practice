package Conditional_Statments;

import java.util.Scanner;

public interface switch_statment {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 : ");
        int n = Number.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered a wrong value");
        }

        //Another way of writing switch case in newer version

        Number.nextLine(); // consume the newline character left after reading int
        //can convert Number into that string but not a good thing to do 

        System.out.print("Enter a day : ");
        String day = Number.next();
        switch (day) { //Using String in switch statment came after version 5 of java
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("Wake Up at 6am");
            
            case "Sunday","Saturday" -> System.out.println("Wake Up at 8am");

            default ->  System.out.println("Enter a valid day");
        }
        //If using arrow use it in all the cases and write everything in same line

        //Another way of writing switch case in newer version

        Number.nextLine(); // consume the newline character left after reading int
        System.out.print("Enter a month : ");
        String month = Number.nextLine();
        String result = "";
        result = switch (month) {
            case "January","March","May","July","August","October","December" -> "31";
            case "April","June","September","November" -> "30";
            case "Feburary" -> "29";
            default -> "NotValid";
        };
        System.out.println(result);


        //One more way
        System.out.print("Enter a year : ");
        int yr = Number.nextInt();
        String result2 = "";
        switch (yr%4){
            case 0 -> result2 = "Leap Year";
            default -> result2 = "Not a Leap Year";
        }
        System.out.println(result2);

        //One more way
        System.out.print("Enter a year : ");
        int yr2 = Number.nextInt();
        String result3 = "";
        result3 =switch (yr2%4){
            case 0 : yield "Leap Year";
            default : yield "Not a Leap Year";
        };
        System.out.println(result3);
    }
}
