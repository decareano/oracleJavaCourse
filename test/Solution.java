

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class Solution {
    
  
    public static void main(String[] args) {
    //currLet = Character.toString(str.charAt(currPos));


    String str = "AAAACCCGGT";
    
    char[] target = new char[4];
   
    char[] str1 = str.toCharArray();
  
     target[0] = 'A';
     target[1] = 'T'; 
     target[2] = 'C';
     target[3] = 'G';
    
 
        for (int i = 0; i < str.length(); i++)   {          
            
                if (str1[i] == 'A') {
                  str1[i] = target[1];
                } else if (str1[i] == 'T') {
                  str1[i] = target[0];
                } else if (str1[i] == 'C') {
                  str1[i] = target[3];
                } else if (str1[i] == 'G') {
                  str1[i] = target[2];
                }
                  
        }
        // int[] intArray = count;
        // String joinedString = Arrays.toString(intArray);
        // //joinedString = Arrays.toString(intArray);
        //System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3]);
        System.out.println(str1);
        
    }
    
}
    
