import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Select extends JFrame {
	TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
	static String FoodName[] = new String[10];
	static String FoodInformation[] = new String[10];
	static String Foodlevel[] = new String[10];
	static String FoodIngredient[] = new String[10];
	static String FoodProcess[][] = new String[10][10];
	static String FoodProcess1[] = new String[10];
	static String Id;
	public void getId(String a) {
		Id = a;
	}
	MyFood mf = new MyFood();
	MyFoodInfo mfi = new MyFoodInfo();
	
	public void sel() {
		mf.MyFoodRead(Id,FoodName,FoodInformation,Foodlevel,FoodIngredient,FoodProcess);
	
		JPanel p = new JPanel();
		p.setLayout(null);
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
		
		b1.setText(FoodName[0]);
		b2.setText(FoodName[1]);
		b3.setText(FoodName[2]);
		b4.setText(FoodName[3]);
		b5.setText(FoodName[4]);
		b6.setText(FoodName[5]);
		b7.setText(FoodName[6]);
		b8.setText(FoodName[7]);
		b9.setText(FoodName[8]);
		b10.setText(FoodName[9]);
		
		c1 = new JButton("선택");
		add(c1);
		c2 = new JButton("선택");
		add(c2);
		c3 = new JButton("선택");
		add(c3);
		c4 = new JButton("선택");
		add(c4);
		c5 = new JButton("선택");
		add(c5);
		c6 = new JButton("선택");
		add(c6);
		c7 = new JButton("선택");
		add(c7);
		c8 = new JButton("선택");
		add(c8);
		c9 = new JButton("선택");
		add(c9);
		c10 = new JButton("선택");
		add(c10);

		b1.setBounds(50, 80, 220, 30);
		b2.setBounds(50, 120, 220, 30);
		b3.setBounds(50, 160, 220, 30);
		b4.setBounds(50, 200, 220, 30);
		b5.setBounds(50, 240, 220, 30);
		b6.setBounds(50, 280, 220, 30);
		b7.setBounds(50, 320, 220, 30);
		b8.setBounds(50, 360, 220, 30);
		b9.setBounds(50, 400, 220, 30);
		b10.setBounds(50, 440, 220, 30);

		c1.setBounds(300, 80, 60, 30);
		c2.setBounds(300, 120, 60, 30);
		c3.setBounds(300, 160, 60, 30);
		c4.setBounds(300, 200, 60, 30);
		c5.setBounds(300, 240, 60, 30);
		c6.setBounds(300, 280, 60, 30);
		c7.setBounds(300, 320, 60, 30);
		c8.setBounds(300, 360, 60, 30);
		c9.setBounds(300, 400, 60, 30);
		c10.setBounds(300, 440, 60, 30);

		add(p);
		setSize(500, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("찜한 요리 목록");
		setVisible(true);

		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[0][i];
					}
					mfi.setRd(FoodIngredient[0]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[1][i];
					}
					mfi.setRd(FoodIngredient[1]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[2][i];
					}
					mfi.setRd(FoodIngredient[2]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[3][i];
					}
					mfi.setRd(FoodIngredient[3]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[4][i];
					}
					mfi.setRd(FoodIngredient[4]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[5][i];
					}
					mfi.setRd(FoodIngredient[5]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[6][i];
					}
					mfi.setRd(FoodIngredient[6]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[7][i];
					}
					mfi.setRd(FoodIngredient[7]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[8][i];
					}
					mfi.setRd(FoodIngredient[8]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
		c10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					for (int i = 0; i < 10; i++) {
						FoodProcess1[i] = FoodProcess[9][i];
					}
					mfi.setRd(FoodIngredient[9]);
					mfi.setDc(FoodProcess1);
					mfi.info();
				} catch (Exception ex) {
					System.out.println("오류");
				}
			}
		});
	}
}