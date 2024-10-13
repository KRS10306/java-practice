package Loop;

public class while_loop {
    public static void main(String[] args) {
        int i = 0;
        while(i<=4){
            System.out.println("Hi " + i);
            int j = 0;
            while (j<=3) { //Loop inside loop is called nested loop
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
    }
}
