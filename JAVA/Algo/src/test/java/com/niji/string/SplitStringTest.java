package com.niji.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SplitStringTest {

	
    @Test
    public void testEvenString() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(SplitString.solution(s)));
       assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(SplitString.solution(s1)));
    }
    
    @Test
    public void testOddString() {
       String s = "abcde";
       String s1 = "LovePizza";
       assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(SplitString.solution(s)));
       assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(SplitString.solution(s1)));
    }
}
