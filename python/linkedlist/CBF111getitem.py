# A complete working Python program to demonstrate all 
# insertion methods of linked list 
  
# Node class 
class Node: 
  
    # Function to initialise the node object 
    def __init__(self, data): 
        self.data = data  # Assign data 
        self.next = None  # Initialize next as null 
    def __repr__(self):
        return repr(self.data)
  
  
# Linked List class contains a Node object 
class LinkedList: 
  
    # Function to initialize head 
    def __init__(self): 
        self.head = None
        self.n = 0
        self.tail = None
  
    # Functio to insert a new node at the beginning 
    def push(self, new_data): 
  
        # 1 & 2: Allocate the Node & 
        #        Put in the data 
        new_node = Node(new_data) 
  
        # 3. Make next of new Node as head 
        new_node.next = self.head 
  
        # 4. Move the head to point to new Node 
        self.head = new_node 
        self.n += 1
        #if self.n==1: self.tail=new_node
        #return self
        if self.tail is None:
            self.tail = new_node
        return self

    # This function is in LinkedList class. Inserts a 
    # new node after the given prev_node. This method is 
    # defined inside LinkedList class shown above */ 
    def insertAfter(self, prev_node, new_data): 
  
        # 1. check if the given prev_node exists 
        if prev_node is None: 
            print ("The given previous node must in the Linked List.")
            return
  
        #  2. create new node & 
        #      Put in the data 
        new_node = Node(new_data) 
  
        # 4. Make next of new Node as next of prev_node 
        new_node.next = prev_node.next
  
        # 5. make next of prev_node as new_node 
        prev_node.next = new_node 
        self.n += 1
        if prev_node==self.tail: self.tail=new_node
    
    # This function is defined in Linked List class 
    # Appends a new node at the end.  This method is 
    # defined inside LinkedList class shown above */ 
    def append(self, new_data): 
  
        # 1. Create a new node 
        # 2. Put in the data 
        # 3. Set next as None 
        new_node = Node(new_data)
        
        # 4. If the Linked List is empty, then make the 
        #    new node as head 
        if self.head is None: 
            self.head = new_node 
        else:
            self.tail.next=new_node

        self.tail=new_node
        self.n += 1 
        return self

    # Utility function to print the linked list 
    def printList(self): 
        q = self.head 
        while q: 
            print(q) 
            q = q.next

    def __repr__(self):
        res=[]
        q = self.head 
        while q: 
            res.append(str(q))
            q = q.next

        return '['+', '.join(res)+']'

    def heads(self, n=5):  # you should change head to heads
        res=[]
        q = self.head 
        i=0
        while q and i<n: 
            res.append(str(q))
            i+=1
            q = q.next
        return '['+', '.join(res)+']'
    
    def __getitem__(self, n):
        if not isinstance(n, int):
            raise TypeError("Index must be an integer")
        
        if n < 0: n += self.n
        
        if n < 0 or n >= self.n:
            raise IndexError("Index out of range")
        # 以上的程式碼請保留，只修改以下的部份
        curr = self.head
        # ???
        #
        return curr.data

    def __len__(self):
        return 0  # ???
    
    def deleteNode(self, key):
        
        
        
        
        
        
        
        return


if __name__ == '__main__':
   ll = LinkedList()
   from random import randint
   print('由前端依次加入5, 10, 15:')
   ll.push(5).push(10).push(15)
   print('由尾端加入3個介於[10,99]間的整數:')
   for i in range(3):
       ll.append(randint(10, 99))
   print('=>串列內容為'+str(ll)+', 長度為'+str(len(ll)) )
   print('index=0, 2, 4的值依次為：')
   print(ll[0], end=',')
   print(ll[2], end=',')
   print(ll[4])

   print('index=-1, -3, -5的值依次為：')
   print(ll[-1], end=',')
   print(ll[-3], end=',')
   print(ll[-5])

   print('刪除index=3的元素後：')
   ll.deleteNode(ll[3])
   print('=>串列內容為'+str(ll)+', 長度為'+str(len(ll)) )
   print('由尾端加入hello, hi')
   ll.append('hello').append('hi')
   print('=>串列內容為'+str(ll)+', 長度為'+str(len(ll)) )
""" 執行結果類似如下:
由前端依次加入5, 10, 15:
由尾端加入3個介於[10,99]間的整數:
=>串列內容為[15, 10, 5, 85, 43, 93], 長度為6
index=0, 2, 4的值依次為：
15,5,43
index=-1, -3, -5的值依次為：
93,85,10
刪除index=3的元素後：
=>串列內容為[15, 10, 5, 43, 93], 長度為5
由尾端加入hello, hi
=>串列內容為[15, 10, 5, 43, 93, 'hello', 'hi'], 長度為7
"""

