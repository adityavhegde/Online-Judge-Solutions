/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aditya
 */
public class SpiralPrinting {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp;
        int count=1;
        for(int i=0;i<4;i++){
            temp=new ArrayList<>();
            for(int j=0;j<4;j++){
            temp.add(count);
            count++;
            }
            a.add(temp);
        }
                
          ArrayList<Integer> res= spiralOrder(a);  
        
            for(int i:res)
                System.out.print(i+" ");
    }
    
	// DO NOT MODIFY THE LIST
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<>();
		 
		 int bottom=a.size()-1;
		 int right=a.get(0).size()-1;
		 int top=0, left=0;
		 
		 int dir=0;
		 
		 while(top<=bottom && left<=right){
		   if(dir==0){
		       for(int i=left;i<=right;i++)
		            result.add(a.get(top).get(i));
		            
		        top++; // increment top to delete the above row
		        dir=1; //change the direction
		       
		   }  
		   else if(dir==1){
		       for(int i=top;i<=bottom;i++)
		            result.add(a.get(i).get(right));
		      
		        right--;
		        dir=2;
		       
		   }
		   else if (dir==2){
		       for(int i=right;i>=left;i--)
		            result.add(a.get(bottom).get(i));
		       
		       bottom--;
		       dir=3;
		       
		   }
		   else if (dir==3){
		        for(int i=bottom;i>=top;i--)
		            result.add(a.get(i).get(left));
		       
		       left++;
		       dir=0;
		   }
		 
		 } //while ends   
		 
		 
		 
		 // Populate result;
		 return result;
	}

}
