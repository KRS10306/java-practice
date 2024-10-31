import java.util.Scanner;

public class First{
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int num = a.nextInt();
    int x = 0;
    int count = 0;
    while(num>0 && num<100000){
      x = num%10;
      num = num/10;
      System.out.print(x + "    ");
      count++;
    }
    System.out.println("Number of digits: "+count);
  }
}
