package com.yanxml.test.mock.testablemock.bug.nest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.alibaba.testable.core.annotation.MockMethod;

/**
*
* Author: sean
* Date:Feb 20, 202112:46:39 AM
*/

public class StringServiceTest {
	
	private static StringService service = new StringService();
	
	@BeforeAll
	private static void init() {
		service.subService = new SubStringService();
	}
	
	@MockMethod(targetClass=String.class, targetMethod="substring")
	public String substring(int beginIndex) {
		return "Mock [String Class] [SubString Method]";
	}
	
	@Test
	public void test() {
		// Mock Method Work - result - "Mock [String Class] [SubString Method]"
		String firstNestStr = service.firstNestSubString("Hello");
		assertEquals("Mock [String Class] [SubString Method]", firstNestStr);
		
		// Mock Method UnWork - result - "ello"
		String secondNestStr = service.secondNestSubString("Hello");
		assertEquals("ello", firstNestStr);

	}
	

}
