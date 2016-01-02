
package business;

import java.util.ArrayList;

/**
 * @author Cristopher Ontiveros
 */
public class Bin2Dec {
    private String binval, result;
    private String emsg;
    private ArrayList<String> resultsteps;
    
    
    
    
    public Bin2Dec(String binval){
        //constructor
        this.binval = binval;
        this.result = "";
        this.resultsteps = new ArrayList<>();
        this.emsg = "";
        if (!isValid()){
            this.emsg = this.binval + " is not a binary Value";
        } else{
           convert();
        }
    } //end of constructor
    private boolean isValid(){
        for(int i=0; i < this.binval.length(); i++){
            if(this.binval.charAt(i) != '0' && this.binval.charAt(i) != '1'){
                return false;
            }
        }//end of for
        return true;
    }//end of isvalid
    
    private void convert(){
        long r=0;
        String reverse = new StringBuilder(this.binval).reverse().toString();
        
        for(int i=0; i < reverse.length(); i++){
            if (reverse.charAt(i) == '1'){
                long f = (long)Math.pow(2,i);
                r +=f;
                resultsteps.add("There is a(n) " + f + " in the number (2^" + i + ").");
            }
        }
        this.result = String.valueOf(r);
    }
    public String getErrorMsg(){
        return this.emsg;
    }
    public String getResult(){
        return this.result;
    }
    public ArrayList<String> getResultSteps(){
        return this.resultsteps;
    }
    
    
    
    
}
