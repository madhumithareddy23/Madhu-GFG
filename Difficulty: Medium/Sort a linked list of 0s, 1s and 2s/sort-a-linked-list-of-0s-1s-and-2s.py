'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''
	
class Solution:
    def segregate(self, head):
        #code here
        initAns=[]
        new=head
        while new:
            initAns.append(new.data)
            new=new.next
        initAns.sort()
        current=head
        cou=0
        while current:
            current.data=initAns[cou]
            cou+=1
            current=current.next
        return head