class Solution {
  fun solution(n: Int): Long {
      var answer: Long = 0
      var list=LongArray(n+1)
      list[0]=1
      list[1]=1
      //배열 초기화할때 인덱싱 초과되는경우 생각하자
      for(i in 2..n){
          list[i]=(list[i-1]+list[i-2])%1234567
      }
      answer=list[n]
      /*d[i]는 i번째칸을 가는데 갈수있는 경우의수= 1칸만 더 가도되는경우+2칸만 더 가도되는경우
      d[1]=1=1
      d[2]=1 1,2=2
      d[3]=1 1 1, 1 2,2 1=3
      d[4]=1 1 1 1,1 2 1,2 1 1, 1 1 2,2 2=5
      
      */
      return answer
  }
}