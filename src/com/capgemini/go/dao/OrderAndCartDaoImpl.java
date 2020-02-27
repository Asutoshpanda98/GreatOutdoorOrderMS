package com.capgemini.go.dao;

import java.util.HashMap;
import java.util.Map;



import com.capgemini.go.dto.CartDTO;

public class OrderAndCartDaoImpl implements OrderAndCartDao
{
	private Map<String,CartDTO> map;

	 public OrderAndCartDaoImpl ()
	 {
		 map=new HashMap<String, CartDTO>();
	 }
	public String additemToCart(CartDTO oo)
		{
		
		return oo.getUsername();
		}
	public boolean removeItemFromCart1(CartDTO ter)
	{
		return false;
		
	}
	public boolean updateItemQuantity1(CartDTO cyu)
	{
		return false;
		
	}
	public void getOrderAndCartService(CartDTO xyz)
	{
		return;
		
	}
	@Override
	public void addItemToCart(CartDTO pd) {
		// TODO Auto-generated method stub
		
	}
	public void getOrderAndCartService1(CartDTO pd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateItemQuantity(CartDTO pd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeItemFromCart(CartDTO pd) {
		// TODO Auto-generated method stub
		
	}
}
