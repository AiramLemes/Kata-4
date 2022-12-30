

package kata4;

import java.util.HashMap;
import java.util.Map;
import view.*;
import model.*;


public class Kata4 {

   
    public static void main(String[] args) {
        execute();
    }
    
    
    public static void execute() {  
        output();
    }
    
    
    
    public static MailListReader input() {
        
        MailListReader correos = new MailListReader();
        return correos;        
    }
    
    
    public static MailHistogramBuilder process() {
        
        MailHistogramBuilder histogramBuilder = new MailHistogramBuilder();
        return histogramBuilder;
    
    }

    
    
    public static void output() {
        new HistogramDisplay(process().builder(input().read("./email.txt"))).execute();
    }
    
}
