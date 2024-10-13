import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter your marks in English out of 100 : ");
        float eng=marks.nextFloat();
        System.out.print("Enter your marks in Physics out of 100 : ");
        float phy=marks.nextFloat();
        System.out.print("Enter your marks in Maths out of 100 : ");
        float math = marks.nextFloat();
        System.out.print("Enter your marks in Chemistry out of 100 : ");
        float chem = marks.nextFloat();
        System.out.print("Enter your marks in Computer Science out of 100 : ");
        float comp = marks.nextFloat();
        float sum = (eng + phy + math + chem + comp);
        float per = sum*100/500 ;
        System.out.println("Your average percentage in all subjects is "+per);
    }
}
