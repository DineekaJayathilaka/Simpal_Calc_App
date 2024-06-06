import javax.swing.JOptionPane;

public class simpleCalv9{
    public static void main (String []args){
        while(true){
             String opdata = JOptionPane.showInputDialog(null,"Select Operation"+"\n"+"\n"+
                                           "1 for Addition(+)" + "\n" +
                                           "2 for Subtraction(-)" + "\n" +
                                           "3 for Multipication(*)" + "\n" +
                                           "4 for Divide(/)");


        int op = Integer.parseInt(opdata);

        String num1 = JOptionPane.showInputDialog(null,"Enter Number1");
        String num2 = JOptionPane.showInputDialog(null,"Enter Number2");



        double ans = 0.0;

        calFuntion4 fun = new calFuntion4();
        

        if (op == (1)){
              fun.getsum(num1,num2);
        }
        if (op == (2)){
              fun.getsub(num1,num2);
        
        }
        if (op == (3)){
               fun.getmultipication(num1,num2);
        }
        if (op == (4)){
               fun.getdivide(num1,num2);
        }

        
    }
}

}
       