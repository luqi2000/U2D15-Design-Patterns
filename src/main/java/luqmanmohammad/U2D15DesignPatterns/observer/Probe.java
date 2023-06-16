package luqmanmohammad.U2D15DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

//observable he will send notification
//The Probe keeps track of registered observers and notifies them when a fire is detected
@Data
public class Probe {
	
	private double latitude;
	private double longitude;
	private int smokeLevel;
	
	private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double latitude, double longitude, int smokeLevel) {
        for (Observer observer : observers) {
            observer.update(latitude, longitude, smokeLevel);
        }
    }

    public void detectFire(double latitude, double longitude, int smokeLevel) {
      
    	if (smokeLevel>= 5) {
    		notifyObservers(latitude, longitude, smokeLevel);
    	}else {
			System.out.println("Undercontrol: Smoke level is under 5");
		}
    }
}
