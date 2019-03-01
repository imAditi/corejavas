package com.yash.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.yash.java.DuplicateCharacter;
	public class DuplicateCharacterTest {
		@Test
		public void findAndReturnTheDuplicateCharacter() {
			DuplicateCharacter duplicatecharacter = new DuplicateCharacter();
			duplicatecharacter.setword("abcabdabc");
			System.out.println(duplicatecharacter.findDuplicateCharacter());
			
		}

	}
