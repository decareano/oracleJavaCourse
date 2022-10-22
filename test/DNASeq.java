

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
import java.util.*;

public class DNASeq {
  
    public static void main(String[] args) {
    //currLet = Character.toString(str.charAt(currPos));


    String str = "GAGGCAGGGACACGCACCACCACGCTCTCAGGATGTGTTGTCTTACAATATCATATCCGACCGGCGTTCTCTCATGATCTTCCCGGGGAGGTGTTTGTCGACTAATCAGGCTGATCTCGAGTATGGAAACGCATGTTCCACGCGCGTATACTGAATCAGCGCTAAACCACGGCGCCATGCTCTTACTTGTGACCGCAATTCTAACGACCGCCGGGGGGGACAAATGTTCCGACTTGCACGTTCTTTATGTCGCCAGCTGAATCCACTCGTCGACGCTCTGGCGCGGAATTAACTACTCATACACACGAGTATCTTCACATTCTTAATTTGAATCGCCGGCCACGCAGATATCATGCTCCGATTGACTTAGGCACGATCGTCTAGCGATCTCATTGGAACGAACTCGTCAAAGGAGTGGGTAAAATTACTTGGCGGAGTTCCGTGCGGAGGACGTAGAGAACTAATTTCAACGAAATTACAAACTAATTCACACCGCGAAAGTACACAGTGACTTATGGTAGGTTCGCGTAAGGTATGATTTGAGGAACTTCGTCTTTTCAGGCTTAAAGATCCACTCTGGTGCATGAAGGATCAGTGGCATGAGCTGACACGCCCTAAATTTTTCGATCTTGATCAAACCTTCAACGTCTCAAGTAGCCGCAGATAGACATTATCTACCCGGTCACATGTATCGTAAGAGTTACCCCGCTCTAGTTTATATGCTATATAAATACATTAAGGGTCTGGATCCACAGAAATAACAACCAGTTAAGGTGGCTCCGACGCCGGTAGGTCAACATGTATCTATTTAAGCGAGTCTTCTTTTGCCGGGCGGGCCCGGTTGCTTGAGGTTGGTCCGACTAAGAGCATGCCTTTTGGATGAATAAACAGGAAGCCCCCCTTTTCGCTGACCAGCGCTGGCGCGGCGGGTAAGTCACTTTGCGCTCATACCCACCTAGCACTCAGGGTCCTGCTTGTATTTGCCTGCCCA";
    char[] str1 = str.toCharArray();
    int[] count = new int[4];
    
    count[0] = 0;
    count[1] = 0; 
    count[2] = 0;
    count[3] = 0;
    
 
        for (int i = 0; i < str1.length; i++)   {          
            
                
              if (str1[i] == 'A') {
                System.out.println(count[0]++);

              } else if (str1[i] == 'C') {
                System.out.println(count[1]++);
                
              } else if (str1[i] == 'G') {
                System.out.println(count[2]++);
              
              } else if (str1[i] == 'T') {
                System.out.println(count[3]++);
              
              } else {
                System.out.println("not what we are looking for");
              }
            
        }
        int[] intArray = count;
        String joinedString = Arrays.toString(intArray);
        // //joinedString = Arrays.toString(intArray);
        System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3]);

        
    }
    
}
