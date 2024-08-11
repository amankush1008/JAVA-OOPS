package Interface;

public class UseAnimal {
	public static void main(String[] args) {
		Animal a1;
		
		a1=new Elephant();
		a1.makeSound();
		a1.eat();
		
		a1=new Lion();
		a1.makeSound();
		a1.eat();
		

	}
}
