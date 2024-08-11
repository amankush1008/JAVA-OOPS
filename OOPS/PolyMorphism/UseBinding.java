package PolyMorphism;

public class UseBinding {
	public static void main(String[] args) {
		Parent p = new Parent();
		
	// Static Method Early Binding -> Refernce pointing (Parent)
		p.show(); 
		

		p.display();
		
		p= new Child();
		
		p.show();
		
		//Non- Static Method Late Binding -> to Object pointing (Child)
		p.display();
	}
}
