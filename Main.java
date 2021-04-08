package birdsenctuary;

public class Main {
public static void main(String[] args) {
	BirdSanctuary sanctuary = BirdSanctuary.getInstance();

    Bird duck = new Duck();
    Bird duck1 = new Duck();
    Bird parrot = new Parrot();
    Bird penguin = new Penguin();
    Bird toyduck = new ToyDuck(); 

    sanctuary.addBird(duck);
    sanctuary.addBird(duck1);
    sanctuary.addBird(parrot);
    sanctuary.addBird(penguin);
    sanctuary.addBird(toyduck);
   sanctuary.removeBird(duck);
    sanctuary.print();
}


	

}
