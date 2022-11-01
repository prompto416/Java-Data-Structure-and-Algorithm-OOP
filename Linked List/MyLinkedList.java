



public class MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
                ll.insert(0,3);
		ll.insert(0, 2);
		ll.insert(0, 1);
                ll.delete(2);
		System.out.println(ll);
              
                
                String output = "";
		Node current = ll.head;
		while (current != null) {
			output += current.getData();
			current = current.getNext();
		}
		int answer = Integer.parseInt(output);
		System.out.println(output);
                System.out.println(answer+1);

	}
	
	public Node head;
        public int size;
	public MyLinkedList() {
		head = null;
                size = 0;
	}
	public int getSize(){
            return size;
        }
        public Node find(int d){
            Node temp = head;
            for (int i= 0; i < size; i++){
                if (temp.getData()==d){
                    return temp;
                }
                temp = temp.getNext();
            }
            return head;
        }
	public int findFromIndex(int n) {
		Node current = head;
		int count = 0;
		while (count < n) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + n);
			}
			count++;
		}
		return current.getData();
	}
	
	public void insert(int pos, int val) {
		Node newNode = new Node(val, null);
		
		if (pos == 0) {
			newNode.setNext( head );
			head = newNode;
                        size++;
			return;
		}
		
		Node current = head;
		int count = 0;
		while (count < pos-1) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + (pos-1));
			}
			count++;
		}
		
		newNode.setNext( current.getNext() );
		current.setNext( newNode );
                size++;
                
	}
	public void add(int d){
            insert(size,d);
        }
	public void deleteFromIndex(int pos) {
		if (pos == 0) {
			head = head.getNext();
			return;
		}
		
		Node current = head;
		int count = 0;
		while (count < pos-1) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + (pos-1));
			}
			count++;
		}
		
		if (current.getNext() == null) {
			throw new IndexOutOfBoundsException("Cannot find item at position " + pos);
		}
		
		current.setNext( current.getNext().getNext() );
	}
        public void delete(int d){
            
            if (head.getData() == d){
                head = find(findFromIndex(1));
                return;
            }
            else if (findFromIndex(size-1) == d){
                find(findFromIndex(size-2)).setNext(null);
                return;
            }
            Node temp = head;
            int count = 0 ;
            for (int i =0; i < size;i ++){
                if (temp.getData() == d){
                    break;
                }
                count++;
                temp = temp.getNext();
            }
            Node right = find(findFromIndex(count+1));
            find(findFromIndex(count-1)).setNext(right);
            
            
        }

	public String toString() {
		String output = "";
		Node current = head;
		while (current != null) {
			output += current.getData() + ", ";
			current = current.getNext();
		}
		
		return output;
	}
        
       
}