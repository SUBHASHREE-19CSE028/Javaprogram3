/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      result obj=new result();
      obj.stud();
      obj.totave();
      obj.display();
      
      result obj1=new result();
      obj1.stud();
      obj1.totave();
      obj1.display();
      
      result obj2=new result();
      obj2.stud();
      obj2.totave();
      obj2.display();
      
      result obj3=new result();
      obj3.stud();
      obj3.totave();
      obj3.display();
      
      result obj4=new result();
      obj4.stud();
      obj4.totave();
      obj4.display();
    }
    
}
class result
{
    
    int m1,m2,m3,m4,m5;
    int total,id;
    float average;
    String name;
   
    void stud()
    {
      System.out.println("Enter details:");
      Scanner obj=new Scanner(System.in);
      name=obj.next();
      id=obj.nextInt();
      m1=obj.nextInt();
      m2=obj.nextInt();
      m3=obj.nextInt();
      m4=obj.nextInt();
      m5=obj.nextInt();
    }
    void totave()
    {
        total=m1+m2+m3+m4+m5;
        average=total/5;
    }
    void display()
    {
        System.out.println("Student details:");
        System.out.println("****************");
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+id);
        System.out.println("Tamil:"+m1+"\nEnglish:"+m2+"\nMaths:"+m3+"\nPhysics:"+m4+"\nChemistry:"+m5+"\nTotal:"+total+"\nAverage:"+average);  
    }
}