package com.bridgelabz.desginpattern.behavioral.visitor;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}