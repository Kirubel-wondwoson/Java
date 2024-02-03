package Variables;
// This program show the differnce between Static and Instance varaible
public class Counter {
  int count = 0;// what if it is static int count=0;
  static int count2 = 0;
  public void printCounter() {
    count++;
    System.out.println(count);
  }
  public void printCounter2(){
    count2++;
    System.out.println(count2);
  }

  public static void main(String args[]) {
    Counter c1 = new Counter();
    c1.printCounter();
    Counter c2 = new Counter();
    c2.printCounter();
    Counter c3 = new Counter();
    c3.printCounter();

    System.out.println("\n");
    Counter c4 = new Counter();
    c4.printCounter2();
    Counter c5 = new Counter();
    c5.printCounter2();
    Counter c6 = new Counter();
    c6.printCounter2();
  }
}
