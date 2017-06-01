package org.httpinvoker.client;

import java.io.Serializable;

import org.httpinvoker.client.model.CapitalOutput;

public interface StateCapitalServiceIF extends Serializable {
	
	public String getCapital(final String stateName);
	
	public CapitalOutput  getCapitalInOut(String state);
	


}
