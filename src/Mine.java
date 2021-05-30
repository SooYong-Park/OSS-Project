import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Mine extends JFrame{
	TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
	TextField b1,c1,d1;
	
	 public void mine() {
		 JPanel p = new JPanel();
			p.setLayout(null);
		 Label n1 = new Label("요리명");
			add(n1);
			Label n2 = new Label("간략소개");
			add(n2);
			Label n3 = new Label("요리재료");
			add(n3);
			
			Label t1= new Label("순서1");
			add(t1);
			Label t2= new Label("순서2");
			add(t2);
			Label t3= new Label("순서3");
			add(t3);
			Label t4= new Label("순서4");
			add(t4);
			Label t5= new Label("순서5");
			add(t5);
			Label t6= new Label("순서6");
			add(t6);
			Label t7= new Label("순서7");
			add(t7);
			Label t8= new Label("순서8");
			add(t8);
			Label t9= new Label("순서9");
			add(t9);
			Label t10= new Label("순서10");
			add(t10);
			
			a1 = new TextField();
			add(a1);
			a2 = new TextField();
			add(a2);
			a3 = new TextField();
			add(a3);
			a4 = new TextField();
			add(a4);
			a5 = new TextField();
			add(a5);
			a6 = new TextField();
			add(a6);
			a7 = new TextField();
			add(a7);
			a8 = new TextField();
			add(a8);
			a9 = new TextField();
			add(a9);
			a10 = new TextField();
			add(a10);

			
			b1 = new TextField();
			add(b1);
			
			c1 = new TextField();
			add(c1);
			
			
			
			n1.setBounds(400, 10, 150, 30);
			n2.setBounds(10, 40, 80, 30);
			n3.setBounds(10, 80, 80, 30);
			
			b1.setBounds(100, 40, 400, 30);			
			c1.setBounds(100, 80, 800, 30);			

			t1.setBounds(10, 150, 80, 30);
			t2.setBounds(10, 200, 80, 30);
			t3.setBounds(10, 250, 80, 30);
			t4.setBounds(10, 300, 80, 30);
			t5.setBounds(10, 350, 80, 30);
			t6.setBounds(10, 400, 80, 30);
			t7.setBounds(10, 450, 80, 30);
			t8.setBounds(10, 500, 80, 30);
			t9.setBounds(10, 550, 80, 30);
			t10.setBounds(10, 600, 80, 30);
			
			
			a1.setBounds(100, 150, 800, 30);
			a2.setBounds(100, 200, 800, 30);
			a3.setBounds(100, 250, 800, 30);
			a4.setBounds(100, 300, 800, 30);
			a5.setBounds(100, 350, 800, 30);
			a6.setBounds(100, 400, 800, 30);
			a7.setBounds(100, 450, 800, 30);
			a8.setBounds(100, 500, 800, 30);
			a9.setBounds(100, 550, 800, 30);
			a10.setBounds(100, 600, 800, 30);
			
			
			add(p);
			setSize(1000, 700);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setTitle("찜한 요리");
			setVisible(true);
	 }
}
 