package Function;

public class InstanceMethods_SetterAndGetter {
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
  public static void main(String args[]){
    InstanceMethods_SetterAndGetter myObj = new InstanceMethods_SetterAndGetter();
    myObj.setName("Kirubel");
    String name = myObj.getName();

    myObj.setAge(21);
    int age = myObj.getAge();
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);

  }
}
