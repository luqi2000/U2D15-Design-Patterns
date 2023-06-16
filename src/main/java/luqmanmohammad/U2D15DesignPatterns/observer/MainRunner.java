package luqmanmohammad.U2D15DesignPatterns.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		Probe sonda = new Probe();
		ControlCenter centroControllo = new ControlCenter();

		sonda.addObserver(centroControllo); //adding probe in ControlCenter

		// Fire detection simulation
		sonda.detectFire(478.423, 789.4442, 6);
		
		// Fire detection simulation
		sonda.detectFire(422.233, 123.4442, 10);
		
		// Fire detection simulation
		sonda.detectFire(333.33, 423.31, 4);
	}
}


//Observer is a behavioral design pattern that lets you define a 
//subscription mechanism to notify multiple objects about 
//any events that happen to the object they’re observing.

//The object that has some interesting state is often called subject,
//but since it’s also going to notify other objects about the changes 
//to its state, we’ll call it publisher. All other objects that want 
//to track changes to the publisher’s state are called subscribers.