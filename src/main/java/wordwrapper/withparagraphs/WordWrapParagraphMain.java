package wordwrapper.withparagraphs;

import java.util.concurrent.atomic.AtomicInteger;

public class WordWrapParagraphMain {

	private static final String INPUT = "The ability to securely access (replicate and distribute) directory\r\n" + 
			"information throughout the network is necessary for successful\r\n" + 
			"deployment.  LDAP's acceptance as an access protocol for directory\r\n" + 
			"information is driving the need to provide an access control model\r\n" + 
			"definition for LDAP directory content among servers within an\r\n" + 
			"enterprise and the Internet.  Currently LDAP does not define an\r\n" + 
			"access control model, but is needed to ensure consistent secure\r\n" + 
			"access across heterogeneous LDAP implementations.  The requirements\r\n" + 
			"for access control are critical to the successful deployment and\r\n" + 
			"acceptance of LDAP in the market place.\r\n" + 
			"This section is divided into several areas of requirements: general,\r\n" + 
			"semantics/policy, usability, and nested groups (an unresolved issue).\r\n" + 
			"The requirements are not in any priority order.  Examples and\r\n" + 
			"explanatory text is provided where deemed necessary.  Usability is\r\n" + 
			"perhaps the one set of requirements that is generally overlooked, but\r\n" + 
			"must be addressed to provide a secure system. Usability is a security\r\n" + 
			"issue, not just a nice design goal and requirement. If it is\r\n" + 
			"impossible to set and manage a policy for a secure situation that a\r\n" + 
			"human can understand, then what was set up will probably be non-\r\n" + 
			"secure. We all need to think of usability as a functional security\r\n" + 
			"requirement.\r\n" + 
			"Copyright (C) The Internet Society (2000).  All Rights Reserved.\r\n" + 
			"This document and translations of it may be copied and furnished to\r\n" + 
			"others, and derivative works that comment on or otherwise explain it\r\n" + 
			"or assist in its implementation may be prepared, copied, published\r\n" + 
			"and distributed, in whole or in part, without restriction of any\r\n" + 
			"kind, provided that the above copyright notice and this paragraph are\r\n" + 
			"included on all such copies and derivative works.  However, this\r\n" + 
			"document itself may not be modified in any way, such as by removing\r\n" + 
			"the copyright notice or references to the Internet Society or other\r\n" + 
			"Internet organizations, except as needed for the purpose of\r\n" + 
			"developing Internet standards in which case the procedures for\r\n" + 
			"copyrights defined in the Internet Standards process must be\r\n" + 
			"followed, or as required to translate it into languages other than\r\n" + 
			"English.\r\n" + 
			"The limited permissions granted above are perpetual and will not be\r\n" + 
			"revoked by the Internet Society or its successors or assigns.\r\n" + 
			"This document and the information contained herein is provided on an\r\n" + 
			"\"AS IS\" basis and THE INTERNET SOCIETY AND THE INTERNET ENGINEERING\r\n" + 
			"TASK FORCE DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING\r\n" + 
			"BUT NOT LIMITED TO ANY WARRANTY THAT THE USE OF THE INFORMATION\r\n" + 
			"HEREIN WILL NOT INFRINGE ANY RIGHTS OR ANY IMPLIED WARRANTIES OF\r\n" + 
			"MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.";
	
	
	public static void main(String[] main) {
		
		String[] array = INPUT.split("\r\n");
	
		int aveLength = getAveLength(array,
				(INPUT.length() - (4* array.length)));
		
	
	    StringBuilder output = new StringBuilder();
	    
	    for(String arr : array) {
	    	output.append(arr);
	    	output.append("\r\n");
	    
	    	if(arr.length() < aveLength) {
	    		
	    		output.append("\n");
	    		
	    	}
	    }
	  
	    System.out.println(output.toString());
	}
	
	
	private static int getAveLength(String[] array, int length) {
		
		return length/array.length;
				
	}
}
