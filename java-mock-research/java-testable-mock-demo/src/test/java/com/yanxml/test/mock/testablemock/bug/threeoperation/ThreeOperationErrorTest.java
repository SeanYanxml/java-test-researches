package com.yanxml.test.mock.testablemock.bug.threeoperation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.alibaba.testable.core.annotation.MockMethod;

/**
*
* Author: sean
* Date:Feb 20, 202112:29:13 AM
*/

public class ThreeOperationErrorTest {
	private static ThreeOperationError service = new ThreeOperationError();
	
	@MockMethod(targetClass=ThreeOperationError.class,targetMethod="threeOpeartion")
	private String threeOpeartion(String strA, String strB, String strC) {	
		return "abc";
	}

		
	@Test
	public void service() {
		String realStr = service.operation("test");
		String expectedStr = "abc";
		assertEquals(realStr, expectedStr);
	}
}
