package observer;

public class MusicGOSubscriber implements Observer {

	private String name;
	String email;
	int age;
	private Observable subscribedTo;
	
	public MusicGOSubscriber (String name, String email, int age) {
		this.name=name;
		this.email=email;
		this.age=age;
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
