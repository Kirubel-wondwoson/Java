package Function;

public class SetterAndGetter1 {
  private String name;
  private int age;
  public String getName(){  // Accessor method(getter) : reads instance varaibles
    return name;
  }
  public int getAge(){
    return age;
  }
  public void setName(String name){ // Mutator method(setter) : read instance varibles and modify the values 
    this.name = name; 
  }
  public void setAge(int age){
    this.age = age;
  }
  public void display(){
    System.out.println(name);
    System.out.println(age);
  }
  public static void main(String args[]){
    SetterAndGetter1 myObj = new SetterAndGetter1();
    myObj.setName("Kirubel");
    String name = myObj.getName();

    myObj.setAge(21);
    int age = myObj.getAge();
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);

  }
}
