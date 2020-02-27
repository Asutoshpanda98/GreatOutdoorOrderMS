package com.capgemini.go.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.go.dto.CartDTO;

public class OrderAndCartDaoImplTest {
	private static OrderAndCartDaoImpl test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test= new OrderAndCartDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdditemToCart() 
	{
		CartDTO cd=new CartDTO();
		cd.setUsername("anshu");
		OrderAndCartDaoImpl test=new OrderAndCartDaoImpl();
		String s=test.additemToCart(cd);
		assertEquals("anshu", s);
	}

}
