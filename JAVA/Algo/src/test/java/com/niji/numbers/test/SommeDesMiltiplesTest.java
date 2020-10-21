package com.niji.numbers.test;

import com.niji.nombres.SommeDesMultiples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SommeDesMiltiplesTest {

	
	  @Test
	    public void test() {
	      assertEquals(23, new SommeDesMultiples().solution(10));
	    }
}
