package com.bridgelabz.beans;

public class TravelAgent {
	private Tourplan tp;
	
	

	public TravelAgent(Tourplan tp) {
		System.out.println("TravelAgent.1-paramConstructor");
		this.tp = tp;
	}

	public TravelAgent() {
		System.out.println("TravelAgent.0-paramConstructor");
	}

	public void setTp(Tourplan tp) {
		System.out.println("TravelAgent.setTp()");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + "]";
	}
	
	
	
	

}
