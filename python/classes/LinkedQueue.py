# Python3 program to demonstrate linked list 
# based implementation of queue 

# A linked list (LL) node 
# to store a queue entry 
class Node: 
    
    def __init__(self, data): 
        self.data = data 
        self.next = None

# A class to represent a queue 

# The queue, front stores the front node 
# of LL and rear stores the last node of LL 
class Queue: 
    
    def __init__(self): 
        self.front = self.rear = None

    def isEmpty(self): 
        return self.front == None
    
    # Method to add an item to the queue 
    def enQueue(self, item): 
        temp = Node(item) 
        
        if self.rear == None: 
            self.front = self.rear = temp 
            return self
        self.rear.next = temp 
        self.rear = temp 
        return self

    # Method to remove an item from queue 
    def deQueue(self): 
        
        if self.isEmpty(): 
            return None
        temp = self.front 
        self.front = temp.next

        if(self.front == None): 
            self.rear = None
        return temp.data

    def __str__(self):
        res=[]
        p = self.front 
        first=True
        while p: 
            res.append( f'{p.data}' )
            p = p.next
        res.reverse()
        return '>'+', '.join(res)+'>'

    def __repr__(self):
        return self.__str__()

    def getFront(self):
        return self.front.data

    def getRear(self):
        return self.rear.data

