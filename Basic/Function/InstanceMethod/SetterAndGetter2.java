package Function;

import javax.swing.plaf.synth.SynthStyle;
import java.util.*;

public class SetterAndGetter2 {
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

  public void acceptDetails(SetterAndGetter2 obj){
    obj.setFname("Kirubel");
    obj.setLname("Wondwoson");
    obj.setRollNum(2);
  }
  public void displayDetails(){
    System.out.println("Name : " + getFname() + " " + getLname());
    System.out.println("Roll number : " + getRollNum());
  }
  public static void main(String args[]){
    SetterAndGetter2 obj = new SetterAndGetter2();
    // Using Functions
    obj.acceptDetails(obj);
    obj.displayDetails();
      // Or
    // obj.setFname("Kirubel");
    // obj.setLname("Wondwoson");
    // obj.setRollNum(2);
    // System.out.println("Name : " + obj.getFname() + " " + obj.getLname());
    // System.out.println("Roll number : " + obj.getRollNum());

  }
}
