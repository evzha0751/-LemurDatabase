/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161104.lemurdatabase;

/**
 * Lemur Class
 */
public abstract class Lemur extends Mammal{
    
    /**
     * 
     */
    public Lemur(){
    super();
}
    
    public abstract void Age();
    
    public abstract void Weight();
    
    public abstract void Gender();
    
    public abstract String toString();
    
}
