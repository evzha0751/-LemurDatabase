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
    private int ageNum,genderNum;
    private double weightNum;
    private String output,gender;
    
    /**
     * constructor
     * pre: none
     * post: none
     */
    public TreeLemur(){
        super();
    }
    
    /**
     * Get a random number to be the age of lemur
     * pre: none
     * post: the random number of age
     */
    public void Age(){
        ageNum = (int)(Math.random()*15);
    }
    
    /**
     * Get a random number to be the weight of lemur
     * pre: none
     * post: the random number of weight
     */
    public void Weight(){
        weightNum = Math.random()*5;
    }
    
    /**
     * Get the gender of lemur
     * pre: none
     * post: the gender of lemur, a string that is "Male" or "Female"; 
     */
    public void Gender(){
        genderNum = (int)(Math.random()*2+1);
        if(genderNum == 1){
            gender="Male";
        }else{
            gender="Female";
        }
    }
    
    /**
     * Get a string to be displayed and return
     * pre: none
     * post: the string of the lemur 's information;
     * @return 
     */
    public String toString(){
        output="Tree Lrmur:"
                + "\nAge = "+ageNum
                +"\nWeight = "+weightNum
                +"\nGender = "+gender
                +"\nLocation = Madagascar"
                + "\nClassification = Prosimian"
                + "\nCoat = Fur"
                + "\nFood = Fruit"
                + "\nColour = Red"
                + "\nPAck Size = Large groups";
        return(output);
    }
}
