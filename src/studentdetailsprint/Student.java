/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetailsprint;

/**
 *model the student class template
 * @author Jenisha
 */
public class Student 
{
   private String name; // encapsulation
   private int age;

   //define constructor to set values for the local variables
   public Student (String n, int a)  //Constructor declaration 
   {
     this.name = n;
     this.age = a;
   }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
