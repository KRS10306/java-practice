public class Basic{
  public static void main(String[] args) {
    int num[] = {3,7,2,4};
    System.out.println(num[0]);
    num[0] = 10; //we can update the value like this
    System.out.println(num[0]);
    int num1[] = new int [4]; //Intially they are zero all the 4 values
    System.out.println(num1[1] + "  " + num1[2] + "  " + num1[3]);
    num1[1] = 20;
    num1[2] = 10;
    num1[3] = 30;
    System.out.println(num1[1] + "  " + num1[2] + "  " + num1[3]);

    //To print all the values
    for (int i = 0;i<=3 ;i++ ) {
      System.out.print(num[i] + "   ");
    }
  }
}
