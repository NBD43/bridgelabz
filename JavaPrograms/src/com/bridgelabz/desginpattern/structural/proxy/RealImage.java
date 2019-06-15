package com.bridgelabz.desginpattern.structural.proxy;

public class RealImage implements Image {


	private String fileName;
	public RealImage(String filename) {
		this.fileName=filename;
		loadFromDisk(filename);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying::"+fileName);
		
	}
	
	public void loadFromDisk(String filename) {
		System.out.println("Loading::"+fileName);
	}

}
