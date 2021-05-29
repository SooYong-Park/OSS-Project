import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Prod extends JFrame{

	public void prod() {
		JPanel p = new JPanel();
	      p.setLayout(null);
	      
	        add(p);
			setSize(1000, 700);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setTitle("창작요리");
			setVisible(true);
	}
}
