/******************************************************************************
 * 
 *  
 *  Purpose: Generic Dequeue class.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   24-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class Dequeue<T> {
	public T data;
	public Dequeue<T> next;
	public Dequeue<T> pre;
	
	public Dequeue() {
		this.next=null;
		this.pre=null;
	}
	
	public Dequeue(T val) {
		this.data=val;
		this.next=null;
		this.pre=null;
	}

	

}
