import java.util.Scanner;

public class LinkedListUse {

	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();
		
		while(data != -1){
			Node<Integer> node = new Node<>(data);
			if(head == null){
				head = node;
				tail = node;
			}else{
				tail.next = node;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		s.close();
		return head;
	}
	
	private static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static Node<Integer> insert(Node<Integer> head ,int data ,int pos){
		Node<Integer> temp = head;
		Node<Integer> newNode = new Node<>(data);
		if(pos == 0){
			newNode.next = head;
			return newNode;
		}
		int i=0;
		while(i != pos - 1){
			temp = temp.next;
			i++;
		}
		Node<Integer> temp2 = temp.next;
		temp.next = newNode;
		newNode.next = temp2;
		
		return head;
	}
	
         private static Node<Integer> insertRecursively(Node<Integer> head, int data, int pos) {
		if(pos == 0){
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}
		if(head == null){
			return null;
		}
		head.next = insertRecursively(head.next ,data ,pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);

	}

}
