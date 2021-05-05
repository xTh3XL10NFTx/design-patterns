package mediator_and_singleton_chatroom;

public class ChatUser extends User {
	
	public static String bannedUser;

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {

		System.out.println(this.name + " sends: " + message);
		this.mediator.sendMessage(message, this);
		if(message == "addBot" && Bot.botActive == false)
		{	Bot connection = Bot.getInstance();
			connection.postMessage("activated");	}
		else if(message == "addBot" && Bot.botActive == true)
		{	Bot connection = Bot.getInstance();
			connection.postMessage("already activated");	}
		}
	

	@Override
	public void recieve(String message) {
		System.out.println(this.name + " recieved: " + message);
		}
	}