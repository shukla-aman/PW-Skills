public class Main
{
  public static void main(String[] args) {
    int num1=2;
    int num2=3;
    System.out.println("First number :" + num1);
    System.out.println("Second number : " + num2);
    int temp;
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("First number after swap is :" + num1);
    System.out.println("Second number after swap is : " + num2);
  }
}
