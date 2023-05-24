//
//import javax.swing.JOptionPane;
//public class SuperPower {
//
//	public static void main(String[] args) {
////	System.out.println("SUPER POWERS TO THE RESCUE!");
////  JOptionPane.showMessageDialog(null, "SUPER POWERS ON THE RESCUE!");
////  JOptionPane.showMessageDialog(null, "What is your super power?");
//	String power = JOptionPane.showInputDialog(null, " What is your super power?");
//	/*JOptionPane.showMessageDialog(null,  "TO THE RESCUE!");*/ /*The syntax error i commited*/
////	JOptionPane.showInputDialog("What is your super power?");
//	JOptionPane.showMessageDialog(null, power.toUpperCase()+ " TO THE RESCUE!");
//	power = power.toUpperCase();
////	System.out.println(power); /*Testing*/
//}
//}

//Finished Syntax free Work Submission

import javax.swing.JOptionPane;

public class SuperPower {
    public static void main(String[] args) {
        String power = JOptionPane.showInputDialog(null, "What is your super power?");
        JOptionPane.showMessageDialog(null, power.toUpperCase() + " TO THE RESCUE!");
        
    }
}

