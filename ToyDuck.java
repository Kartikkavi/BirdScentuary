package birdsenctuary;

public class ToyDuck extends Bird implements Flyable,Swimmable {
	
	static int count;

	@Override
	public void swim() {
		System.out.println("ToyDuck can swimming");
		
	}

	@Override
	public void fly() {
	System.out.println("ToyDuck can Fly");
	}

	@Override
	void incrementCount() {
		// TODO Auto-generated method stub
	count++;
	
	}

	@Override
	int getCount() {
	
		return 0;
	}

	@Override
	void decrementCount() {
     count--;
		
	}

}
