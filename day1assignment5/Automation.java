package week3.day1assignment5;

public class Automation extends MultipleLanguage{

	@Override
	public void ruby() {
		
		System.out.println("Automation->Ruby()");
	}

	@Override
	public void java() {
		System.out.println("Automation->java()");
	}

	@Override
	public void selenium() {
		System.out.println("Automation->selenium()");
		
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
		
		
	}

}
