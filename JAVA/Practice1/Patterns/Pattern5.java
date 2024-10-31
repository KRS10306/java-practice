import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    if (n>=1 && n<=20) {
            int count = 1;
            int x = 0;
            int y = 0;
            int z = 1;
            int r = 0;
            for (int i = 0; i < n; i++) {
                x = n - count;
                y = n - count;
                while (x>0) {
                        System.out.print(" ");
                        x--;
                    }
                    if (count == 1) {
                        for (int j = 0; j < z; j++) {
                            System.out.print("*");
                        }
                    }
                    else{
                        r = count + z;
                        for (int j = 0; j < r; j++) {
                            System.out.print("*");
                        }
                        z++;
                    }
                while (y>0) {
                        System.out.print(" ");
                        y--;
                    }
                count++;
                System.out.println("");
            }
        }
  }
}
