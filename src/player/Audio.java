package player;

public class Audio extends PlayableMedia{

	public Audio(String t, int v, int d) {
		super(t, v, d);
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
		// TODO Auto-generated method stub
		String title =  this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
	}
}
	
}
