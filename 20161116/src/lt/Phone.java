package lt;

class Phone implements USB,Wifi{

	/**
	 * @param args
	 */
	public void read(){
		System.out.println("USBPhone read");
	}
	
	public void write(){
		System.out.println("USBPhone wrire");
	}
	public void open(){
		System.out.println("Wifi open");
	}

	public void close(){
		System.out.println("Wifi close");
	}
}
