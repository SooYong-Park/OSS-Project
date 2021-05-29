import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FirstSwing extends JFrame{
	Swing s = new Swing();
	Prod pr = new Prod();
	Select se = new Select();
	JButton c1,c2,c3;
	public void first() {
		  JPanel p = new JPanel();
	      p.setLayout(null);
	      
	        c1 = new JButton("내가 만든 창작요리");
		  	add(c1);
			c2 = new JButton("재료 입력");
			add(c2);
			c3 = new JButton("찜한 요리 목록");
			add(c3);
			
			c1.setBounds(20, 40, 150, 150);
			c2.setBounds(180, 40, 150, 150);
			c3.setBounds(340, 40, 150, 150);
			
			add(p);
			setSize(530, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("기능 선택 화면");
			setVisible(true);
			
			
			c1.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
				   	try{
				   	pr.prod();
				   			}	
				   	catch (Exception ex){
				   	 System.out.println("오류");
				   	}
				   		}
				   	});
			
			c2.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
				   	try{
				   	s.recipe();
				   			}	
				   	catch (Exception ex){
				   	 System.out.println("오류");
				   	}
				   		}
				   	});
			
			c3.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
				   	try{
				   	se.sel();
				   			}	
				   	catch (Exception ex){
				   	 System.out.println("오류");
				   	}
				   		}
				   	});
	}

}
