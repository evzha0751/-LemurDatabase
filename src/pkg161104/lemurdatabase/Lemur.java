/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161104.lemurdatabase;


public abstract class Lemur extends Mammal{
    private int ageNum,genderNum,ColorNum;
    private double weightNum;
    private String output,gender,color;
    
    public Lemur(){
    super();
}
    
    public void Age(){
        ageNum = (int)(Math.random()*15);
        output=output+"\nAge = "+ageNum;
    }
    
    public void Weight(){
        weightNum = Math.random()*5;
        output=output+"\nWeight = "+weightNum;
    }
    
    public void Gender(){
        genderNum = (int)(Math.random()*2+1);
        if(genderNum == 1){
            output=output+"\nGender = Male";
        }else{
            output=output+"\nGender = Female";
        }
    }
    
}
