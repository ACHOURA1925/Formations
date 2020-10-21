package com.niji.numbers.test;

import com.niji.nombres.Nombres;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {
	
    @Test
    public void square() throws Exception {
      assertEquals("negative numbers aren't square numbers", false, Nombres.isSquare(-1));
      assertEquals("0 is a square number (0 * 0)",    true,   Nombres.isSquare(0));
      assertEquals("3 isn't a square number", false,  Nombres.isSquare(3));
      assertEquals("4 is a square number (2 * 2)",    true,   Nombres.isSquare(4));
      assertEquals("25 is a square number (5 * 5)",   true,   Nombres.isSquare(25));
      assertEquals("26 isn't a square number",false,  Nombres.isSquare(26));      
    }
    
    
    @Test
    public void somme()
    {
      assertEquals(-1, Nombres.GetSum(0, -1));
      assertEquals(1, Nombres.GetSum(0, 1));
    }

}
