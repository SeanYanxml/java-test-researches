package com.yanxml.test.mock.testablemock.quickstart;

/**
*
* Author: sean
* Date:Feb 19, 202111:53:22 PM
*/

public class QuickStartDemo {
	
	public String say(String methodword) {
		String resultWorld = "";
		if(methodword.equals("Hello")) {
			resultWorld = sayHello();
		}else if(methodword.equals("Bye")) {
			resultWorld = sayBye();
		}
		return resultWorld;
	}
	
	public String sayHello() {
		return "Hello";
	}
	
	public String sayBye() {
		return "Bye";
	}

}
