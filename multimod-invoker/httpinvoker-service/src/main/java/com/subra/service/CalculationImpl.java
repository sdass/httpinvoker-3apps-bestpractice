package com.subra.service;

import org.httpinvoker.client.Calculation;
import org.httpinvoker.client.model.CalcOutput;

public class CalculationImpl implements Calculation {
	
	public int cube(int number){
		return number * number * number;
	}

	@Override
	public CalcOutput getCalcInOut(int number) {
		CalcOutput output = new CalcOutput();
		output.setInput(number);
		output.setOutput(number*number*number);
		return output;
	}

}
