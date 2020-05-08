import java.util.Scanner;
class Main {
  public static int greaterNumber(int n1, int n2) {
    if (n1 > n2) {
      return n1;
    } else {
      return n2;
    }
  }
  public static void main (String[] args) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    System.out.println(greaterNumber(n1, greaterNumber(n2, n3)));
  }
}