import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String strSub = sc.nextLine();
    String strNew = sc.nextLine();
    String temp = str.replace(strSub, strNew);
    System.out.println(temp);
  }
}