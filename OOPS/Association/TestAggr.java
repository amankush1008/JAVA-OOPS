package Association;

class MusicPlayer{
	
	private String name;
	public MusicPlayer(String name) {
		this.name=name;
	}
	
	public void startPlayer() {
		System.out.println("Music Player Started..");
	}
	
	public void stopPlayer() {
		System.out.println("Music Player Stoped..");
	}
}

class Car{
	private String name;
	private MusicPlayer player;
	
	public Car(String name,MusicPlayer player) {
		this.name=name;
		this.player=player;
	}
	
	public void startPlayer() {
		player.startPlayer();
	}
	
	public void stopPlayer() {
		player.stopPlayer();
	}
	
	public String getName() {
		return this.name;
	}
}
public class TestAggr {
	public static void main(String[] args) {
		MusicPlayer player= new MusicPlayer("Sony");
		
		Car brezza = new Car("Brezza",player);
		
		System.out.println("Car is : "+brezza.getName());
		
		brezza.startPlayer();
		brezza.stopPlayer();
		
	}
}
