package com.capgemini.go.maincontroller;


import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.capgemini.go.controller.OrderController;
import com.capgemini.go.service.OrderAndCartService;


public class Main 
{
public static void main(String[] args) throws Exception 
{
	DataInputStream dis=new DataInputStream(System.in);
	
	OrderAndCartService oos=new OrderController();
	while(true){
		menu();
		int ch=0;
		System.out.println("Enter your option:");
	try{	
		ch=Integer.parseInt(dis.readLine());}
	catch(Exception e)
	{
		System.out.println("enter numbers only");
	}
		
	
		switch(ch) 
		{
		case 1:
		    oos.addItemToCart();
			break;
		case 2:
			oos.updateItemQuantity();
			break;
		case 3:
			oos.getOrderAndCartService();
			break;
		case 4:
			oos.removeItemFromCart();
			break;
		case 5:
			System.out.println("Thanks for shopping");
			return;
			default:
				System.out.println("Enter Options From 1 to 5 Only");
		}
	} 
	
}

public static void menu() 
{
	System.out.println(" Menu \n=========================");
	System.out.println("1.Add to cart");
	System.out.println("2.Update  cart");
	System.out.println("3.View from cart");
	System.out.println("4.Delete from cart");
	System.out.println("5.Exit Program");
}
}
