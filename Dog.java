import java.util.Scanner;
import java.util.Arrays;

public class Dog{
  private String breed;
  private String size;
  private int age;
  //parameterized constructor
  public Dog(String breed, String size, int age){
    this.breed = breed;
    this.size = size;
    this.age = age;
  }
//get method for the breed parameter
  public String getBreed() {
    return breed;
  }
//get method for the size parameter
    public String getSize() {
    return size;
  }
//get method for the age parameter
    public int getAge() {
    return age;
  }
//to string to return the data
  public String toString(){
    return "Breed: " + breed + "\nSize: " + size + "\nAge: " + age;
  }
  
}
