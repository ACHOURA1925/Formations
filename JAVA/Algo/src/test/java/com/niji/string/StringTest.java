package com.niji.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
	
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("TheStealthWarrior", Chaines.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-stealth-warrior";
      System.out.println("input: "+input);      
      assertEquals("TheStealthWarrior", Chaines.toCamelCase(input));
    }
	
	

}
