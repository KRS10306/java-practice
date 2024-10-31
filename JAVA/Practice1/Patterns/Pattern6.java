import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    if (n>=1 && n<=20) {
            int count = n;
            int x = 0;
            int y = 0;
            int z = n-1;
            int r = 0;
            for (int i = 0; i < n; i++) {
                x = n - count;
                y = n - count;
                while (x>0) {
                        System.out.print(" ");
                        x--;
                    }
                    if (z == 0) {
                        for (int j = 0; j < count; j++) {
                            System.out.print("*");
                        }
                    }
                    else{
                        r = count + z;
                        for (int j = r; j > 0; j--) {
                            System.out.print("*");
                        }
                        z--;
                    }
                while (y>0) {
                        System.out.print(" ");
                        y--;
                    }
                count--;
                System.out.println("");
            }
        }
  }
}
