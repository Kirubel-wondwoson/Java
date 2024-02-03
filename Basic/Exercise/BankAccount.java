package Exercises;

class Account {
  String accNum;
  String name;
  double amount;

  void insert(String accNumber, String accHolderName, double balance) {
    accNum = accNumber;
    name = accHolderName;
    amount = balance;
  }
  void deposit(double addedMoney){
    amount = amount + addedMoney;
    System.out.println(addedMoney + " deposited");
  }
  void withDraw(double withDrawedMoney){
    if(amount < withDrawedMoney){
      System.out.println("Insufficient Balance");
    }
    else{
      amount = amount - withDrawedMoney;
      System.out.println(withDrawedMoney + " Withdrawn");
    }
  }
  void checkBalance(){
    System.out.println("Current Balance : " + amount);
  }
  void display(){
    System.out.println("Account Number : " + accNum);
    System.out.println("Account Holder Name : " + name);
    System.out.println("Current Balance : " + amount);
  }
}

public class BankAccount {

  public static void main(String args[]) {
    Account a1 = new Account() , a2 = new Account();
    // Account 1
    a1.insert("1000324049162", "Kirubel Wondwoson", 10000);
    a1.checkBalance();
    a1.deposit(500);
    a1.withDraw(200);
    a1.checkBalance();
    a1.display();
    System.out.println();
    
    // Account 2
    a2.insert("100015523421", "Abeni", 20000);
    a2.checkBalance();
    a2.deposit(1000);
    a2.withDraw(300);
    a2.checkBalance();
    a2.display();

  }
}
