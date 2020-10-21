package com.niji.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PangramTest {
	
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";  
      assertEquals(true, Pangram.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";      
      assertEquals(false, Pangram.check(pangram2));
    }

}
