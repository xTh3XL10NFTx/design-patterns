package mediator_and_singleton_chatroom;

public interface MessageMediator {
	void sendMessage(String message, User user);
	void addUser(User user);
}
