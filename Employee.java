/*
* Program : Create a class Employee with one explicit constructor to initialize the members with your 
			default values and add one more constructor with parameters (make use of this pointer). 
			Create 5 employee objects and display the employee details.
* Author  : Aman Kumar
* Date    : 16th july 2014
*/

public class Employee{
int Emp_Id;
String Name;
String City;
  
 Employee(){		//Explicit Constructor
   Emp_Id=0;
   Name="Invaild Name";
   City="Invaild City";
  }
  Employee(int empId,String name,String city){         //Paramiterized Constructor
    this.Emp_Id=empId;
	this.Name=name;
	this.City=city;
   }
 }
 
 