package com.SpringDemo;

import java.util.Scanner;

public class SpringApp 
{
    public static void main( String[] args )
    {
    	ClientMessagingSystem cms= new ClientMessagingSystem();
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "enter your address " );
        String addr=scanner.nextLine();
        System.out.println( "enter your message" );
        String msg=scanner.nextLine();
        cms.send(addr, msg);
    }
}
