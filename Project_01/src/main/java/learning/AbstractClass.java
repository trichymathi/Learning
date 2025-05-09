package learning;


//it will contain both implement and un-implement methods

//Where we can use that if some class its mandetory to implement something or it will change eg: speed varies according to vehicle
//So when ever we extends the class its mandetory to implement the speed method

abstract class vehicle{
	
	public abstract void Speed(String speed) ;
	 
	 public void brandName(String name) {
		 System.out.println("Vehicle Brand Name is : "+ name);
	 }
}

class bike extends vehicle {
	@Override
	public void Speed(String speed) {
		System.out.println("Bike Speed is :"+speed);
	}
	
	public void brandName(String name) {
		System.out.println("Vehicle Brand Name is : "+ name);
	}
	
}
class car extends vehicle{

	@Override
	public void Speed(String speed) {
		System.out.println("Car Speed is :"+speed);
	}
	public void brandName(String name) {
		System.out.println("Vehicle Brand Name is : "+ name);
	}
	
}



public class AbstractClass{
	public static void main(String[] args) {
		bike bk = new bike();
		bk.Speed("10km");
		bk.brandName("Royal Enfield");
		car cr = new car();
		cr.Speed("10km");
		cr.brandName("Fortuner");
	}
}

