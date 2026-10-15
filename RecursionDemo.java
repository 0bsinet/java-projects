public class RecursionDemo {
  public static int sumTo(int n){
    if (n == 0){
      return 0;
    }
    return n + sumTo(n-1);
  }
  public static void main(String[] args) {
    int n = 0;
    System.out.println("Sum: " + sumTo(n));
  }
}