package lt;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone(); 
		USB usb = phone;//向上转型
		
		usb.read();
		usb.write();
		
		Wifi wifi = phone;
		wifi.open();
		wifi.close();
		
	}

}
