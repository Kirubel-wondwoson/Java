package Function;

import java.util.Scanner;

public class SetterAndGetter3 {
  private String fname;
  private String lname;
  private int rollNum;

  public String getFname(){
    return fname;
  }
  public String getLname(){
    return lname;
  }
  public int getRollNum(){
    return rollNum;
  }
  public void setFname(String fname){
    this.fname = fname;
  }
  public void setLname(String lname){
    this.lname = lname;
  }
  public void setRollNum(int rollNum){
    this.rollNum = rollNum;
  }

  public void acceptDetails(SetterAndGetter3 obj){
    Scanner input = new Scanner(System.in);
    System.out.print("First name : ");
    String fname = input.nextLine();
    System.out.print("Last name : ");
    String lname = input.nextLine();
    System.out.print("Roll number : ");
    int rollNum = input.nextInt();
    obj.setFname(fname);
    obj.setLname(lname);
    obj.setRollNum(rollNum);
  }
  public void displayDetails(){
    System.out.println("Name : " + getFname() + " " + getLname());
    System.out.println("Roll number : " + getRollNum());
  }
  public static void main(String args[]){
    SetterAndGetter3 obj = new SetterAndGetter3();

    // Using accept and display instance Functions
    obj.acceptDetails(obj);
    System.out.println();
    obj.displayDetails();
  }
}
