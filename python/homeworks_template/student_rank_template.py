# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 11:01:53 2022

請設計學生成績類別，成員資料包含學號，數學成績(math)、英文成績(english)、國文成績(chinese)、自然成績(science)，
成員方法為計算總分getTotal()及名次setRank()。
其中總分=1.2*math+1.2*english+chinese+1.1*science並四捨五入至第2位，

並完成以下外部方法：

setRanks 用以設定學生名次─基本想法是先將學生依總分降冪排序, 則第i筆的學生就是第i+1名. 
但如果跟上一筆的分數一樣則名次就設為一樣.

getStartRank 用以尋找符合使用者所搜尋名次的落點─如果所輸入的名次是28名, 但只有3個27名
沒有28名, 則必須將這3個27名都列出, 所以本方法的目的在於找到所輸入名次的落點

執行範例如下(本題測試其中一個成績檔，同學可以改成另一url來測試)：

共有35位學生。
原始成績:
學號     ,數學,英文,國文,自然,總分,名次
s95406001, 16, 12, 11, 11, 56.70, 0
s95406002, 22, 24, 12, 10, 78.20, 0
s95406003, 15, 22, 25, 20, 91.40, 0
...
s95406034, 14, 21, 10, 13, 66.30, 0
s95406035, 14, 20, 15, 13, 70.10, 0

排名後:
學號     ,數學,英文,國文,自然,總分,名次
s95406001, 16, 12, 11, 11, 56.70, 34
s95406002, 22, 24, 12, 10, 78.20, 16
s95406003, 15, 22, 25, 20, 91.40, 4
...
s95406034, 14, 21, 10, 13, 66.30, 30
s95406035, 14, 20, 15, 13, 70.10, 28
----------------------------------------
顯示查詢名次:
s95406004, 15, 21, 16, 23, 84.50, 7
s95406029, 20, 22, 11, 21, 84.50, 7

@author: wfhsi
"""

import requests

class Student:
   def __init__(self, sno, math, english, chinese, science):
       self.sno, self.math, self.english, self.chinese, self.science=
       self.total = 
       self.rank = 0
   def setRank(self, rank):
       self.rank=rank
   def getRank(self):
       return self.rank
   def getTotal(self):
       return self.total
   def __repr__(self):
       return f'{self.sno}, {self.math}, {self.english}, {self.chinese}, {self.science}, {self.total:.2f}, {self.rank}'

def printStudents(header, students):
     print('{:7s},{},{},{},{},{},{}'.format(*header.split(',')))
     for s in students:        
         print(s)

def parseScores(url):
     r = requests.get(url)
     text = r.text
     raw=text.split()
     header=raw[0]+',總分,名次'
     raw=raw[1:]
     raw=[x for x in raw if x] # remove the empty lines
     #print(raw[:5])
     students=[]
     for x in raw:








     return header, students


def setRanks(students):
     sorted_students=sorted(students, key=lambda
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
     return sorted_students
def print_students_nearest_rank(students, target_rank):
     ranked_students = sorted(students, key=lambda x: x.getRank())
     nearest_rank = -1










              
if __name__=='__main__':
    url2='https://raw.githubusercontent.com/wfhsiao/datastructures/master/data/sno_4_scores2.csv'
    url = 'https://raw.githubusercontent.com/wfhsiao/datastructures/master/data/sno_4_scores3.csv'
    header, students=parseScores(url2) # without supplement url, using default
    print(f'共有{len(students)}位學生。')
    print('原始成績:')
    printStudents(header=header, students=students)
    setRanks(students)
    print('排名後:')
    printStudents(header=header, students=students)
    print('-'*40)
    print('顯示查詢名次:')
    print_students_nearest_rank(students, 8)
