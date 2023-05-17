/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**
 *
 * @author Jenisha
 */
//Example of arrayof objects
import java.util.Scanner;
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      // array of object declaration 
        Student[] list = new Student[3] ; 
        Scanner in = new Scanner (System.in);
      // this array will use object of this "student " class-- array of objects
         for(int i = 0; i<list.length ;i++)
         {
             String n = in.next();
             int a = in.nextInt();
             Student s1 = new Student(n,a);
             list[i] = s1;
             
         }
         // read the data I stored in list array
         for( int i =0; i<list.length ;i++)
         {
         System.out.println(list [i].getName() + " " + list[i].getAge());
         }
         
    }
    
}
