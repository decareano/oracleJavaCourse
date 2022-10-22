/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class FibonacciNums {
  
    public static void main(String[] args) {
    int n = 5;
    int firstItem = 0;
    int secondItem = 1;
    int sumFibonacci = 0;
    int nextTerm = 0;

    for (int i = 1; i <= n; ++i) {
      nextTerm = firstItem + secondItem;
      firstItem = secondItem;
      secondItem = nextTerm;
      sumFibonacci += nextTerm;
      
      //System.out.println(nextTerm += sumFibonacci);
      
    }
    System.out.println(sumFibonacci);
    
    
        
        
    }
    
}
