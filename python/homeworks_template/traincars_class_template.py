# -*- coding: utf-8 -*-
# Python program for linked list implementation of stack
"""
輸入字串34512
原車廂序[2, 1, 5, 4, 3]
實際運作索引[1, 0, 4, 3, 2]
將車廂2推入第1個緩衝鐵軌
[2
直接從來源輸出車廂1
從緩衝鐵軌1輸出車廂2
將車廂5推入第1個緩衝鐵軌
[5
將車廂4推入第1個緩衝鐵軌
[5, 4
直接從來源輸出車廂3
從緩衝鐵軌1輸出車廂4
從緩衝鐵軌1輸出車廂5
需1個緩衝鐵軌。
----------------------------------------
輸入字串35421
原車廂序[1, 2, 4, 5, 3]
實際運作索引[0, 1, 3, 4, 2]
直接從來源輸出車廂1
直接從來源輸出車廂2
將車廂4推入第1個緩衝鐵軌
[4
將車廂5推入第2個緩衝鐵軌
[4
[5
直接從來源輸出車廂3
從緩衝鐵軌1輸出車廂4
從緩衝鐵軌2輸出車廂5
需2個緩衝鐵軌。
----------------------------------------

省略迴圈第 3, 4, 5次的結果

----------------------------------------
輸入字串26T57J3
原車廂序[3, 11, 7, 5, 10, 6, 2]
實際運作索引[1, 6, 4, 2, 5, 3, 0]
將車廂3推入第1個緩衝鐵軌
[3
將車廂11推入第2個緩衝鐵軌
[3
[11
將車廂7推入第2個緩衝鐵軌
[3
[11, 7
將車廂5推入第2個緩衝鐵軌
[3
[11, 7, 5
將車廂10推入第3個緩衝鐵軌
[3
[11, 7, 5
[10
將車廂6推入第3個緩衝鐵軌
[3
[11, 7, 5
[10, 6
直接從來源輸出車廂2
從緩衝鐵軌1輸出車廂3
從緩衝鐵軌2輸出車廂5
從緩衝鐵軌3輸出車廂6
從緩衝鐵軌2輸出車廂7
從緩衝鐵軌3輸出車廂10
從緩衝鐵軌2輸出車廂11
需3個緩衝鐵軌。
"""
# Class to represent a node
from LinkedStack import Stack


class TrainCars:
    def __init__(self, trains):
        #trains='12345689T'   #'16T574893'
        self.trains = trains
        self.idx2cars = self.convert(trains)
        self.cars2idx = self.value_to_index_dict(self.idx2cars)
        
    def convert(self, cars_str='2341T'):
        cars=[int(x) if x>='1' and x<='9' else 10 if x=='T' else 11 if x=='J' \
              else 12 if x=='Q' else 13 if x=='K' else None for x in list(cars_str) ]
        numbers = sorted(set(car for car in cars))
        result = {numbers.index(car): car for car in cars}
        return result

    def value_to_index_dict(self, index_to_value_dict):
        result = {value: index for index, value in index_to_value_dict.items()}
        return result

    
    def outPut(self, current, railstacks):
        # Student task: find the suitable railstack to output a car
        # Hint: loop through railstacks and check if the top car matches the current car




        return current
    
    # find the suitable railstack to push the current car
    # if there is non-empty railstack, find the minima top which is larger than current car
    # if there is empty railstack, put its priority to the least
    # using feasible list to store the index of the feasible railstack and its peek no.
    # if feasible list is empty, generate a new railstack
    # else: find the best railstack to put
    # print out all railstacks
    def push2Buffer(self, car, railstacks):
        idx2cars, cars2idx = self.idx2cars, self.cars2idx
        feasible=[]
        for i in range(len(railstacks)):
            if railstacks[i].isEmpty(): # set a large number for an empty stack
               feasible.append((i, 1000))
            elif cars2idx[railstacks[i].peek()] > car:
               feasible.append((i, railstacks[i].peek()))

        # Student task: implement the logic to find the best railstack to push the current car
        # Hint: loop through railstacks and find the one with the smallest top car larger than the current car
        if not feasible:  # railstacks are empty or current car_no is too large
           s = Stack()
           
           # ...
           
        else:
            min_i, _ = min(feasible, key=lambda x: x[1])
        # If there's no such railstack, create a new one





        # Print the current railstacks
        for s in railstacks:
            print(s)

           
    def process(self):
        idx2cars, cars2idx = self.idx2cars, self.cars2idx
        cars = list(idx2cars.keys())
        cars.reverse()

        # Student task: implement the main loop to process each car in the input sequence
        # Hint: check if the car can be output directly or needs to be pushed to a railstack










        return maxSize


if __name__=='__main__':
    
    import random
    carsall = [str(i) for i in range(1, 6)]  # '1'~'5'
    random.seed(1)
    for i in range(5):
        #cars = carsall[:]
        random.shuffle(carsall)
        newcars = ''.join(carsall)
        print(f'輸入字串{newcars}')
        rail = TrainCars(newcars)
        number_stacks = rail.process()
        print(f'需{number_stacks}個緩衝鐵軌。')
        print('-'*40)
    newcars='26T57J3'   #'16T574893'
    print(f'輸入字串{newcars}')
    rail = TrainCars(newcars)
    number_stacks = rail.process()
    print(f'需{number_stacks}個緩衝鐵軌。')    
    
