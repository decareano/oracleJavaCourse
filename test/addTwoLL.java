/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
        
class addTwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(),
	result = dummy;
        
        int sum = 0, carry = 0;
        
    
    while (l1 != null || l2 != null) {
            sum = carry;  // Carry needs to be added always. If it's 0, result won't be affected
            
			// One of the numbers could have lesser digits than the other.
			// Thus, we check for the presence of the digits first and then add them to the sum.
            if (l1 != null) { 
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
			
			// After this the sum would be like: sum = carry + l1.val + l2.val, if both l1 and l2 are not null.
			// Now, if sum >= 10, we will have the case of a carry.
			// These are base 10 numbers.
			// Thus, a digit that needs to be added would be: digit = sum % 10 and carry would be carry = carry/10;
			// Consider that sum = 9. In that case, digit is 9 and carry is 0.
			// Consider that sum is 21. In that case, digit is 1 and carry is 2.
			// Thus, our result would be accurate for all cases - whether sum is greater than 10 or not.
            
			dummy.next = new ListNode(sum%10); // Adding digit directly
            carry = sum/10;
            dummy = dummy.next;
        }
        
		// If carry is remaining when digits of both numbers have exhausted, it is added in front of the number.
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }
        
        return result.next;
    }


    public static void main(String[] args) {
        ListNode mytest = new ListNode();
        
        
        
    }
}
