/******************************************************************************
 * 
 *  
 *  Purpose: Functions or Operations Of Dequeue.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class DequeueFunction<T> {
	
	Dequeue<T> front;
	Dequeue<T> rear;
	int size=0;
	
	public DequeueFunction() {
		
	}
	public void addFront(T item) {
		if(front==null) {
			front.data=item;
			rear=front;
		}else {
			Dequeue<T> tNode=null;
			tNode.data=item;
			front.pre=tNode;
			front=tNode;
		}
		size++;
	}
	
	public void addRear(T item) {
		if(front==null)
		{
			Dequeue<T> tNode=new Dequeue<T>(item);
			front=tNode;
			rear=front;
			
		}else {
			Dequeue<T>tNode=new  Dequeue<T>(item);
			rear.next=tNode;
			tNode.pre=rear;
			rear=tNode;
		}
		size++;
		
	}
	
	public T removeFront() {
		T val=null;
		if(front==null) {
			System.out.println("No elemnent to delete");
		}else {
			val=front.data;
			front=front.next;
		}
		size--;
		return val;
	}
	
	public T removeRear() {
		T val=null;
		if(front==null) {
			System.out.println("No element to delete");
		}else {
			val=rear.data;
			rear=rear.pre;
			rear.next=null;
			
		}
		size--;
		return val;
	}
	
	
	public boolean isEmpty() {
		if(front==null) 
			return true;
		else
			return false;			
	}
	
	public int size() {
		return size;
	}
	
}
