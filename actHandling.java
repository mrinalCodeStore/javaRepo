import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class actHandling extends JFrame implements Actionlistener{

	public static void main(String args[]){

		new actHandling();
	}

	 JButton 	btn;

	public actHandling(){

		super("EVENT HANDLING");
		btn = new JButton("press this button");
		btn.setSize(20,100);


		this.add(btn);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(400,400);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


}