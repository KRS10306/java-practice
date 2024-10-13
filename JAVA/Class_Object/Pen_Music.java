class Computer{
  public void playMusic(){//If we are writing void (meaning empty) we cannot use the keyword return
    System.out.print("Music Playing...");
  }
  public String getMeaPen(int cost){
    if(cost>=10)
      return "Here's a pen";
    else
      return "Nothing";//We can write return "Nothing" without writing else
  }
}


public class Pen_Music{
  public static void main(String[] args) {
    Computer obj = new Computer();
    obj.playMusic();//we cannot assign it a variable to it since it would not return anything(void)
    int num1 = 2;
    String r = obj.getMeaPen(num1);
    System.out.println(r);
  }
}
