

package kata4;

import java.util.HashMap;
import java.util.Map;
import view.*;
import model.*;


public class Kata4 {

   
    public static void main(String[] args) {
        
        
        MailListReader correos = new MailListReader();
        MailHistogramBuilder histogramBuilder = new MailHistogramBuilder();
        
        
        new HistogramDisplay(histogramBuilder.builder(correos.read("./email.txt"))).execute();
        
    }
    
}
