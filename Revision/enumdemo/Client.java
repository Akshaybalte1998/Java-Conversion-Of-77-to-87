package com.enumdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object user of type AmazonUser
		//para constructor has 3 para- 1st int,2nd string, 3rd is enum
		AmazonUser user=new AmazonUser(1, "King", MembershipType.PRIME);
		System.out.println(user);
		
		//compare the user object's memebershiptype whther it is 
		//prime or not
		if(user.getMembershiptype()==MembershipType.PRIME)
		{
			System.out.println("Discount applied");
		}
	}

}
