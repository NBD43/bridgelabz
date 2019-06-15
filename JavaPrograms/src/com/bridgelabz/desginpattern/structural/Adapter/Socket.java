package com.bridgelabz.desginpattern.structural.Adapter;

public class Socket {
	public static Volt getVolt() {
		return new Volt(120);
	}

}
