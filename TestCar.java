
class TestCar{
 public static void main(String[] arg){
    Car obj1= new Car(007,"BMW 001","Black",7500000,"Petrol");
	System.out.println(+obj1.VechileNumber+ " "+obj1.Model+ " "+obj1.Color+ " "+obj1.Price+ " "+obj1.Type);
	
	Car obj2= new Car(19991,"Audi A4","White",5000000,"Diseal");
	System.out.println(+obj2.VechileNumber+ " "+obj2.Model+ " "+obj2.Color+ " "+obj2.Price+ " "+obj2.Type);
	
	Car obj3= new Car(111,"Maruti Dezire","Black",500000,"Petrol");
	System.out.println(+obj3.VechileNumber+ " "+obj3.Model+ " "+obj3.Color+ " "+obj3.Price+ " "+obj3.Type);
	
	Car obj4= new Car(2277,"Tata Nano","Red",100000,"Petrol");
	System.out.println(+obj4.VechileNumber+ " "+obj4.Model+ " "+obj4.Color+ " "+obj4.Price+ " "+obj4.Type);
	
	Car obj5= new Car();
	System.out.println(+obj5.VechileNumber+ " "+obj5.Model+ " "+obj5.Color+ " "+obj5.Price+ " "+obj5.Type);
   }
}