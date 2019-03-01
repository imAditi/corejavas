package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.Section;
	public class SectionTest {
		@Test
		public void testShowSectionDetail () {
			Section section = new Section();
			section.setid(123);
			section.setname("core_java");
			section.setcreatedDate(2018,01,31);
			assertEquals(123,section.getid());
			assertEquals("core_java",section.getname());
			assertEquals("31-01-2018",section.getcreatedDate());
			
		}

	}
