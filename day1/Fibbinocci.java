package Week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int firstNum=0;
          int SecondNum=1;
          int sum;
          for(int i=0;i<11;i++) {
        	  sum=firstNum+SecondNum;
            System.out.println(sum);
            firstNum=SecondNum;
        	  SecondNum=sum;
        	  
          }
          
	}

}
