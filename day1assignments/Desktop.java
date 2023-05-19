package week3.day1assignments;

public class Desktop extends Computer {
	//Single Inheritance
public void Desktopsize() {
	System.out.println("Desktop size is"+ "1600*1400");
	
}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computermodel();
		desk.Desktopsize();
	}

}
