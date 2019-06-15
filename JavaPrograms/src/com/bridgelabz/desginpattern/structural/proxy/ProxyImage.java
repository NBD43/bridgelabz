package com.bridgelabz.desginpattern.structural.proxy;

public class ProxyImage implements Image{
	private RealImage realimage;
	private String filename;
	public ProxyImage(String filename) {
		this.filename=filename;
		
	}
	public void display() {
		if(realimage==null) {
			realimage=new RealImage(filename);
		}
		realimage.display();
	}
	

}
