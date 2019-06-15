/******************************************************************************
 *  Purpose: To perform stack operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   22-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class Stack <T>{
    Node<T> head;
	public static int top=-1;
	
	public class Node<T>{
		
		T data;
		Node<T> next;
		public Node(T d) {
			data=d;
			next=null;
		}

	};
	
	public void push(T data) {
		Node<T> n=new Node<>(data);
		Node t=head;
		if(head==null) {
			head=n;
			top=top+1;
			
		}
		else {
			while(t.next!=null) {
				t=t.next;
				
			}
			t.next=n;
			top++;
			n.next=null;
		}
		
	}
	
	public T pop() {
		Node<T> current=head;
		head=current.next;
		top--;
		return  (T) current.data;
		
	}
	
	public boolean isEmpty() {
		if(head==null)
		return true;
		else 
		return false; 
	}
	
	
	public int size() {
		return top;
	}
	
	public void display() {
		Node newNode=head;
		int size=size();
		for(int i=0;i<size;i++) {
			System.out.print(newNode.data+" ");
			newNode=newNode.next;
			System.out.println();
		}
		System.out.println(newNode.data);
	
	}
	
	public <T> T peek() {
		if(head==null)
		{
			System.out.println("No element Found");
			return null;
		}
		return (T)head.data;
	}


}
