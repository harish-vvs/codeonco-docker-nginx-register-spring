package com.tphuocthai.restMeasureTest;

import org.junit.Test;

import com.tphuocthai.rest.entity.RestMeasure;

import static org.junit.Assert.*;

public class RestMeasureTest {
	
	@Test
	public void testCreateRestMeasure(){
		RestMeasure order = new RestMeasure();
		
		assertNotNull(order);
	}

	@Test
	public void testUserName(){
		RestMeasure order = new RestMeasure();
		
		assertNull(order.getUserName());
		order.setUserName("Yujin");
		assertEquals("Yujin",order.getUserName());
	}
	
	@Test
	public void testServiceName() {
		RestMeasure order = new RestMeasure();
		
		assertNull(order.getServiceName());
		order.setServiceName("Web Design");
		assertEquals("Web Design",order.getServiceName());
	}
	
}
