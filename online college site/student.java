/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.task3;

/**
 *
 * @author serin
 */
public class student extends person {
    String studentlevel;
    String department;
    
    
 public student(){}
 public student(int age,String address,String studentlevel,String department)
{
    this.age=age;
    this.address=address;
    this.studentlevel=studentlevel;
    this.department=department;
    
}
 
 String getstudentlevel()
 {
   return studentlevel; 
 }
 
 String getdepartmnt ()
 {
   return department;
 }
    
}


