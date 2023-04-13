# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 11:15:49 2022
請利用Rational類別完成以下級數的計算，其中n為整數，由使用者輸入，可重複測試直至輸入0為止。請完成

2/3=0.66667
1/3=0.33333
myValue(8)=5906/4247, 逼近值為:1.390628679067577

@author: wfhsi
"""

# p/q
class Rational:
    def __init__(self, p, q=1):
       g = self.gcd(p, q)
       neg = False
       if p*q<0: neg = True
       self.p = abs(p//g)
       self.q = abs(q//g)
       if neg:
         self.p *= -1  

    def __repr__(self):
       if self.q == 1: return f'{self.p}'
       return f'{self.p}/{self.q}'
    def gcd(self, p, q):
        if q==0: return abs(p)
        return self.gcd(q, p%q)
    # operator override +
    def __add__(self, aRational):
        if type(aRational) is Rational:
            newp = self.p * aRational.q + self.q * aRational.p
            newq = self.q * aRational.q
            return Rational(newp, newq)  
        elif type(aRational) is int:
            return self + Rational(aRational)
        else:
            raise Exception('not implemented!')

    def __sub__(self, aRational):
        # 仿照 __add__ 來完成此方法
        
        
        
        
        
        
        return 
    def __truediv__(self, aRational):
        # 仿照 __add__ 來完成此方法
        
        
        
        
        
        
        return

    def __float__(self):
        return self.p/self.q
    
def myPi(n):
    mysum = Rational(0)
    
    
    
    
    return mysum
def myValue(n):
    #sum1 = 
    #sum2 = 
    return sum1 / sum2

if __name__=='__main__':
    a = Rational(1,2)
    b = Rational(3,4)
    c = a/b # 1/2 / 3/4 = 2/3
    d = a/b/2 # 1/2 / 3/4 / 2 = 1/3
    print(f'{c}={float(c):.5}') # 2/3 = 0.66667
    print(f'{d}={float(d):.5}') # 1/3 = 0.33333
    
    N=8
    res = myValue(N)
    print(f'myValue({N})={res}, 逼近值為:{float(res)}')
