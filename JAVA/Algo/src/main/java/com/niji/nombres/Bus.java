package com.niji.nombres;

import java.util.ArrayList;

public class Bus {
	
	  public static int countPassengers(ArrayList<int[]> stops) {
		    return stops.stream()
		                .mapToInt(x -> x[0] - x[1])
		                .sum();
		  }

}
