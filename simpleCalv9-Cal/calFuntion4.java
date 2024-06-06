
import javax.swing.JOptionPane;

public class calFuntion4{
    public  void getsum(String value1, String value2 ){

        double n1 = Double.parseDouble(value1);
        double n2 = Double.parseDouble(value2);
        double ans = n1+n2;
        

        JOptionPane.showMessageDialog(null,"Answer is :"+Math.round(ans));

        
    }

    public  void getsub(String value1,String value2){

        double n1 = Double.parseDouble(value1);
        double n2 = Double.parseDouble(value2);
        double ans = n1-n2;
        

        JOptionPane.showMessageDialog(null,"Answer is :"+Math.round(ans));

        
    }

    public  void getmultipication(String value1,String value2){

        double n1 = Double.parseDouble(value1);
        double n2 = Double.parseDouble(value2);
        double ans = n1*n2;
       
        JOptionPane.showMessageDialog(null,"Answer is :"+Math.round(ans));
         
    }
    public  void getdivide(String value1,String value2){

        double n1 = Double.parseDouble(value1);
        double n2 = Double.parseDouble(value2);
        double ans = n1/n2;
       

        JOptionPane.showMessageDialog(null,"Answer is :"+Math.round(ans));
         
    }
}            