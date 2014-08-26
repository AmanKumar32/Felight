
class Test{
 public static void main(String[] arg){
    Employee obj1= new Employee(1001,"Venkat","Manglore");
	System.out.println(+obj1.Emp_Id+ " "+obj1.Name+ " "+obj1.City);
	
	Employee obj2= new Employee(1002,"Parkash","Patna");
	System.out.println(+obj2.Emp_Id+ " "+obj2.Name+ " "+obj2.City);
	
	Employee obj3= new Employee(1003,"Aman","Talwara");
	System.out.println(+obj3.Emp_Id+ " "+obj3.Name+ " "+obj3.City);
	
	Employee obj4= new Employee(1004,"Manuvana","Vijaynagar");
	System.out.println(+obj4.Emp_Id+ " "+obj4.Name+ " "+obj4.City);
	
	Employee obj5= new Employee();
	System.out.println(+obj5.Emp_Id+ " "+obj5.Name+ " "+obj5.City);
   }
}