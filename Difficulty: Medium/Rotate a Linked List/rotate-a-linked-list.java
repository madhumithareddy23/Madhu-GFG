/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(head.next==null){
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node last = curr;
        int i=1;
        while(i<=k){

            Node remove = new Node(head.data);
            head = head.next;
            last.next = remove;
            last = remove;
            i++;
        }
        return head;
    }

}