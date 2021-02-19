package com.yanxml.test.mock.testablemock.bug.nest;

/**
*
* Author: sean
* Date:Feb 20, 202112:24:01 AM
*/

public class StringService {
	
	public SubStringService subService = new SubStringService();
	
	public String firstNestSubString(String str) {
		return str.substring(1);
	}
	
	public String secondNestSubString(String str) {
		return subService.nestSubString(str);
	}

}
