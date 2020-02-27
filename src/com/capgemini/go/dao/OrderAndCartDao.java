package com.capgemini.go.dao;

import com.capgemini.go.dto.CartDTO;

public interface OrderAndCartDao 
{
 void addItemToCart(CartDTO pd);
 void getOrderAndCartService(CartDTO pd);
 void updateItemQuantity(CartDTO pd);
 void removeItemFromCart(CartDTO pd);
}
