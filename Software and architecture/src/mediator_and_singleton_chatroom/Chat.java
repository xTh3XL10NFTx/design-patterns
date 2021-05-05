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
			if(message.contains("cat") && Bot.botActive == true)
			{
				chatUser.recieve(user.name + " has been kicked for using the forbidden word CAT. Please do not use this word.");
				user.name="Kicked user";
			}
			else if(chatUser != user && message != "addBot") {
			chatUser.recieve(message);
			}
			else if(message == "addBot" && Bot.botActive == false)
			{
				chatUser.recieve("The chat bot has been activated! Do not mention cats!");
			}
			else if(message == "addBot" && Bot.botActive == true)
			{
				chatUser.recieve("The chat bot has already been activated!");
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
