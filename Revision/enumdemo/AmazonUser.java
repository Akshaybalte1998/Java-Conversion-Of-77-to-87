package com.enumdemo;

public class AmazonUser {
	
	private int userId;	
	private String name;
	private MembershipType usertype;  //enum variable as a field of class
	
	public AmazonUser(int userId,String name,MembershipType usertype)
	{
		this.userId=userId;
		this.name=name;
		this.usertype=usertype;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User id-"+this.userId+
				" Name-"+this.name+
				" Type-"+this.usertype;  //implictly it return the name of enum as string
	} 
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//getter method of enum variable returns enum type
	public MembershipType getMembershiptype() {
		return usertype;
	}

	//setter method of enum variablehas parameter of Enum type
	public void setMembershiptype(MembershipType usertType) {
		this.usertype = usertType;
	}


}
