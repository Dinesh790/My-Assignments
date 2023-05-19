package polymorphism;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;



public class Calculator {
	
	public void add(int x,int y) {
		System.out.println(x+y);
		
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public void add(double x,double y) {
		System.out.println(x*y);
	}
	public void add(float x, float y) {
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		
	Calculator cal=new Calculator();
	cal.add(4, 5);
	cal.add(3, 5, 8);
	cal.add(4.3d, 5.3d);
	cal.add(2.5f, 5f);
		// TODO Auto-generated method stub
		/*
		 * Method Overloading
Create class Calculator with below methods:   
 - 2 methods for add. 
     1 method with 2 int args,
     1 method with 3 int args    
 - 2 methods for multiple.
     1 method with 2 double args,
     1 method with 2 float args, 
Create Object for calculator class and call all the methods
		 */
		
	}

}
