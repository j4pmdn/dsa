package java_dsa.leetcode.queue;

public class DesignCircularQueue622 {
	
	static class MyCircularQueue {
		int [] array;
		int SIZE;
		int headIndex;
		int tailIndex;
		int count = 0; //current number of elements
		
		public MyCircularQueue(int k) {
			SIZE = k;
			array = new int[SIZE];
			headIndex = tailIndex = -1;
	    }
	    
	    public boolean enQueue(int value) {
	    	if(isFull() == true) {
	    		return false;
	    	}
	    	tailIndex++;
	    	if(tailIndex == SIZE) {
	    		tailIndex = 0;
	    	}
	    	if(isEmpty() == true) {
	    		headIndex = tailIndex;
	    	}
	    	array[tailIndex] = value;
	    	count++;
	        return true;
	    }
	    
	    public boolean deQueue() {
	        if (isEmpty() == true) {
				return false;
			}
	        headIndex++;
	        if(headIndex == SIZE) {
	        	headIndex = 0;
	        }
	        count--;
	        return true;
	    }
	    
	    public int Front() {
	        return isEmpty() ? -1 : array[headIndex];  
	    }
	    
	    public int Rear() {
	        return isEmpty() ? -1 : array[tailIndex];  
	    }
	    
	    public boolean isEmpty() {
	        return count <= 0;
	    }
	    
	    public boolean isFull() {
	     	return count >= SIZE;  
	    }
	}
	
	public static void main(String[] args) {
		MyCircularQueue myQueue = new MyCircularQueue(3);
		myQueue.enQueue(1);
		myQueue.enQueue(2);
		myQueue.enQueue(3);
		myQueue.deQueue();
		myQueue.enQueue(4);	
	}
	

}
