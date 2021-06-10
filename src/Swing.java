import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.List;

import javax.swing.*;

public class Swing extends JFrame {

	int cnt;
	static String a, b, c, d, e;
	JButton c1, c2, c3, c4, c5, in, re;
	TextField b1, b2, b3, b4, b5;
	Name n = new Name();

	public void recipe() {
		Recipe r = new Recipe();
		JPanel p = new JPanel();
		p.setLayout(null);
		Label t1 = new Label("재료의 갯수를 클릭해주세요");
		add(t1);
		Label t2 = new Label("재료는 5개까지 입력가능합니다");
		add(t2);

		Label r1 = new Label("재료1:");
		add(r1);
		Label r2 = new Label("재료2:");
		add(r2);
		Label r3 = new Label("재료3:");
		add(r3);
		Label r4 = new Label("재료4:");
		add(r4);
		Label r5 = new Label("재료5:");
		add(r5);

		b1 = new TextField();
		add(b1);
		b2 = new TextField();
		add(b2);
		b3 = new TextField();
		add(b3);
		b4 = new TextField();
		add(b4);
		b5 = new TextField();
		add(b5);

		in = new JButton("입력");
		add(in);

		c1 = new JButton("1");
		add(c1);
		c2 = new JButton("2");
		add(c2);
		c3 = new JButton("3");
		add(c3);
		c4 = new JButton("4");
		add(c4);
		c5 = new JButton("5");
		add(c5);
		re = new JButton("갯수 재입력");
		add(re);

		t1.setBounds(180, 5, 200, 40);
		t2.setBounds(180, 35, 280, 40);

		r1.setBounds(40, 160, 40, 40);
		r2.setBounds(40, 200, 40, 40);
		r3.setBounds(40, 240, 60, 40);
		r4.setBounds(40, 280, 60, 40);
		r5.setBounds(40, 320, 60, 40);

		b1.setBounds(150, 160, 200, 30);
		b2.setBounds(150, 200, 200, 30);
		b3.setBounds(150, 240, 200, 30);
		b4.setBounds(150, 280, 200, 30);
		b5.setBounds(150, 320, 200, 30);

		in.setBounds(380, 225, 120, 110);

		c1.setBounds(120, 80, 50, 50);
		c2.setBounds(180, 80, 50, 50);
		c3.setBounds(240, 80, 50, 50);
		c4.setBounds(300, 80, 50, 50);
		c5.setBounds(360, 80, 50, 50);
		re.setBounds(440, 80, 120, 50);

		add(p);
		setSize(600, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("재료 선택 화면");
		setVisible(true);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cnt = 1;
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cnt = 2;
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cnt = 3;
					b4.setEnabled(false);
					b5.setEnabled(false);
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cnt = 4;
					b5.setEnabled(false);
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cnt = 5;
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					b1.setEnabled(true);
					b2.setEnabled(true);
					b3.setEnabled(true);
					b4.setEnabled(true);
					b5.setEnabled(true);
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});

		in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent t) {
				String[] list = new String[5];
				try {
					list[0] = b1.getText();
					list[1] = b2.getText();
					list[2] = b3.getText();
					list[3] = b4.getText();
					list[4] = b5.getText();
					Recipe.R(cnt, list);
					n.name();
				} catch (Exception ex) {
					System.out.println("error");
				}
			}
		});

	}
}