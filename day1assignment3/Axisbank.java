package week3.day1assignment3;

public class Axisbank extends BankInfo {

	public void deposit1() {
		System.out.println("Axis bank ->deposit");
	}
	public static void main(String[] args) {
		Axisbank ab=new Axisbank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		ab.deposit1();

	}

}
