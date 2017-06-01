package org.httpinvoker.client;

import org.httpinvoker.client.model.CalcOutput;

public interface Calculation {
	
	int cube(int number);  
	
	public CalcOutput getCalcInOut(int number);

}
