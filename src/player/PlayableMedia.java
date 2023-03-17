package player;

import playerInterfaces.Playable;

public class PlayableMedia extends MediaElement implements Playable {

	private int duration;
	private int volume;
	

	public PlayableMedia(String t, int v, int d) {
		super(t);
		this.setVolume(v);
		this.setDuration(d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if (this.volume < 5) {
			this.volume++;
		} else {
			System.out.println("Volume already maxed!");
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (this.volume > 1) {
			this.volume--;
		} else {
			System.out.println("Volume minimum!");
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
