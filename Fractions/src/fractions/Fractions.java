
package fractions;




public class Fractions {

    public static void main(String[] args) {
        
        System.out.println(fractionMaker(0.1625));
        
    }
    
    public static String fractionMaker (double decimal){
        double dinput = decimal;
        String seperator = String.valueOf(decimal);
        //System.out.println(seperator);
        
        
        String[] decimalsplit = seperator.split("\\.");
        //System.out.println(decimalsplit[0]);
        int dnom = 1;
        
        
        
        //System.out.println(decimalsplit[1]);
        for (int i = 0; i < decimalsplit[1].length() ; i++) {
        
            dinput = dinput*10;
            dnom = dnom*10;
            
            ////////
            //System.out.println(dinput + "/" + dnom);
        }
        
        dinput = Math.round(dinput);
        int output = (int) dinput;
        
        /////////
        //System.out.println(output + "/" + dnom);
        
        while ((output % 2 == 0 && dnom % 2 ==0) || (output % 5 == 0 && dnom % 5 == 0)){
            
            
            if (output % 2 == 0 && dnom % 2 ==0){
                output = output/2;
                dnom = dnom/2;
            /////////
            //System.out.println(output + "/" + dnom);    
            }
            if (output % 5 == 0 && dnom % 5 ==0){
                output =output/5;
                dnom = dnom/5;
            /////////
            //System.out.println(output + "/" + dnom);    
            }
            
        }
        return output + "/" + dnom;
        
    }
    
}
