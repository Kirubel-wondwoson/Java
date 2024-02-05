package Arrays;
import java.util.*;
public class TestArrayList {
  // add
  // set 
  // remove
  // get
  public static void main(String[] args) {
    ArrayList <String> Student = new ArrayList<>();
    Student.add("Abeni");
    Student.add("Kirubel");
    Student.add("Yasub");
    Student.set(1,"Neway");
    Student.remove(2);
    for(int i = 0 ; i < Student.size() ; i++){
      System.out.println(Student.get(i));
    }
  }
}