package observer;

public class ObserverMain {

	public static void main(String[] args) {
		MusicGO MusicGO= new MusicGO();
		
		Observer obs1 = new MusicGOSubscriber("Ivan","Ivancho13@abv.bg", 18);
		Observer obs2 = new MusicGOSubscriber("Georgi", "Goshko15@gmail.com", 21);
		Observer obs3 = new MusicGOSubscriber("Mara","MaraTaneva@outlook.com", 45);
		
		MusicGO.subscribe(obs1);
		MusicGO.subscribe(obs2);
		MusicGO.subscribe(obs3);
		
		MusicGO.setMusicGO("Playing TNT by AC/DC");
		MusicGO.setMusicGO("Eminem just released a new album! 13/12/2020");
	}

}
