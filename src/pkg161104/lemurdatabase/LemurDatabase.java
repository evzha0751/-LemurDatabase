/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161104.lemurdatabase;

import java.util.*;

/**
 *
 * @author evzha0751
 */
public class LemurDatabase {

    public static void main(String[] args) {
        int numberOfLemur,typeOfLemur,check;
        Mammal mammal[];
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        
        System.out.println("How many Lemus do you want to add to the list:");
        numberOfLemur=input.nextInt();
        
        System.out.println("Please enter the type of Lumer to add:"
                + "\n1 - Tree Lemur"
                + "\n2 - Desert Lemur"
                + "\n3 - Jungle Lemur");
        
        for(int i=1;i<=numberOfLemur;i++){
            System.out.print("Lemur No."+i+" : ");
            typeOfLemur = input.nextInt();
            list.add(typeOfLemur);
        }
        
        
        for(int i=0;i<numberOfLemur;i++){
            check=list.get(i);
            if(check==1){
                
            }else if(check==2){
                
            }else if(check==3){
                
            }
        }
        
        
    }
    
}
