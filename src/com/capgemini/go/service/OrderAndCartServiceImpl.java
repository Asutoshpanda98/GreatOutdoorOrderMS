package com.capgemini.go.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.go.dao.OrderAndCartDao;
import com.capgemini.go.dto.CartDTO;
import com.capgemini.go.maincontroller.Main;

public class OrderAndCartServiceImpl implements OrderAndCartDao 
{
	static HashMap<String, CartDTO> cartmap=new HashMap<String, CartDTO>();

	@Override
	public void addItemToCart(CartDTO pd)
	{
		Iterator<String> ii=cartmap.keySet().iterator();
		
	while(ii.hasNext())
	{
		String k=(String)ii.next();
		if(k.equals(pd.getUsername()))
		{
			cartmap.put(pd.getUsername()+(int)(Math.random()*1000), pd);
			System.out.println("sucessfully item added");
			
			return;
		}
	}
		cartmap.put(pd.getUsername(), pd);
		
		System.out.println("sucessfully item added");
		
		
	}

	@Override
	public void getOrderAndCartService(CartDTO pd) {
		Scanner dis=new Scanner(System.in);
		Iterator<String> ii=cartmap.keySet().iterator();
		c1:
		while(ii.hasNext())
		{
			String k="";
			try {
				k=(String)ii.next();
			}
			catch(Exception anshu)
			{
				
			}
			
			
			if(k.equals(pd.getUsername()) || k.contains(pd.getUsername()))
			{
				if(cartmap.get(pd.getUsername()) instanceof CartDTO)
				{
				CartDTO pd1=(CartDTO)cartmap.get(k);
				System.out.print(" Product:"+pd1.getProduct());
				System.out.println("\tQuantity :"+pd1.getQuantity());
				
				System.out.println("1.Purchase");
				System.out.println("2.Cancel");
				System.out.println("Enter your option:");
					int ch=dis.nextInt();
			
				if(ch>0)
				{
				switch(ch)
				{
				case 1:
					cartmap.remove(pd.getUsername());
					System.out.println("Order Placed");
					break c1;
				case 2:
					System.out.println("Order canceled");
					break;
				}
				}
				}
			}
		}
		
		
	}

	@Override
	public void updateItemQuantity(CartDTO pd)
	{
		String name=pd.getUsername();
		Scanner ss=new Scanner(System.in);
			System.out.println("Enter the product u want to update");
			String product=ss.nextLine();
			System.out.println("Enter the quanity");
			int quant=0;
			try{
			quant=ss.nextInt();
			}
			catch(InputMismatchException e1)
			{
				System.out.println("Enter Numbers Only");
			}
			Iterator<String> ii=cartmap.keySet().iterator();
			while(ii.hasNext())
			{
				String n=ii.next();
				if(n.contains(name))
				{
					CartDTO p=(CartDTO)cartmap.get(n);
					if(p.getProduct().equals(product))
					{
						CartDTO p1=new CartDTO();
						p1.setQuantity(quant);
						p1.setProduct(product);
						cartmap.put(n,p1);
						System.out.println("Product is updated");
					}
				}
			}
			
		}
		

	

	@Override
	public void removeItemFromCart(CartDTO pd) {
		String name=pd.getUsername();
		Scanner ss=new Scanner(System.in);
			System.out.println("Enter the product u want to remove");
			String product=ss.nextLine();
			Iterator<String> ii=cartmap.keySet().iterator();
			while(ii.hasNext())
			{
				String n=ii.next();
				if(n.contains(name))
				{
					CartDTO p=(CartDTO)cartmap.get(n);
					if(p.getProduct().equals(product))
					{
						cartmap.remove(n);
						System.out.println("Product is removed from your cart");
					}
				}
			}
			
		}
		

		
	}


