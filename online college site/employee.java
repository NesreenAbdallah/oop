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
public class employee extends person {
    int salary;
    String job;
    
 public employee(){}
 public employee(int age,String address,int salary,String job)
 {
    this.address=address;
    this.age=age;
    this.salary=salary;
    this.job=job;
}
 
 
 int getsalary()
  {
     return salary;
  } 
  
  String getjob()
  {
     return job;
  }
}
    

    

