package observer;

public class MusicGOSubscriber implements Observer {

	private String name;
	private Observable subscribedTo;
	
	public MusicGOSubscriber (String name) {
		this.name=name;
	}
	
	@Override
	public void update() {
		
		if(this.subscribedTo == null)
		{
			System.out.println(this.getName() + " doesn't exoist");
			return;
		}
		
		String newMusicGO = this.subscribedTo.getUpdate();
		System.out.println(this.getName() + " received an update: " + newMusicGO);
	}

	@Override
	public void setAction(Observable action) {
		this.subscribedTo=action;
	}

	public String getName() {
		return name;
	}

}
