/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161104.lemurdatabase;

/**
 *
 * @author evzha0751
 */
public class TreeLemur extends Lemur{
    private int ageNum,genderNum,ColorNum;
    private double weightNum;
    private String output,gender,color;
    
    public void Age(){
        ageNum = (int)(Math.random()*15);
    }
    
    public void Weight(){
        weightNum = Math.random()*5;
    }
    
    public void Gender(){
        genderNum = (int)(Math.random()*2+1);
        if(genderNum == 1){
            gender="Male";
        }else{
            gender="Female";
        }
    }
    
    public String toString(){
        return(output);
    }
}
