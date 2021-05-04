package mediator;

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
			if(chatUser != user) {
			chatUser.recieve(message);
			}
		}
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
