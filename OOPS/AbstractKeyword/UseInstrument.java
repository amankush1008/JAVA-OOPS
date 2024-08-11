package AbstractKeyword;

abstract class Instrument {
	abstract public void sound();
	
}

class Violin extends Instrument {
	public void sound() {
		System.out.println("Violin Sound...");
	}
	
}

class Guitar extends Instrument {
	public void sound() {
		System.out.println("Guitar Sound...");
	}
}
public class UseInstrument {
	public static void main(String[] args) {
		Instrument i1;
		
		i1=new Violin();
		i1.sound();
		
		i1=new Guitar();
		i1.sound();
		

	}
}
