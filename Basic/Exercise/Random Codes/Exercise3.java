package Exercises.Final;

public class Exercise3 {
  public static void main(String[] args) {
    String course  = "Object Oriented Engineering";
    char cs[] = course.toCharArray();
    Exercise3.OOP(cs,'e');
  }
  public static void OOP(char str[], char ch){
    int i, j = 0;
    char ch1;
    char str1[] = new char[30];
    int z = str.length;
    for(i = 0; i < z ; i++){
      if(str[i] != ch){
        ch1 = str[i];
        str1[j] = ch1;
        j++;
      }
    }
    str1[j] = '\0';
    System.out.print("The output will be = ");
    System.out.println(str1);
  }
}
