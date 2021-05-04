package mediator_and_singleton_chatroom;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	
	public Chat() {
		this.users=new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {

		for(User chatUser: this.users) {
			if(chatUser != user && message != "addBot") {
			chatUser.recieve(message);
			}
			else if(message == "addBot")
			{
				chatUser.recieve("The chat bot has been activated! Do not mention cats!");
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
