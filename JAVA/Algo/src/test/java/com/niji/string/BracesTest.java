package com.niji.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracesTest {
	
	
	@Test
	public void testValid() {
    assertEquals(true, Braces.isValid("()"));
	}
  
  @Test
	public void testInvalid() {
    assertEquals(false, Braces.isValid("[({})](]"));
	}

}
