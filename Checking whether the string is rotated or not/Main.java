import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String temp = str1.concat(str1);
    if(temp.contains(str2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}