package player;

import playerInterfaces.Brightness;

public class Video extends PlayableMedia implements Brightness {
	
	private int brightness;

	public Video(String t, int v, int d, int b) {
		super(t, v, d);
		this.setBrightness(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void setBrightness(int b) {
		this.brightness = b;
	}

	@Override
	public void brightUp() {
		// TODO Auto-generated method stub
			this.brightness++;

	}

	@Override
	public void brightDown() {
		// TODO Auto-generated method stub
			this.brightness--;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		String title =  this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		title = title.concat(" ");
		for (int i = 0; i < this.getBrightness(); i++) {
			title = title.concat("*");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
	}
}
	
}
