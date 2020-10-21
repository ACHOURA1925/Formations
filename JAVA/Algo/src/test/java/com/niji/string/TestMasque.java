package com.niji.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMasque {

	  @Test
	    public void testSolution() {
	        assertEquals("############5616", MasquerChaine.maskify("4556364607935616"));
	        assertEquals("#######5616",      MasquerChaine.maskify(     "64607935616"));
	        assertEquals("1",                MasquerChaine.maskify(               "1"));
	        assertEquals("",                 MasquerChaine.maskify(                ""));

	        // "What was the name of your first pet?"
	        assertEquals("##ippy",                                    MasquerChaine.maskify("Skippy")                                  );
	        assertEquals("####################################man!",  MasquerChaine.maskify("Nananananananananananananananana Batman!"));
	    }
}
