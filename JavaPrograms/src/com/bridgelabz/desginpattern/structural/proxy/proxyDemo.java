package com.bridgelabz.desginpattern.structural.proxy;

public class proxyDemo {
	public static void main(String []args) {
		Image image=new ProxyImage("NBD.jpg");
		image.display();
		image.display();
	}

}
