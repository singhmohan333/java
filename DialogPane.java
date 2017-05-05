import javax.swing.*;

class  DialogPane{
	public static void main(String arg[]){

	 String fn = JOptionPane.showInputDailog("Enter First Number");
	 String sn = JOptionPane.showInputDailog("Enter second Number");

	 int n1 = Integer.parseInt(fn);
	 int n2 = Integer.parseInt(sn);

	 int sum = n1 + n2 ;

	 JOptionPane.showMessageDialog(null, "The Answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
	}
}