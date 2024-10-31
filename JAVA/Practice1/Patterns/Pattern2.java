public class Pattern2 {
  public static void main(String[] args) {
    int count = 1;
    for (int i = 0 ;i< 4 ;i++ ) {
      for (int j = 0;j< count ;j++ ) {
        System.out.print("*");
      }
      count++;
      System.out.println("");
    }
  }
}
