package week3.day1;

public class MyPhone extends Ipad{

	public static void main(String[] args) {
		
    Ipad IP=new Ipad();
    IP.startUp();
    IP.increaseVolume();
    IP.shutdown();
    System.out.println("****************************");
    
    IP.makeCall();
    IP.sendSMS();
    System.out.println("***************************");
    
    IP.WatchMovie();
	}

}
