import java.util.Observer;

public class RGPobserverName extends RGPobserverObserver{
	public RGPobserverName(RGPobserverSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("NAME: " + subject.getName());
		System.out.println("PHASE: " + subject.getState());
<<<<<<< HEAD
		System.out.println("MESSAGE: " + subject.getMessage());
=======
>>>>>>> 2e836c5a771b75a4c2dfc84e99010af1c0494959
		
	}

}
