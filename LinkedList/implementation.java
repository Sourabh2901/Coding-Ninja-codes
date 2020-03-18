import java.util.Scanner;

public class LinkedListUse {

	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
	//	System.out.println("Enter node data");
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
		//	System.out.println("Enter node data");
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
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);

	}

}
