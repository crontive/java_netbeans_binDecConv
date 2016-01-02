
package business;

import java.util.ArrayList;

/**
 *
 * @author Cristopher Ontiveros
 */
public class Dec2Bin {
    String result, emsg, decval;
    ArrayList<String> resultsteps;
    
    public Dec2Bin(String dv){
        this.decval = dv;
        this.emsg = "";
        this.result = "";
        resultsteps = new ArrayList<>();
        try {
            long n = Long.parseLong(this.decval);
            if (n <= 0){
                throw new NumberFormatException("non-positive value");
            }
            ConvertByRecursion(n);
            
        }catch (Exception e){
            emsg = this.decval + " is illegal: " + e.getMessage();
        }
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
    private void ConvertByRecursion(long n){
       if (n > 0) {
           ConvertByRecursion(n/2);
           this.result += ""+n%2;
          resultsteps.add(n + " divided by 2 = " + (n/2) + " w/ remainder of: " + (n%2));
          
         
             
   }   
       
          
   
       
    
    }
    
    
    
    
}
