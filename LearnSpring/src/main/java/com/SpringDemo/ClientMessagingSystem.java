package com.SpringDemo;

import com.SpringDemo.service.MessageService;
import com.SpringDemo.service.SMSService;

public class ClientMessagingSystem {
	
	private MessageService messageService = new SMSService();
	
	public void send(String address,String message)
	{
		boolean messageStatus=this.messageService.sendMessage(address, message);
		
		if(messageStatus==false)
		{
			System.out.println("Sorry Invalid Address ");
		}
	}

}
