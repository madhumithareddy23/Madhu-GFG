/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

import java.util.*;

class Solution {
    
    Node sortedMerge(Node head1, Node head2) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // Store first list
        Node temp = head1;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        
        // Store second list
        temp = head2;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        
        // Sort the array
        Collections.sort(list);
        
        // Create new merged list
        Node head = null, tail = null;
        
        for(int num : list){
            Node newNode = new Node(num);
            
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        return head;
    }
}