package com.kiran.project.euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class CommonHelperTest {
	
	CommonHelper commonHelper;
	
	@Before
	public void init(){
		commonHelper = new CommonHelper();
	}

	@Test
	public void evenTest() {
		assertTrue(commonHelper.isEven(2));	
	}
	
	@Test
	public void oddTest(){
		assertTrue(commonHelper.isOdd(1));
	}
	
	@Test
	public void palindromeTest(){
		assertTrue(commonHelper.isPalindrome(1));
		assertTrue(commonHelper.isPalindrome(1991));
	}
	
	@Test
	public void reverseTest(){
		assertTrue(commonHelper.reverse("HELLO").equals("OLLEH"));
	}
	
	@Test
	public void divisibleTest(){
		assertTrue(commonHelper.isDivisible(98, 7));
	}
	
	@Test
	public void naturalNumberTest(){
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		assertEquals("Not as expected", list, commonHelper.getNaturalNumbers(5));
	}
	
	@Test
	public void nfibinocciNumberTest(){
		List<Integer> list = Arrays.asList(0,1,1,2,3);
		assertEquals("Not as expected", list, commonHelper.getNFibiNocciNumbers(5));
	}
	
	@Test
	public void fibinocciNumberTest(){
		List<Integer> list = Arrays.asList(0,1,1,2,3);
		assertEquals("Not as expected", list, commonHelper.getFibiNocciNumbersBelow(5));
	}

	@Test
	public void squaredTest(){
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> squaredList = Arrays.asList(1,4,9,16,25);
		assertEquals("Not as expected", squaredList, commonHelper.getSquaredList(list));
	}
}
