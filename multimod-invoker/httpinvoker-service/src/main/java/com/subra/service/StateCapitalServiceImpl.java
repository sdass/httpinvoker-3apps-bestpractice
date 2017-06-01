package com.subra.service;

import java.util.Map;

import org.httpinvoker.client.StateCapitalServiceIF;
import org.httpinvoker.client.model.CapitalOutput;

public class StateCapitalServiceImpl implements StateCapitalServiceIF {

	
	 Map<String, String> statestoCapital = null;
	
	 /*
	static {
		statestoCapital.put("NJ", "Tentron");
		statestoCapital.put("NY", "Albany");
		statestoCapital.put("OH", "Columbus");
		statestoCapital.put("MA", "Boston");
	}
	
	*/
    
	public StateCapitalServiceImpl() {

		 System.out.println("In the constructor() . . .");
	}

	 
	@Override
	public String getCapital(String stateName) {
		
		return this.statestoCapital.get(stateName);
		
	}
	
	
	public void setStatestoCapital(Map<String, String> statestoCapital) {
		this.statestoCapital = statestoCapital; //one time whole map from spring xml cfg
	}
	

	@Override
	public CapitalOutput getCapitalInOut(String astate) {
		CapitalOutput output = new CapitalOutput();
		output.setState(astate);
		output.setCapital(this.statestoCapital.get(astate));
		return output;
	}
	

}
