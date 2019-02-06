/* 
  Write a recursive method fib(n) that returns the nth Fibonacci number.
  n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 
  and n == 3 should return 2. Assume n is less than 15.
*/

public static int fib(int n) {
    if (n ==0) {return 0;}
    if(n == 1 || n == 2){return 1;} 
    return fib(n-1) + fib(n-2);
}

/*
  BONUS: solved using for loop
*/

public static int fib(int n){ 
  if(n == 1 || n == 2){ 
      return 1; 
  } 
  
  int prevNum=1, nextNum=1, fibonacci=1;
  
  for(int i= 3; i<= n; i++){
      fibonacci = prevNum + nextNum; 
      prevNum = nextNum; 
      nextNum = fibonacci; 
  } 
  
  return fibonacci;
}
