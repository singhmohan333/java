// GUI AND J FRAME
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


class GuiFrame extends JFrame{
	JLabel item1;

	GuiFrame(){
		super("the title bar");
		setLayout(new FlowLayout());

		item1 = new JLabel("my gui frame for java");
		item1.setToolTipText("pop up message for gui using");
		add(item1);
	}	
}
class GuiFrame2{
	public static void main(String arg[])
	{
		GuiFrame obj = new GuiFrame();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(300,130);
		obj.setVisible(true);
	}
	
}

