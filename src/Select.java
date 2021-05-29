import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Select extends JFrame{

	public void sel() {
		JPanel p = new JPanel();
	      p.setLayout(null);
	      
	        add(p);
			setSize(1000, 700);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setTitle("찜한 요리 목록");
			setVisible(true);
	}
}