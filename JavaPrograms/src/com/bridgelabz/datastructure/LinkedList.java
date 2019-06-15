/******************************************************************************
 * 
 *  
 *  Purpose: To perform linked list operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   22-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class LinkedList<T> {
	Node<T> head;
	int length=0;
	public void insert(T data) {
		Node<T> node=new Node<T>();
		node.data= data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node<T> n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public void show() {
		Node<T> node=head;
		while(node.next!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data+" ");
	}
	
	public void insertAtStart(T data) {
		Node<T> node=new Node<T>();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index,T data) {
		Node<T> node=new Node<T>();
		node.data=data;
		node.next=null;
		Node<T> n=head;
		if(index==0) {
			insertAtStart(data);
		}else {
		
			for (int i=0;i<index-1;i++) {
				 n=n.next;
			
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0)
		{
			head=head.next;
		}
		else {
			Node<T> n=head;
			Node<T> n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			//System.out.println("n1:"+n1.data);
			n1=null;
		
			
		}
		
	}
	public boolean searchIt(T data) {
		Node<T> temp=head;
		if(head.data.equals(data)) {
			return true;
		}
		while(temp.next!=null) {
			temp=temp.next;
			if(temp.data.equals(data)) {
				return true;
			}
		}
		return false;
		
	}
	
	public void delete(T data) {
		Node<T> temp=head;
		Node<T> prev=temp;
		if(temp.data.equals(data)) {
			head=temp.next;
			length--;
			return;
		}
		while (temp.next != null) {
			prev = temp; // get previous of deleting node
			temp = temp.next;
			if (temp.data.equals(data)) {
				prev.next = temp.next; // change reference of previous node with next of deleting node
				length--;
			}
		}

	}

}
