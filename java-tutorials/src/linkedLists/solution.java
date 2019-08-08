package linkedLists;

public class solution {
	
	public static listNode addTwoNumbers (listNode l1, listNode l2) {
		listNode p1 = l1;
		listNode p2 = l2;
		
		
		
		listNode result = new listNode(0);
		listNode pr = result; 
		
		int sum = 0;
		int digit = 0;
		int co = 0;
		
		
		//when and how to add up the two numbers
		
		while (p1!=null || p2!=null || co!=0) {
			
			pr.next = new listNode(0);
			pr = pr.next;
			
			sum = 0;
			if (p1!=null) {
				sum = sum + p1.data;
				p1 = p1.next;
			}
			if (p2!=null) {
				sum = sum +p2.data;
				p2 = p2.next;
			}
			sum = sum + co;
			
			digit = sum%10;
			co = sum/10;
			pr.data = digit;
			
		
			
				
		}
		
		return result.next; 
		
	}
	
	
	
	public static void main (String[] args) {
		listNode l1_1 = new listNode (2);
		listNode l1_2 = new listNode (4);
		listNode l1_3 = new listNode (3);
		
		l1_1.next = l1_2;
		l1_2.next = l1_3;
		
		listNode l2_1 = new listNode (5);
		listNode l2_2 = new listNode (6);
		listNode l2_3 = new listNode (4);
		
		l2_1.next = l2_2;
		l2_2.next = l2_3;
		
		listNode result = addTwoNumbers (l1_1, l2_1);
		
		while (result!=null) {
			
			System.out.println(result.data);
			result = result.next;
		}
		
	}
}
