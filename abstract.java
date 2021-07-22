//Use of abstract class and abstract method:

abstract class Vehicle
{
	public abstract void engine();
}
public class AbstractCar extends Vehicle
{
	public void engine()
	{
		System.out.println("Car engine");
	}
	public static void main(String[] args) 
	{
		Vehicle v = new AbstractCar();
		v.engine();
	}
}

/* Output: Car engine */
