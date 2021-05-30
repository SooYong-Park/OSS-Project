import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Name extends JFrame {
	JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, al, hi, mid, low;
	TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
	Info i = new Info();
	static String b = null;
	static String[] Alname = new String[1000];
	static String[] Hiname = new String[1000];
	static String[] Lowname = new String[1000];
	static String[] Alsumry = new String[1000];
	static String[] Hisumry = new String[1000];
	static String[] Lowsumry = new String[1000];
	static String[] Allevel = new String[1000];
	static String[] Hilevel = new String[1000];
	static String[] Lowlevel = new String[1000];

	public void name() {
		JPanel p = new JPanel();
		p.setLayout(null);
		Label t1 = new Label("요리를 선택해주세요");
		add(t1);
		Label t2 = new Label("난이도 선택");
		add(t2);

		
		Label n1 = new Label("음식명");
		add(n1);
		Label n2 = new Label("음식명");
		add(n2);
		Label n3 = new Label("음식명");
		add(n3);
		Label n4 = new Label("음식명");
		add(n4);
		Label n5 = new Label("음식명");
		add(n5);
		Label n6 = new Label("음식명");
		add(n6);
		Label n7 = new Label("음식명");
		add(n7);
		Label n8 = new Label("음식명");
		add(n8);
		Label n9 = new Label("음식명");
		add(n9);
		Label n10 = new Label("음식명");
		add(n10);
		
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
		b2 = new TextField();
		add(b2);
		b3 = new TextField();
		add(b3);
		b4 = new TextField();
		add(b4);
		b5 = new TextField();
		add(b5);
		b6 = new TextField();
		add(b6);
		b7 = new TextField();
		add(b7);
		b8 = new TextField();
		add(b8);
		b9 = new TextField();
		add(b9);
		b10 = new TextField();
		add(b10);

		c1 = new JButton("1번");
		add(c1);
		c2 = new JButton("2번");
		add(c2);
		c3 = new JButton("3번");
		add(c3);
		c4 = new JButton("4번");
		add(c4);
		c5 = new JButton("5번");
		add(c5);
		c6 = new JButton("6번");
		add(c6);
		c7 = new JButton("7번");
		add(c7);
		c8 = new JButton("8번");
		add(c8);
		c9 = new JButton("9번");
		add(c9);
		c10 = new JButton("10번");
		add(c10);
		hi = new JButton("어려움");
		add(hi);
		low = new JButton("초보환영");
		add(low);
		al = new JButton("겹침");
		add(al);

		t1.setBounds(400, 5, 200, 40);
		t2.setBounds(700, 560, 80, 40);
		
		n1.setBounds(10, 80, 60, 30);
		n2.setBounds(10, 120, 60, 30);
		n3.setBounds(10, 160, 60, 30);
		n4.setBounds(10, 200, 60, 30);
		n5.setBounds(10, 240, 60, 30);
		n6.setBounds(10, 280, 60, 30);
		n7.setBounds(10, 320, 60, 30);
		n8.setBounds(10, 360, 60, 30);
		n9.setBounds(10, 400, 60, 30);
		n10.setBounds(10, 440, 60, 30);

		a1.setBounds(80, 80, 130, 30);
		a2.setBounds(80, 120, 130, 30);
		a3.setBounds(80, 160, 130, 30);
		a4.setBounds(80, 200, 130, 30);
		a5.setBounds(80, 240, 130, 30);
		a6.setBounds(80, 280, 130, 30);
		a7.setBounds(80, 320, 130, 30);
		a8.setBounds(80, 360, 130, 30);
		a9.setBounds(80, 400, 130, 30);
		a10.setBounds(80, 440, 130, 30);
		
		b1.setBounds(220, 80, 550, 30);
		b2.setBounds(220, 120, 550, 30);
		b3.setBounds(220, 160, 550, 30);
		b4.setBounds(220, 200, 550, 30);
		b5.setBounds(220, 240, 550, 30);
		b6.setBounds(220, 280, 550, 30);
		b7.setBounds(220, 320, 550, 30);
		b8.setBounds(220, 360, 550, 30);
		b9.setBounds(220, 400, 550, 30);
		b10.setBounds(220, 440, 550, 30);

		c1.setBounds(800, 80, 60, 30);
		c2.setBounds(800, 120, 60, 30);
		c3.setBounds(800, 160, 60, 30);
		c4.setBounds(800, 200, 60, 30);
		c5.setBounds(800, 240, 60, 30);
		c6.setBounds(800, 280, 60, 30);
		c7.setBounds(800, 320, 60, 30);
		c8.setBounds(800, 360, 60, 30);
		c9.setBounds(800, 400, 60, 30);
		c10.setBounds(800, 440, 60, 30);

		hi.setBounds(800, 520, 100, 30);
		low.setBounds(800, 600, 100, 30);
		al.setBounds(80, 520, 100, 120);

		add(p);
		setSize(1000, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("요리 선택 화면");
		setVisible(true);

		al.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent t) {

				try {
					b1.setText("간략 소개 : " + Alsumry[0] + " 난이도 : " + Allevel[0]);
					b2.setText("간략 소개 : " + Alsumry[1] + " 난이도 : " + Allevel[1]);
					b3.setText(" 간략 소개 : " + Alsumry[2] + " 난이도 : " + Allevel[2]);
					b4.setText(" 간략 소개 : " + Alsumry[3] + " 난이도 : " + Allevel[3]);
					b5.setText(" 간략 소개 : " + Alsumry[4] + " 난이도 : " + Allevel[4]);
					b6.setText(" 간략 소개 : " + Alsumry[5] + " 난이도 : " + Allevel[5]);
					b7.setText(" 간략 소개 : " + Alsumry[6] + " 난이도 : " + Allevel[6]);
					b8.setText(" 간략 소개 : " + Alsumry[7] + " 난이도 : " + Allevel[7]);
					b9.setText(" 간략 소개 : " + Alsumry[8] + " 난이도 : " + Allevel[8]);
					b10.setText(" 간략 소개 : " + Alsumry[9] + " 난이도 : " + Allevel[9]);
					a1.setText(Alname[0]);
					a2.setText(Alname[1]);
					a3.setText(Alname[2]);
					a4.setText(Alname[3]);
					a5.setText(Alname[4]);
					a6.setText(Alname[5]);
					a7.setText(Alname[6]);
					a8.setText(Alname[7]);
					a9.setText(Alname[8]);
					a10.setText(Alname[9]);
				} catch (Exception ex) {
					System.out.println("error");
				}
			}
		});
		hi.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent t) {

				try {
					b1.setText(" 간략 소개 : " + Hisumry[0] + " 난이도 : " + Hilevel[0]);
					b2.setText(" 간략 소개 : " + Hisumry[1] + " 난이도 : " + Hilevel[1]);
					b3.setText(" 간략 소개 : " + Hisumry[2] + " 난이도 : " + Hilevel[2]);
					b4.setText(" 간략 소개 : " + Hisumry[3] + " 난이도 : " + Hilevel[3]);
					b5.setText(" 간략 소개 : " + Hisumry[4] + " 난이도 : " + Hilevel[4]);
					b6.setText(" 간략 소개 : " + Hisumry[5] + " 난이도 : " + Hilevel[5]);
					b7.setText(" 간략 소개 : " + Hisumry[6] + " 난이도 : " + Hilevel[6]);
					b8.setText(" 간략 소개 : " + Hisumry[7] + " 난이도 : " + Hilevel[7]);
					b9.setText(" 간략 소개 : " + Hisumry[8] + " 난이도 : " + Hilevel[8]);
					b10.setText(" 간략 소개 : " + Hisumry[9] + " 난이도 : " + Hilevel[9]);
					a1.setText(Hiname[0]);
					a2.setText(Hiname[1]);
					a3.setText(Hiname[2]);
					a4.setText(Hiname[3]);
					a5.setText(Hiname[4]);
					a6.setText(Hiname[5]);
					a7.setText(Hiname[6]);
					a8.setText(Hiname[7]);
					a9.setText(Hiname[8]);
					a10.setText(Hiname[9]);
				} catch (Exception ex) {
					System.out.println("error");
				}
			}
		});
		low.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent t) {
				
				try {
					b1.setText(" 간략 소개 : " + Lowsumry[0] + " 난이도 : " + Lowlevel[0]);
					b2.setText(" 간략 소개 : " + Lowsumry[1] + " 난이도 : " + Lowlevel[1]);
					b3.setText(" 간략 소개 : " + Lowsumry[2] + " 난이도 : " + Lowlevel[2]);
					b4.setText(" 간략 소개 : " + Lowsumry[3] + " 난이도 : " + Lowlevel[3]);
					b5.setText(" 간략 소개 : " + Lowsumry[4] + " 난이도 : " + Lowlevel[4]);
					b6.setText(" 간략 소개 : " + Lowsumry[5] + " 난이도 : " + Lowlevel[5]);
					b7.setText(" 간략 소개 : " + Lowsumry[6] + " 난이도 : " + Lowlevel[6]);
					b8.setText(" 간략 소개 : " + Lowsumry[7] + " 난이도 : " + Lowlevel[7]);
					b9.setText(" 간략 소개 : " + Lowsumry[8] + " 난이도 : " + Lowlevel[8]);
					b10.setText(" 간략 소개 : " + Lowsumry[9] + " 난이도 : " + Lowlevel[9]);
					a1.setText(Lowname[0]);
					a2.setText(Lowname[1]);
					a3.setText(Lowname[2]);
					a4.setText(Lowname[3]);
					a5.setText(Lowname[4]);
					a6.setText(Lowname[5]);
					a7.setText(Lowname[6]);
					a8.setText(Lowname[7]);
					a9.setText(Lowname[8]);
					a10.setText(Lowname[9]);
				} catch (Exception ex) {
					System.out.println("error");
				}
			}
		});
		Recipe r = new Recipe();
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//a1.getText();
					r.inputRcp(Alname[0]);
					
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
	}

	public String[] getAlname() {
		return Alname;
	}

	public void setAlname(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Alname[i] = a[i];
		}
	}
	public String[] getAlsumry() {
		return Alsumry;
	}

	public void setAlsumry(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Alsumry[i] = a[i];
		}
	}
	public String[] getAllevel() {
		return Allevel;
	}

	public void setAllevel(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Allevel[i] = a[i];
		}
	}
	public String[] getHiname() {
		return Hiname;
	}

	public void setHiname(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Hiname[i] = a[i];
		}
	}
	public String[] getHisumry() {
		return Hisumry;
	}

	public void setHisumry(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Hisumry[i] = a[i];
		}
	}
	public String[] getHilevel() {
		return Hilevel;
	}

	public void setHilevel(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Hilevel[i] = a[i];
		}
	}
	public String[] getLowname() {
		return Lowname;
	}

	public void setLowname(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Lowname[i] = a[i];
		}
	}
	public String[] getLowsumry() {
		return Lowsumry;
	}

	public void setLowsumry(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Lowsumry[i] = a[i];
		}
	}
	public String[] getLowlevel() {
		return Lowlevel;
	}

	public void setLowlevel(String a[]) {
		for (int i = 0; i < 1000; i++) {
			this.Lowlevel[i] = a[i];
		}
	}
}