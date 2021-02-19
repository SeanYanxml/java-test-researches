package com.yanxml.test.mock.testablemock.bug.threeoperation;

/**
* 三元表达式Mock异常Bug.
* Author: sean
* Date:Feb 20, 202112:23:13 AM
*/

public class ThreeOperationError {
	
	public String operation(String str) {
		return threeOpeartion(str, str!=null? str:"",str!=null? str:"");
	}
	
	public String threeOpeartion(String strA, String strB, String strC) {
		return  strA+strB+strC;
	}

}
