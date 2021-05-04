package singleton;

public class SubscriptionMain {

	public static void main(String[] args) {

		Subscription connection = Subscription.getInstance();
		connection.postMessage("Subscribed");
	}

}
