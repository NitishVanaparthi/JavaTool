package org.jnit.queueListLinkedList;

public class ArrayObjectQueues {
	/*
	 * The Best example of Queues are the usual queues you find at railway
	 * ticket counter and etc. WHich follows the First in First Out procedures
	 * queues consists of collection of similar datatypes items and are inserted
	 * from front of the queues and deleted from rear of the queue
	 * queues can be implented using array object notations
	 */
	
	private final int MAXQUEUE = 100;
	private Object[] items;
	private int front, rear;
	
	public ArrayObjectQueues(){
		items=new Object[MAXQUEUE];
		front = items.length-1;
		rear = items.length-1;
	}
	
	public boolean empty(){
		if(front==rear)
			return true;
		else
			return false;
		
	}
	
	
	public Object remove(){
		if(empty()){
			System.out.println("Queue Underflow");
			System.exit(1);
		}
		if(front==items.length-1)
			return 0;
		else 
			front++;
		return items[front];
	}


}
