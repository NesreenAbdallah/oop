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
public class person {
    private String name;
    int age;
    String address;
    
public person(){}
public person(int age,String address)
{
    this.address=address;
    this.age=age;
}

public void setname(String name)
{
 this.name=name;
}
String getname()
{
  return name;
}

String getaddress()
{
  return address;
}
int getage()
{
  return age;
}

    
}


