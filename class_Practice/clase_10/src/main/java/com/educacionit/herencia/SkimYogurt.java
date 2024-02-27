package com.educacionit.herencia;

public class SkimYogurt extends Yogurt{
    public SkimYogurt(){
        super();
    }
    
    
    ///Reescritura 
    @Override   
    public float getCalories() {
        /*
            float result = super.getCalories()/2;
            return result;
         */
        return super.getCalories()/2;   //si calories esta protected, se puede usar return calories/2;
    }

    ///sobrecarga de método.
    /*
    public float getCalories(float sk) {
       return super.getCalories()/2; 
    }
    */

}
