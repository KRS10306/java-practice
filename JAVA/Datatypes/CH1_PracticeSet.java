import java.util.Scanner;
public class CH1_PracticeSet {
    public static void main(String[] args) {
        //Question 1 --> Add any three numbers.
        int a = 64;
        int b = 74;
        int c = 84;
        int sum = a + b + c;
        System.out.println("Sum is: " + sum);
//        Question 2 --> Write a program to calculate GPA using marks of 3 subjects (out of 100).
        double subject1 = 97.5;
        double subject2 = 95;
        double subject3 = 96;
        double cgpa = ((subject1 + subject2 + subject3) / 30);
        System.out.println("CGPA is: " + cgpa);
        //Question 3 --> Write a program asking user for his/her name and print "Hello <name>, have a good day"
        Scanner name = new Scanner(System.in);
        System.out.print("What is your First name: ");
        String username = name.next();
        System.out.print("What is your Surname name: ");
        String Surname = name.next();
        System.out.println("Hello " + username + " "+ Surname+", have a good day");
        //Question 4 -->Convert Kilometers to miles.
        Scanner km = new Scanner(System.in);
        System.out.print("Write a distance in Kilometers: ");
        double distance = km.nextInt();
        double miles= distance*0.6213712;
        System.out.println(distance + " Kilometers in miles is : " + miles);
        //Question 5 --> Write a program to detect whether number entered by user is integer of not
        Scanner int_or_not = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        boolean T_or_F = int_or_not.hasNextInt();
        System.out.println(T_or_F);
    }
}
