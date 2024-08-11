package Interface;

public interface Animal {
	void makeSound();
	public abstract void eat();
}

class Elephant implements Animal{
	
	@Override
	public void makeSound() {
		System.out.println("A Elephant Roars");
	}
	
	@Override
	public void eat() {
		System.out.println("Lion Eat Banana");
	}
	
}

class Lion implements Animal{
	
	@Override
	public void makeSound() {
		System.out.println("A Lion Roars");
	}
	
	@Override
	public void eat() {
		System.out.println("Lion Eat Flesh");
	}
	
}
