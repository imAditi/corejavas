package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.Member;
	public class MemberTest {
		@Test
		public void testShowMemberDetail () {
			Member member = new Member();
			member.setfirstName("Aditi");
			member.setlastName("Jain");
			member.setemail("aditi.jain@yash.com");
			member.setpassword("12345");
			member.setrole("Trainee");
			assertEquals("{name : Aditi Jain, email : aditi.jain@yash.com, password : 12345, role : Trainee}", member.showMemberDetail());
			
		}

	}



