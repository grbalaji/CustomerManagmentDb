package com.tek;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerUtil cu = new CustomerUtil();

		cu.printCustomers();

        String str="insert into customer values(1,'balaji','dev')";
        CustomerDao cd = new CustomerDao();
        cd.insertQuery(str);
	}

}
