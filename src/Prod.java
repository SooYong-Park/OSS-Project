import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Prod extends JFrame {

   //static String[] recipeName = new String[20];
   //static String[] recipeAmount = new String[20];
   int rcpcnt;
   int procnt;

   JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, in, re;
   TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
   TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;

   TextField z1, z2, z3, z4, z5, z6, z7, z8, z9, z10;
   JButton x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, xre;

   TextField n1, n2, n3;
   MyFood mf = new MyFood();

   public void prod() {

      JPanel p = new JPanel();
      p.setLayout(null);

      Label t1 = new Label("음식이름");
      add(t1);
      Label t2 = new Label("간단소개");
      add(t2);
      Label t3 = new Label("난이도");
      add(t3);
      Label t4 = new Label("재료의 갯수를 선택하세요");
      add(t4);
      Label t5 = new Label("요리 순서의 갯수를 선택하세요");
      add(t5);

      /////////////////////////////////// 요리 재료 선택
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
      Label r6 = new Label("재료6:");
      add(r6);
      Label r7 = new Label("재료7:");
      add(r7);
      Label r8 = new Label("재료8:");
      add(r8);
      Label r9 = new Label("재료9:");
      add(r9);
      Label r10 = new Label("재료10:");
      add(r10);
      Label r11 = new Label("재료11:");
      add(r11);
      Label r12 = new Label("재료12:");
      add(r12);
      Label r13 = new Label("재료13:");
      add(r13);
      Label r14 = new Label("재료14:");
      add(r14);
      Label r15 = new Label("재료15:");
      add(r15);
      Label r16 = new Label("재료16:");
      add(r16);
      Label r17 = new Label("재료17:");
      add(r17);
      Label r18 = new Label("재료18:");
      add(r18);
      Label r19 = new Label("재료19:");
      add(r19);
      Label r20 = new Label("재료20:");
      add(r20);

      n1 = new TextField();
      add(n1);
      n2 = new TextField();
      add(n2);
      n3 = new TextField();
      add(n3);

      
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
      
      b11 = new TextField();
      add(b11);
      
      b12 = new TextField();
      add(b12);
      
      b13 = new TextField();
      add(b13);
      
      b14 = new TextField();
      add(b14);
      
      b15 = new TextField();
      add(b15);
      
      b16 = new TextField();
      add(b16);
      
      b17 = new TextField();
      add(b17);
      
      b18 = new TextField();
      add(b18);
      
      b19 = new TextField();
      add(b19);
      
      b20 = new TextField();
      add(b20);
      

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
      a11 = new TextField();
      add(a11);
      a12 = new TextField();
      add(a12);
      a13 = new TextField();
      add(a13);
      a14 = new TextField();
      add(a14);
      a15 = new TextField();
      add(a15);
      a16 = new TextField();
      add(a16);
      a17 = new TextField();
      add(a17);
      a18 = new TextField();
      add(a18);
      a19 = new TextField();
      add(a19);
      a20 = new TextField();
      add(a20);

      

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
      c6 = new JButton("6");
      add(c6);
      c7 = new JButton("7");
      add(c7);
      c8 = new JButton("8");
      add(c8);
      c9 = new JButton("9");
      add(c9);
      c10 = new JButton("10");
      add(c10);
      c11 = new JButton("11");
      add(c11);
      c12 = new JButton("12");
      add(c12);
      c13 = new JButton("13");
      add(c13);
      c14 = new JButton("14");
      add(c14);
      c15 = new JButton("15");
      add(c15);
      c16 = new JButton("16");
      add(c16);
      c17 = new JButton("17");
      add(c17);
      c18 = new JButton("18");
      add(c18);
      c19 = new JButton("19");
      add(c19);
      c20 = new JButton("20");
      add(c20);

      re = new JButton("갯수 재입력");
      add(re);
      in = new JButton("입력");
      add(in);
//////////////////////////////////////////////////////////    요리 순서 선택

      Label y1 = new Label("요리순서 1:");
      add(y1);
      Label y2 = new Label("요리순서 2:");
      add(y2);
      Label y3 = new Label("요리순서 3:");
      add(y3);
      Label y4 = new Label("요리순서 4:");
      add(y4);
      Label y5 = new Label("요리순서 5:");
      add(y5);
      Label y6 = new Label("요리순서 6:");
      add(y6);
      Label y7 = new Label("요리순서 7:");
      add(y7);
      Label y8 = new Label("요리순서 8:");
      add(y8);
      Label y9 = new Label("요리순서 9:");
      add(y9);
      Label y10 = new Label("요리순서 10:");
      add(y10);

      z1 = new TextField();
      add(z1);
      z2 = new TextField();
      add(z2);
      z3 = new TextField();
      add(z3);
      z4 = new TextField();
      add(z4);
      z5 = new TextField();
      add(z5);
      z6 = new TextField();
      add(z6);
      z7 = new TextField();
      add(z7);
      z8 = new TextField();
      add(z8);
      z9 = new TextField();
      add(z9);
      z10 = new TextField();
      add(z10);

      x1 = new JButton("1");
      add(x1);
      x2 = new JButton("2");
      add(x2);
      x3 = new JButton("3");
      add(x3);
      x4 = new JButton("4");
      add(x4);
      x5 = new JButton("5");
      add(x5);
      x6 = new JButton("6");
      add(x6);
      x7 = new JButton("7");
      add(x7);
      x8 = new JButton("8");
      add(x8);
      x9 = new JButton("9");
      add(x9);
      x10 = new JButton("10");
      add(x10);
      xre = new JButton("순서 재입력");
      add(xre);

      t1.setBounds(30, 20, 60, 40);
      t2.setBounds(30, 70, 60, 40);
      t3.setBounds(30, 120, 60, 40);
      n1.setBounds(100, 20, 200, 30);
      n2.setBounds(100, 70, 400, 30);
      n3.setBounds(100, 120, 150, 30);

      r1.setBounds(880, 300, 40, 40);
      r2.setBounds(880, 350, 40, 40);
      r3.setBounds(880, 400, 40, 40);
      r4.setBounds(880, 450, 40, 40);
      r5.setBounds(880, 500, 40, 40);
      r6.setBounds(880, 550, 40, 40);
      r7.setBounds(880, 600, 40, 40);
      r8.setBounds(880, 650, 40, 40);
      r9.setBounds(880, 700, 40, 40);
      r10.setBounds(880, 750, 40, 40);
      r11.setBounds(1360, 300, 40, 40);
      r12.setBounds(1360, 350, 40, 40);
      r13.setBounds(1360, 400, 40, 40);
      r14.setBounds(1360, 450, 40, 40);
      r15.setBounds(1360, 500, 40, 40);
      r16.setBounds(1360, 550, 40, 40);
      r17.setBounds(1360, 600, 40, 40);
      r18.setBounds(1360, 650, 40, 40);
      r19.setBounds(1360, 700, 40, 40);
      r20.setBounds(1360, 750, 40, 40);

      a1.setBounds(930, 300, 150, 30);
      a2.setBounds(930, 350, 150, 30);
      a3.setBounds(930, 400, 150, 30);
      a4.setBounds(930, 450, 150, 30);
      a5.setBounds(930, 500, 150, 30);
      a6.setBounds(930, 550, 150, 30);
      a7.setBounds(930, 600, 150, 30);
      a8.setBounds(930, 650, 150, 30);
      a9.setBounds(930, 700, 150, 30);
      a10.setBounds(930, 750, 150, 30);
      b1.setBounds(1100, 300, 150, 30);
      b2.setBounds(1100, 350, 150, 30);
      b3.setBounds(1100, 400, 150, 30);
      b4.setBounds(1100, 450, 150, 30);
      b5.setBounds(1100, 500, 150, 30);
      b6.setBounds(1100, 550, 150, 30);
      b7.setBounds(1100, 600, 150, 30);
      b8.setBounds(1100, 650, 150, 30);
      b9.setBounds(1100, 700, 150, 30);
      b10.setBounds(1100, 750, 150, 30);

      a11.setBounds(1420, 300, 150, 30);
      a12.setBounds(1420, 350, 150, 30);
      a13.setBounds(1420, 400, 150, 30);
      a14.setBounds(1420, 450, 150, 30);
      a15.setBounds(1420, 500, 150, 30);
      a16.setBounds(1420, 550, 150, 30);
      a17.setBounds(1420, 600, 150, 30);
      a18.setBounds(1420, 650, 150, 30);
      a19.setBounds(1420, 700, 150, 30);
      a20.setBounds(1420, 750, 150, 30);
      b11.setBounds(1590, 300, 150, 30);
      b12.setBounds(1590, 350, 150, 30);
      b13.setBounds(1590, 400, 150, 30);
      b14.setBounds(1590, 450, 150, 30);
      b15.setBounds(1590, 500, 150, 30);
      b16.setBounds(1590, 550, 150, 30);
      b17.setBounds(1590, 600, 150, 30);
      b18.setBounds(1590, 650, 150, 30);
      b19.setBounds(1590, 700, 150, 30);
      b20.setBounds(1590, 750, 150, 30);

      in.setBounds(1620, 800, 120, 110);

      t4.setBounds(1200, 30, 180, 30);

      c1.setBounds(880, 80, 50, 50);
      c2.setBounds(960, 80, 50, 50);
      c3.setBounds(1040, 80, 50, 50);
      c4.setBounds(1120, 80, 50, 50);
      c5.setBounds(1200, 80, 50, 50);
      c6.setBounds(1280, 80, 50, 50);
      c7.setBounds(1360, 80, 50, 50);
      c8.setBounds(1440, 80, 50, 50);
      c9.setBounds(1520, 80, 50, 50);
      c10.setBounds(1600, 80, 50, 50);
      c11.setBounds(880, 150, 50, 50);
      c12.setBounds(960, 150, 50, 50);
      c13.setBounds(1040, 150, 50, 50);
      c14.setBounds(1120, 150, 50, 50);
      c15.setBounds(1200, 150, 50, 50);
      c16.setBounds(1280, 150, 50, 50);
      c17.setBounds(1360, 150, 50, 50);
      c18.setBounds(1440, 150, 50, 50);
      c19.setBounds(1520, 150, 50, 50);
      c20.setBounds(1600, 150, 50, 50);

      re.setBounds(1520, 220, 130, 50);

      t5.setBounds(300, 180, 200, 40);

      x1.setBounds(30, 240, 50, 50);
      x2.setBounds(100, 240, 50, 50);
      x3.setBounds(170, 240, 50, 50);
      x4.setBounds(240, 240, 50, 50);
      x5.setBounds(310, 240, 50, 50);
      x6.setBounds(380, 240, 50, 50);
      x7.setBounds(450, 240, 50, 50);
      x8.setBounds(520, 240, 50, 50);
      x9.setBounds(590, 240, 50, 50);
      x10.setBounds(660, 240, 50, 50);
      xre.setBounds(590, 180, 120, 50);

      y1.setBounds(30, 300, 70, 40);
      y2.setBounds(30, 350, 70, 40);
      y3.setBounds(30, 400, 70, 40);
      y4.setBounds(30, 450, 70, 40);
      y5.setBounds(30, 500, 70, 40);
      y6.setBounds(30, 550, 70, 40);
      y7.setBounds(30, 600, 70, 40);
      y8.setBounds(30, 650, 70, 40);
      y9.setBounds(30, 700, 70, 40);
      y10.setBounds(30, 750, 70, 40);

      z1.setBounds(100, 300, 610, 30);
      z2.setBounds(100, 350, 610, 30);
      z3.setBounds(100, 400, 610, 30);
      z4.setBounds(100, 450, 610, 30);
      z5.setBounds(100, 500, 610, 30);
      z6.setBounds(100, 550, 610, 30);
      z7.setBounds(100, 600, 610, 30);
      z8.setBounds(100, 650, 610, 30);
      z9.setBounds(100, 700, 610, 30);
      z10.setBounds(100, 750, 610, 30);

      add(p);
      setSize(1800, 1000);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      setTitle("창작요리");
      setVisible(true);

      c1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 1;
               a2.setEnabled(false);
               a3.setEnabled(false);
               a4.setEnabled(false);
               a5.setEnabled(false);
               a6.setEnabled(false);
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b2.setEnabled(false);
               b3.setEnabled(false);
               b4.setEnabled(false);
               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 2;
               a3.setEnabled(false);
               a4.setEnabled(false);
               a5.setEnabled(false);
               a6.setEnabled(false);
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b3.setEnabled(false);
               b4.setEnabled(false);
               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 3;
               a4.setEnabled(false);
               a5.setEnabled(false);
               a6.setEnabled(false);
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b4.setEnabled(false);
               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 4;
               a5.setEnabled(false);
               a6.setEnabled(false);
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 5;
               a6.setEnabled(false);
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 6;
               a7.setEnabled(false);
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 7;
               a8.setEnabled(false);
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b8.setEnabled(false);
               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 8;
               a9.setEnabled(false);
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b9.setEnabled(false);
               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 9;
               a10.setEnabled(false);
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b10.setEnabled(false);
               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 10;
               a11.setEnabled(false);
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b11.setEnabled(false);
               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 11;
               a12.setEnabled(false);
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b12.setEnabled(false);
               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 12;
               a13.setEnabled(false);
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b13.setEnabled(false);
               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 13;
               a14.setEnabled(false);
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b14.setEnabled(false);
               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 14;
               a15.setEnabled(false);
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b15.setEnabled(false);
               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 15;
               a16.setEnabled(false);
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b16.setEnabled(false);
               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c16.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 16;
               a17.setEnabled(false);
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b17.setEnabled(false);
               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c17.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 17;
               a18.setEnabled(false);
               a19.setEnabled(false);
               a20.setEnabled(false);

               b18.setEnabled(false);
               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c18.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 18;
               a19.setEnabled(false);
               a20.setEnabled(false);

               b19.setEnabled(false);
               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c19.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 19;
               a20.setEnabled(false);

               b20.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c20.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               rcpcnt = 20;
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      re.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               a2.setEnabled(true);
               a3.setEnabled(true);
               a4.setEnabled(true);
               a5.setEnabled(true);
               a6.setEnabled(true);
               a7.setEnabled(true);
               a8.setEnabled(true);
               a9.setEnabled(true);
               a10.setEnabled(true);
               a11.setEnabled(true);
               a12.setEnabled(true);
               a13.setEnabled(true);
               a14.setEnabled(true);
               a15.setEnabled(true);
               a16.setEnabled(true);
               a17.setEnabled(true);
               a18.setEnabled(true);
               a19.setEnabled(true);
               a20.setEnabled(true);

               b2.setEnabled(true);
               b3.setEnabled(true);
               b4.setEnabled(true);
               b5.setEnabled(true);
               b6.setEnabled(true);
               b7.setEnabled(true);
               b8.setEnabled(true);
               b9.setEnabled(true);
               b10.setEnabled(true);
               b11.setEnabled(true);
               b12.setEnabled(true);
               b13.setEnabled(true);
               b14.setEnabled(true);
               b15.setEnabled(true);
               b16.setEnabled(true);
               b17.setEnabled(true);
               b18.setEnabled(true);
               b19.setEnabled(true);
               b20.setEnabled(true);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 1;
               z2.setEnabled(false);
               z3.setEnabled(false);
               z4.setEnabled(false);
               z5.setEnabled(false);
               z6.setEnabled(false);
               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 2;

               z3.setEnabled(false);
               z4.setEnabled(false);
               z5.setEnabled(false);
               z6.setEnabled(false);
               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 3;

               z4.setEnabled(false);
               z5.setEnabled(false);
               z6.setEnabled(false);
               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 4;

               z5.setEnabled(false);
               z6.setEnabled(false);
               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 5;

               z6.setEnabled(false);
               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 6;

               z7.setEnabled(false);
               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 7;

               z8.setEnabled(false);
               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 8;

               z9.setEnabled(false);
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 9;
               z10.setEnabled(false);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      x10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               procnt = 10;

            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      xre.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               z2.setEnabled(true);
               z3.setEnabled(true);
               z4.setEnabled(true);
               z5.setEnabled(true);
               z6.setEnabled(true);
               z7.setEnabled(true);
               z8.setEnabled(true);
               z9.setEnabled(true);
               z10.setEnabled(true);
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      in.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String[] recipeAmount = new String[20];
            String[] recipeName = new String[20];
            String[] proList = new String[10];
            try {
               recipeAmount[0] = b1.getText();
               recipeAmount[1] = b2.getText();
               recipeAmount[2] = b3.getText();
               recipeAmount[3] = b4.getText();
               recipeAmount[4] = b5.getText();
               recipeAmount[5] = b6.getText();
               recipeAmount[6] = b7.getText();
               recipeAmount[7] = b8.getText();
               recipeAmount[8] = b9.getText();
               recipeAmount[9] = b10.getText();
               recipeAmount[10] = b11.getText();
               recipeAmount[11] = b12.getText();
               recipeAmount[12] = b13.getText();
               recipeAmount[13] = b14.getText();
               recipeAmount[14] = b15.getText();
               recipeAmount[15] = b16.getText();
               recipeAmount[16] = b17.getText();
               recipeAmount[17] = b18.getText();
               recipeAmount[18] = b19.getText();
               recipeAmount[19] = b20.getText();
               
               recipeName[0] = a1.getText();
               recipeName[1] = a2.getText();
               recipeName[2] = a3.getText();
               recipeName[3] = a4.getText();
               recipeName[4] = a5.getText();
               recipeName[5] = a6.getText();
               recipeName[6] = a7.getText();
               recipeName[7] = a8.getText();
               recipeName[8] = a9.getText();
               recipeName[9] = a10.getText();
               recipeName[10] = a11.getText();
               recipeName[11] = a12.getText();
               recipeName[12] = a13.getText();
               recipeName[13] = a14.getText();
               recipeName[14] = a15.getText();
               recipeName[15] = a16.getText();
               recipeName[16] = a17.getText();
               recipeName[17] = a18.getText();
               recipeName[18] = a19.getText();
               recipeName[19] = a20.getText();
               
               proList[0] = z1.getText();
               proList[1] = z2.getText();
               proList[2] = z3.getText();
               proList[3] = z4.getText();
               proList[4] = z5.getText();
               proList[5] = z6.getText();
               proList[6] = z7.getText();
               proList[7] = z8.getText();
               proList[8] = z9.getText();
               proList[9] = z10.getText();
               
               mf.getName(n1.getText(), n2.getText(), n3.getText());
               mf.getRecipe(rcpcnt, recipeName, recipeAmount);
               mf.getProcess(procnt, proList);
               mf.MyFoodWrite();
               JOptionPane.showMessageDialog(null, "저장 완료!!");

            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
   }
}