package com.yanxml.test.mock.testablemock.quickstart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.alibaba.testable.core.annotation.MockMethod;

/**
*
* Author: sean
* Date:Feb 19, 202111:53:53 PM
*/

public class QuickStartDemoTest {
	private static QuickStartDemo demo = new QuickStartDemo();
	
	@MockMethod(targetClass=QuickStartDemo.class,targetMethod="sayHello")
	public String sayHello() {
		return "Mock Hello";
	}
	
	@Test
	public void testQuickstart() {
		// 测试Mock方法
		String realHelloStr = demo.say("Hello");
		assertEquals("Mock Hello", realHelloStr);
		
		// 测试原本方法
		String realByeStr = demo.say("Bye");
		assertEquals("Bye", realByeStr);

	}

}
