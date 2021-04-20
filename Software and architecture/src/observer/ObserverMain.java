package observer;

public class ObserverMain {

	public static void main(String[] args) {
		MusicGO MusicGO= new MusicGO();
		
		Observer obs1 = new MusicGOSubscriber("MusicGO Subscriber 01");
		Observer obs2 = new MusicGOSubscriber("MusicGO Subscriber 02");
		Observer obs3 = new MusicGOSubscriber("MusicGO Subscriber 03");
		
		MusicGO.subscribe(obs1);
		MusicGO.subscribe(obs2);
		MusicGO.subscribe(obs3);
		
		MusicGO.setMusicGO("Playing TNT by AC/DC");
		MusicGO.setMusicGO("Eminem just released a new album!");
	}

}
