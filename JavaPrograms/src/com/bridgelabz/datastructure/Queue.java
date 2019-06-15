/******************************************************************************
 * 
 *  
 *  Purpose: Functions or Operations Of Queue.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/package com.bridgelabz.datastructure;

public class Queue<T> {
	Node<T> head;
	int length=0;
	
	class Node<T>
	{
		T data;
		Node<T> next;
		Node(T data){
			this.data=data;
			next=null;
		}
	}
	/**
	 * Function to add data in a queue.
	 * @param data:any data string,integer etc
	 * @return head of the data
	 */
	public Node<T> enqueue(T data) {
		Node<T> newnode=new Node<T>(data);
		Node<T> temp=head;
		if(head==null) {
			head=newnode;
			length++;
			return head;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=newnode;
		length++;
		newnode.next=null;
		return head;
	}
	/**
	 * Function to delete the data from queue 
	 * @return
	 */
	public String dequeue() {
	  Node<T> temp=head;
	  if(length==0) {
		  System.out.println("No element Present");
		  return "";
	  }
	  head=head.next;
	  length--;
	  return (String) temp.data;
	}
	/**
	 * Function to display all th data present in queue
	 */
	public void display() {
		Node<T> newnode=head;
		int size=size();
		for(int i=0;i<size;i++) {
			System.out.println(newnode.data+" ");
			newnode=newnode.next;
		}
	}
	/**
	 * Function to know the Size of Queue
	 * @return length of queue
	 */
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}
	
	/**
	 * Function to return front element.
	 * @param <T> generics
	 * @return head of list
	 */
	public <T> T topElement() {
		return (T) head.data;
		
	}
}
