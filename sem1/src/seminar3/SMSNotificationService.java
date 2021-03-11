package seminar3;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String msg) {
		System.out.println("Sending SMS to "+ destination.getMobile());
		System.out.println(msg);
	}

}
