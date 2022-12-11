/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
import java.io.*;
import java.util.*;
public class RosalindCGRatioEdit {
    
    
    
    public static void main(String[] args) throws IOException {
        //File myFile = new File("C:\\Users\\mgobelli\\OneDrive - Ultragenyx\\Pictures\\Desktop\\RosalindRepo\\GCRatio.txt");
        // bufferedReader was not working. I am trying Scanner...maybe simpler
        Scanner myFile = new Scanner(new File("C:\\Users\\mgobelli\\Documents\\rosalind_gc.txt")); 
        ArrayList<String> myName = new ArrayList<String>();
        ArrayList<String> mySeq = new ArrayList<String>();
        
        String seq = " ";
        
        while(myFile.hasNextLine()) {
               String tempLocal = myFile.nextLine();
               if (tempLocal.charAt(0) == '>') {
                   myName.add(tempLocal);
                   System.out.println(tempLocal);
                   mySeq.add(seq);
                   seq = "";
               } else {
                   seq += tempLocal;
                  
                   
               } 
               //mySeq.remove(0);
         
        }
        mySeq.remove(0);
        mySeq.add(seq);
        for(int i=0; i<myName.size(); i++){
			System.out.println("names: " + myName.get(i) +", sequences: " + mySeq.get(i));
			
        }
        // size of array
        int size = myName.size();
        //System.out.println(size); 
        double maxContent = 0;
        String seqName = "";
        
        for (int i =0;i<size;i++) {
            String temp = mySeq.get(i);
            double GCContent = countGC(temp);
            System.out.println(GCContent);
            
            if (GCContent > maxContent) {
                maxContent = GCContent;
                seqName = myName.get(i);            }
        }        
        //System.out.println(myName);
          System.out.println(seqName);    
          System.out.println(maxContent * 100);
          
    }
    
    public static double countGC(String genome) {
        int lenSeq = genome.length();
        double GCCount = 0;
        for (int i=0;i<lenSeq;i++) {
            if (genome.charAt(i) == 'G' || genome.charAt(i) == 'C') {
                GCCount++;
            }
        }
        return GCCount / lenSeq ;
        
    }
}
            
            


