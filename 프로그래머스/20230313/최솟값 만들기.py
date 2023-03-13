Python 3.9.1 (tags/v3.9.1:1e5d33e, Dec  7 2020, 17:08:21) [MSC v.1927 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> def solution(A,B):
    A.sort()
    B.sort()
    sumA=0
    length=len(A)
    for i in range(length):
        sumA=sumA+A[i]*B[length-i-1]
    
    return sumA