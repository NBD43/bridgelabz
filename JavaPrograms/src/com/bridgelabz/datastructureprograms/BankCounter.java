/******************************************************************************
 * 
 *  
 *  Purpose: Functions of bank counter operations .
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

public class BankCounter {
	//Inner class
	class Node{
		int data;
		Node next;
		Node(){
			data=0;
			next=null;
		}
		Node(int d,Node n){
			data=d;
			next=n;
		}
		public void setNode(int d) {
			data=d;
		}
		public void setNext(Node n) {
			next=n;
		}
		public int getNode() {
			return data;
		}
		public Node getNext() {
			return next;
		}
		
	};
	public Node front,rear;
	public int size;
	
	public BankCounter() {
		front=null;
		rear=null;
		size=0;
	}
	public boolean isEmpty() {
		return front==null && rear==null;
	}

	public void insert(int data) {
		Node newnode=new Node(data,null);
		if(rear==null)
		{
			front=newnode;
			rear=newnode;
		}
		else {
			rear.setNext(newnode);
			rear=rear.getNext();
		}
		size++;
	}
		
	
	public void display() {
		int ptr1 = 0;
		
		if(size == 0)
		{
			System.out.println("Empty");
		}
		
		Node ptr = front;
		
		while(ptr != rear.getNext())
		{
			ptr1 = ptr1+ptr.getNode();
			System.out.println(ptr1);
			
			ptr = ptr.getNext();
		}
		System.out.println();
		
	}

	public void remove() {
		if(isEmpty()) {
			System.out.println("there is nothing ");
		}
		Node ptr=front;
		front=ptr.getNext();
		if(front==null)
		{
			rear=null;
			size--;
		}
		
		
	}
	
	public int peek() {
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		int data=front.getNode();
		return data;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
