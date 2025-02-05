package learning;


//interface will not have implementent methods 100 % un-implement methods
//interface we will not create object
//In Java 8 we can implement methods allowed by using some syntax keyword default
//In Java 8 we use static keyword also use in Interface

interface vehicleName{
	
	public void speed();
	
	public void nameOfTheVehicle();
	
	default void Owner() {
		System.out.println("Owner is : Mathi");
	}
	
}

class bikeName implements vehicleName{

	@Override
	public void speed() {
		System.out.println("Speed Is : 100");
	}

	@Override
	public void nameOfTheVehicle() {
		System.out.println("Name Is : Enfield");
	}
	
}
public class LearnInterface {

	public static void main(String[] args) {
		bikeName bk0 = new bikeName();
		bk0.speed();
		bk0.nameOfTheVehicle();
		bk0.Owner();
		
	}

}
