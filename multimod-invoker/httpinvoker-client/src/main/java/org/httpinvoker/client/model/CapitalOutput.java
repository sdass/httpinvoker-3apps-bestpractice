package org.httpinvoker.client.model;

import java.io.Serializable;

public class CapitalOutput implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String state;
	private String capital;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CapitalOutput other = (CapitalOutput) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "CaptitalOutput [state=" + state + ", capital=" + capital + "]";
	}
	
	
	

}
