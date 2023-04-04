# -*- coding: utf-8 -*-
"""
Created on Sun Apr  2 16:45:57 2023

@author: wfhsi
"""

# Python program for linked list implementation of stack

class StackNode:
    def __init__(self, data):
        self.data = data
        self.next = None
    
    def __repr__(self):
        return repr(self.data)


class Stack:
    def __init__(self):
        self.root = None

    def is_empty(self):
        return self.root is None

    def isEmpty(self):
        return self.is_empty()

    def push(self, data):
        new_node = StackNode(data)
        new_node.next = self.root
        self.root = new_node

    def pop(self):
        if self.is_empty():
            raise StackEmptyError("Cannot pop from an empty stack")
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        return popped

    def peek(self):
        if self.is_empty():
            raise StackEmptyError("Cannot peek from an empty stack")
        return self.root.data
        
    def __repr__(self):
        res = []
        curr = self.root
        while curr:
            res.append(str(curr))
            curr = curr.next
        if not res:
            return '['
        return '[' + ', '.join(res[::-1])

    def __len__(self):
        curr = self.root
        count = 0
        while curr:
            count += 1
            curr = curr.next
        return count
      
class StackEmptyError(Exception):
    pass