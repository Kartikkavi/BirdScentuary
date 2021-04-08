package birdsenctuary;
public class Penguin extends Bird implements Swimmable,Eatable{

    static  int count;

    @Override
    public void eat() {
        System.out.println("Penguin is eating fish");
    }

    @Override
    public void swim() {
        System.out.println("penguin swims fast");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int  getCount() {
        return count;
    }

	@Override
	void decrementCount() {
		// TODO Auto-generated method stub
	count--;	
	}
}