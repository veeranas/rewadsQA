package java8Feat;

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    
    String input = "Hello World Test";
    
   List<String> ReverseList = new ArrayList<String>();
    
    char[] inInchar = input.toCharArray();
    

    
    int lengthOfChars = inInchar.length;
    
    int spaceStartCount = inInchar.length-1;
    int spaceEndCount = 0;
    
    
    for(int i= lengthOfChars-1 ; i >= 0 ; i--)
     {
         
  //  System.out.print(inInchar[i]);
          if(inInchar[i] == ' ')
          {
               String currentWord = input.substring (i+1, spaceStartCount+1);
               ReverseList.add(currentWord);
               
              spaceEndCount = i;
              spaceStartCount = i;
          }
        
     }
     if(spaceStartCount!=0){
       //   System.out.println("here");
         
               String currentWord = input.substring(0,  spaceStartCount);
                       ReverseList.add(currentWord);
               
     }
   
  
    
    //  System.out.println("  " + ReverseList);
    
    
  StringBuffer b1 = new StringBuffer();
    
   int lengthOfArray = ReverseList.size();
     for(int itr =0; itr< lengthOfArray; itr++ ){  
     
    	 b1.append(ReverseList.get(itr));
    	 if(itr != lengthOfArray -1 ) {}
    	 
    	 b1.append(" ");
    	 
   }  
  System.out.println(b1.toString());
}
    
}