package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivelin");
		User user2 = new ChatUser(chat, "Nikolai");
		User user3 = new ChatUser(chat, "Steph");
		
		user2.send("Zdr");

	}

}
