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

    def __str__(self):
       if self.q == 1: return f'{self.p}'
       if abs(self.p)>self.q:
          r = abs(self.p)//self.q
          if self.p<0:
             r = -r
          self.p-= r*self.q
          return f'{r} {abs(self.p)}/{self.q}'
       else:
          return f'{self.p}/{self.q}'
    def __repr__(self):       
       return self.__str__()
    def gcd(self, p, q):
        if p==0: return abs(q)
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
  
