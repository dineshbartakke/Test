package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MathMockitoTest {
	
	@Mock
	Math mathObj;
	
	@Before
	public void create(){
		//mathObj = Mockito.mock(Math.class);
		MockitoAnnotations.initMocks(this); 
	}
	
	@Test
	public void test() {
		Mockito.when(mathObj.add(2, 3)).thenReturn(5);
		assertEquals(5, mathObj.add(2,3));
	}

}
