import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int a = 0;
        int b = 0;
        int c = 2*n-1;
        if(n >= 1 && n <= 100){
            for(int i = 0;i<c;i++){
                for(int j=0;j<c;j++){
                    a=Math.abs(i-n+1); //Here, Math.abs is used to get the absolute value of the difference between i and n+1
                    b=Math.abs(j-n+1);
                    System.out.print(Math.max(a,b)+1);
                }
                System.out.println();
            }
    }
}
}