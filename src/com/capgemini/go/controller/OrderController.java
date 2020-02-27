package com.capgemini.go.controller;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;



import com.capgemini.go.dao.OrderAndCartDao;
import com.capgemini.go.dao.OrderAndCartDaoImpl;
import com.capgemini.go.dto.CartDTO;
import com.capgemini.go.service.OrderAndCartServiceImpl;
import com.capgemini.go.service.OrderAndCartService;


public class OrderController implements OrderAndCartService
{
	DataInputStream dis=new DataInputStream(System.in);
	public void addItemToCart() {
		System.out.println("Enter username ");
		String uname="";
		try {
			 uname = dis.readLine();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("Enter product ");
		String pdt="";
		try {
			pdt = dis.readLine();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("Enter quantity ");
		int quantity = 0;
		try {
			quantity = Integer.parseInt(dis.readLine());
		} catch (NumberFormatException e) {
			
			System.out.println("Enter Numbers Only ");
		} catch (IOException e) {
			
			e.printStackTrace();
		};
		CartDTO po=new CartDTO();
		po.setUsername(uname);
		po.setProduct(pdt);
		po.setQuantity(quantity);
		OrderAndCartDao oo=new OrderAndCartServiceImpl();
		oo.addItemToCart(po);
		
	}

	@Override
	public void getOrderAndCartService() 
	{
		
		System.out.println("Enter the username:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		CartDTO po=new CartDTO();
		po.setUsername(un);
		OrderAndCartDao oo=new OrderAndCartServiceImpl();
		oo.getOrderAndCartService(po);
		
		
		
	}

	

	

	@Override
	public void updateItemQuantity() {
		
		System.out.println("Enter the username:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		CartDTO po=new CartDTO();
		po.setUsername(un);
		OrderAndCartDao oo=new OrderAndCartServiceImpl();
		oo.updateItemQuantity(po);
		
	}

	@Override
	public void removeItemFromCart() {
		
		System.out.println("Enter the username:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		CartDTO po=new CartDTO();
		po.setUsername(un);
		OrderAndCartDao oo=new OrderAndCartServiceImpl();
		oo.removeItemFromCart(po);
		
	}

}
