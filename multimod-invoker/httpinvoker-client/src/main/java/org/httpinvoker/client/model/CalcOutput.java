package org.httpinvoker.client.model;

import java.io.Serializable;

public class CalcOutput implements Serializable{


	private static final long serialVersionUID = 5825791975229027915L;

	private int input;
	private int output;
	
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + input;
		result = prime * result + output;
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
		CalcOutput other = (CalcOutput) obj;
		if (input != other.input)
			return false;
		if (output != other.output)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CalcOutput [input=" + input + ", output=" + output + "]";
	}
	
	
}
