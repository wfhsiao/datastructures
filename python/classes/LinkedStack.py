# Python program for linked list implementation of stack 
  
# Class to represent a node 
class StackNode: 
  
    # Constructor to initialize a node 
    def __init__(self, data): 
        self.data = data  
        self.next = None
  
class Stack: 
      
    # Constructor to initialize the root of linked list 
    def __init__(self): 
        self.root = None
  
    def isEmpty(self): 
        return True if self.root is None else  False 
  
    def push(self, data): 
        newNode = StackNode(data) 
        newNode.next = self.root  
        self.root = newNode 
        #print(f"{data} pushed to the stack.") 
      
    def pop(self): 
        if (self.isEmpty()): 
            return None      # instead of float("-inf") 
        temp = self.root  
        self.root = self.root.next 
        popped = temp.data 
        return popped 
      
    def peek(self): 
        if self.isEmpty(): 
            return None      # instead of float("-inf") 
        return self.root.data 
  
    def __str__(self):
        p = self.root
        res=[]
        while p:
            res.append(f'{p.data}')
            p = p.next
        res.reverse()
        return '['+' '.join(res)

    def __repr__(self):
        return self.__str__()

