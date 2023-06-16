package luqmanmohammad.U2D15DesignPatterns.observer;

//Implementing Observer The Control Center want to be notified getting latitude, 
//longitude and smokeLevel then will send an alert
public class ControlCenter implements Observer{

	@Override
	public void update(double latitude, double longitude, int smokeLevel) {
		System.out.println("Alert!!!! Fire detected: Latitude = " + latitude + "; Longitude = " + longitude + "; Quantity of smoke = " + smokeLevel);
	}
}
