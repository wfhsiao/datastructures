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
            return float("-inf") 
        temp = self.root  
        self.root = self.root.next 
        popped = temp.data 
        return popped 
      
    def peek(self): 
        if self.isEmpty(): 
            return float("-inf") 
        return self.root.data 
  
    def __str__(self):
        res=''
        temp = self.root 
        first=True
        while temp: 
            if first: first=False
            else: res+=', '
            res += f'{temp.data}'
            temp = temp.next
            #if temp: res+=', '
        res += ']'
        return res

    def __repr__(self):
        return self.__str__()

