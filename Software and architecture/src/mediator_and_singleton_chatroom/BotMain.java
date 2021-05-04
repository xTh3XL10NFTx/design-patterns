package mediator_and_singleton_chatroom;

public class BotMain {

	public static void main(String[] args) {

		Bot connection = Bot.getInstance();
		connection.postMessage("activated");
	}

}
