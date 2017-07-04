//GUI  USING SWING JOption for message box


import javax.swing.JOptionPane;

class Gui{
	public static void main(String arg[]){



	String fn = JOptionPane.showInputDialog("enter first number");
    String sn = JOptionPane.showInputDialog("enter second number");
	String tn = JOptionPane.showInputDialog("enter third number");

	int num1 = Integer.parseInt(fn);
	int num2 = Integer.parseInt(sn);
	int num3 = Integer.parseInt(tn);

	int sum = num1 + num2 + num3;

	JOptionPane.showMessageDialog(null , "the sum is " + sum, "RESULT", JOptionPane.PLAIN_MESSAGE);
		}
} 