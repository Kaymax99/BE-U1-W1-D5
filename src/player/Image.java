package player;

import playerInterfaces.Brightness;

public class Image extends MediaElement implements Brightness{
	
	private int brightness;

	public Image(String t, int l) {
		super(t);
		this.setBrightness(l);
		// TODO Auto-generated constructor stub
	}

	public void show() {
		String title =  this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getBrightness(); i++) {
			title = title.concat("*");
		}
		System.out.println(title);
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
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void setBrightness(int b) {
		this.brightness = b;
	}

}
