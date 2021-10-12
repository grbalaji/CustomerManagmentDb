package com.tek;

public class CustomerUtil {
	
	Customer[] css = new Customer[2];
	public void createCustomers(){
		
		//Customer[] css = new Customer[2];
		
		Customer cs = new Customer();
		cs.setcName("bala");
		cs.setcNo(4);
		cs.setcType("ibm");
		css[0]= cs;
		Customer cs1 = new Customer();
		cs1.setcName("ram");
		cs1.setcNo(20);
		cs1.setcType("oracle");
		css[1]= cs1;
		
	//	return css;
				
		
	}
	
	public void printCustomers(){
		createCustomers();
	//	System.out.println(css.length);
		//Customer ctmr = css[0];
		//System.out.println(ctmr);
		//System.out.println(css.length);
		
		for (Customer customer : css) {
			System.out.println(customer);
		}
		
	}

}
