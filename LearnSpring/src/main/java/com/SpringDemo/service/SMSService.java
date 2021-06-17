package com.SpringDemo.service;

public class SMSService implements MessageService{

public boolean sendMessage(String address, String message) {

		String regex="\\d{10}";
		boolean messageStatus=false;
		if(address.matches(regex)) 
		{
			messageStatus=true;
			System.out.println("The message is : " + message + " send to " +address+ "");
		}
		return messageStatus;
}
}
