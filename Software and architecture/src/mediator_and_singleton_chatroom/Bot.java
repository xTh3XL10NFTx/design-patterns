package mediator_and_singleton_chatroom;

public class Bot {
	
	private static Bot instance;

	private Bot() {
		// TODO Auto-generated constructor stub
	}
	
	public static Bot getInstance() {
		
		if(instance==null) {
			instance = new Bot();
		}
		
		return instance;
	}
	
	public void postMessage(String Status) {
		System.out.println("The ChatBot is " + Status);
	}

}
