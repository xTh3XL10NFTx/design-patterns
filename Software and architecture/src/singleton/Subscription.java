package singleton;

public class Subscription {
	
	private static Subscription instance;

	private Subscription() {
		// TODO Auto-generated constructor stub
	}
	
	public static Subscription getInstance() {
		
		if(instance==null) {
			instance = new Subscription();
		}
		
		return instance;
	}
	
	public void postMessage(String subStatus) {
		System.out.println("Subscription status: " + subStatus);
	}

}
