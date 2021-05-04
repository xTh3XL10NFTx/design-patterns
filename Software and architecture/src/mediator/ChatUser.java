package mediator;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		this.mediator.sendMessage(message, this);
	}

	@Override
	public void recieve(String message) {
		System.out.println(this.name + " recieved: " + message);
	}

}
