import java.util.Scanner;

public class Pattern1 {
  public static void main(String [] args) {
    Scanner a = new Scanner(System.in);

    int n = a.nextInt();

    if(n>=1 && n<=25){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
  }
}
