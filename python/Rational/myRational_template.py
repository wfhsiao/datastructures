# -*- coding: utf-8 -*-
"""
Created on Mon Apr 18 11:15:49 2022
請利用Rational類別完成以下級數的計算，其中n為整數，由使用者輸入，可重複測試直至輸入0為止。請完成

mySum(n)方法：計算總和並印出結果，請留意輸出格式，當只有1項, 2項, 3項, 及4項以上的輸出都是評分的項目。

pi 的分數表示法如下(移至連結上並按Ctrl+滑鼠左鍵)：
https://github.com/wfhsiao/datastructures/blob/master/data/pi2.png

執行範例如下(本題測試n=1500，同學應由小的n來測試正確性)：
mySum(0)=3, 逼近值為:3.0
mySum(1)=19/6, 逼近值為:3.1666666666666665
mySum(2)=47/15, 逼近值為:3.1333333333333333
...
mySum(1500)=(要能正確顯示完整的分數), 逼近值為:3.1415926535158674


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

    def __float__(self):
        return self.p/self.q
    
def myPi(n):
    mysum = Rational(0)
    
    
    
    
    return mysum

if __name__=='__main__':
    a = Rational(1,2)
    b = Rational(3,4)
    c = a+b+1 # 1/2 + 3/4 + 1 = 9/4
    d = b-a-1 # 3/4 - 1/2 - 1 = -3/4
    print(f'{c}={float(c)}') # 9/4 = 2.25
    print(f'{d}={float(d)}') # -3/4 = -0.75
    
    res = myPi(1500)
    print(f'{res}, 逼近值為:{float(res)}')
