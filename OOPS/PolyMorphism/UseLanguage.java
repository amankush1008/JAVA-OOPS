package PolyMorphism;

//Late Binding -- Object // dynamic method dispatch
class Language{
	public void greetings() {
		
	}
}

class Hindi extends Language {

	@Override
	public void greetings() {
		System.out.println("Suprabhat");
	}
	
}

class English extends Language {
	public void greetings() {
		System.out.println("Good Morning");
	}
}
class French extends Language {
	public void greetings() {
		System.out.println("Bon Jour");
	}
}

public class UseLanguage {
	public static void main(String[] args) {
		//Run time Polymorphism
		Language lng;
		
		lng= new Hindi();
		lng.greetings();
		
		lng= new English();
		lng.greetings();
		
		lng= new French();
		lng.greetings();
		
	}

}
