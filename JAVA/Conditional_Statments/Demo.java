class Calc{
    int a;

    public int add(int n1,int n2){
        int result = n1 + n2;
        return result;
    }
}

public class Demo{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Calc c = new Calc();
        int r = c.add(num1,num2);
        System.out.println(r);
    }
}