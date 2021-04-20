package observer;

import java.util.ArrayList;
import java.util.List;

public class MusicGO implements Observable {
	
	private List<Observer> subscirbers;
	private String MusicGO;
	
	public MusicGO() {
		this.subscirbers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.subscirbers.add(observer);
		observer.setAction(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.subscirbers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.subscirbers){
			observer .update();
		}
	}

	@Override
	public String getUpdate() {
		return this.MusicGO;
	}

	public void setMusicGO(String musicGO) {
		MusicGO = musicGO;
		this.notifyObservers();
	}

}
