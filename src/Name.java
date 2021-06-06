import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Name extends JFrame {
   JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, al, hi, mid, low;
   TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
   TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
   TextField d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
   TextField e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
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
      
      Label u1 = new Label("간략소개");
      add(u1);
      Label u2 = new Label("간략소개");
      add(u2);
      Label u3 = new Label("간략소개");
      add(u3);
      Label u4 = new Label("간략소개");
      add(u4);
      Label u5 = new Label("간략소개");
      add(u5);
      Label u6 = new Label("간략소개");
      add(u6);
      Label u7 = new Label("간략소개");
      add(u7);
      Label u8 = new Label("간략소개");
      add(u8);
      Label u9 = new Label("간략소개");
      add(u9);
      Label u10 = new Label("간략소개");
      add(u10);
      
      Label w1 = new Label("난이도");
      add(w1);
      Label w2 = new Label("난이도");
      add(w2);
      Label w3 = new Label("난이도");
      add(w3);
      Label w4 = new Label("난이도");
      add(w4);
      Label w5 = new Label("난이도");
      add(w5);
      Label w6 = new Label("난이도");
      add(w6);
      Label w7 = new Label("난이도");
      add(w7);
      Label w8 = new Label("난이도");
      add(w8);
      Label w9 = new Label("난이도");
      add(w9);
      Label w10 = new Label("난이도");
      add(w10);

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
      
      d1 = new TextField();
      add(d1);
      d2 = new TextField();
      add(d2);
      d3 = new TextField();
      add(d3);
      d4 = new TextField();
      add(d4);
      d5 = new TextField();
      add(d5);
      d6 = new TextField();
      add(d6);
      d7 = new TextField();
      add(d7);
      d8 = new TextField();
      add(d8);
      d9 = new TextField();
      add(d9);
      d10 = new TextField();
      add(d10);
      
      e1 = new TextField();
      add(e1);
      e2 = new TextField();
      add(e2);
      e3 = new TextField();
      add(e3);
      e4 = new TextField();
      add(e4);
      e5 = new TextField();
      add(e5);
      e6 = new TextField();
      add(e6);
      e7 = new TextField();
      add(e7);
      e8 = new TextField();
      add(e8);
      e9 = new TextField();
      add(e9);
      e10 = new TextField();
      add(e10);

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
      
      u1.setBounds(220, 80, 60, 30);
      u2.setBounds(220, 120, 60, 30);
      u3.setBounds(220, 160, 60, 30);
      u4.setBounds(220, 200, 60, 30);
      u5.setBounds(220, 240, 60, 30);
      u6.setBounds(220, 280, 60, 30);
      u7.setBounds(220, 320, 60, 30);
      u8.setBounds(220, 360, 60, 30);
      u9.setBounds(220, 400, 60, 30);
      u10.setBounds(220, 440, 60, 30);
      
      
      d1.setBounds(300, 80, 300, 30);
      d2.setBounds(300, 120, 300, 30);
      d3.setBounds(300, 160, 300, 30);
      d4.setBounds(300, 200, 300, 30);
      d5.setBounds(300, 240, 300, 30);
      d6.setBounds(300, 280, 300, 30);
      d7.setBounds(300, 320, 300, 30);
      d8.setBounds(300, 360, 300, 30);
      d9.setBounds(300, 400, 300, 30);
      d10.setBounds(300, 440, 300, 30);
      
      w1.setBounds(610, 80, 60, 30);
      w2.setBounds(610, 120, 60, 30);
      w3.setBounds(610, 160, 60, 30);
      w4.setBounds(610, 200, 60, 30);
      w5.setBounds(610, 240, 60, 30);
      w6.setBounds(610, 280, 60, 30);
      w7.setBounds(610, 320, 60, 30);
      w8.setBounds(610, 360, 60, 30);
      w9.setBounds(610, 400, 60, 30);
      w10.setBounds(610, 440, 60, 30);
      
      e1.setBounds(670, 80, 100, 30);
      e2.setBounds(670, 120, 100, 30);
      e3.setBounds(670, 160, 100, 30);
      e4.setBounds(670, 200, 100, 30);
      e5.setBounds(670, 240, 100, 30);
      e6.setBounds(670, 280, 100, 30);
      e7.setBounds(670, 320, 100, 30);
      e8.setBounds(670, 360, 100, 30);
      e9.setBounds(670, 400, 100, 30);
      e10.setBounds(670, 440, 100, 30);

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
               d1.setText(Alsumry[0]);
               d2.setText(Alsumry[1]);
               d3.setText(Alsumry[2]);
               d4.setText(Alsumry[3]);
               d5.setText(Alsumry[4]);
               d6.setText(Alsumry[5]);
               d7.setText(Alsumry[6]);
               d8.setText(Alsumry[7]);
               d9.setText(Alsumry[8]);
               d10.setText(Alsumry[9]);
               e1.setText(Allevel[0]);
               e2.setText(Allevel[1]);
               e3.setText(Allevel[2]);
               e4.setText(Allevel[3]);
               e5.setText(Allevel[4]);
               e6.setText(Allevel[5]);
               e7.setText(Allevel[6]);
               e8.setText(Allevel[7]);
               e9.setText(Allevel[8]);
               e10.setText(Allevel[9]);
            } catch (Exception ex) {
               System.out.println("error1");
            }
         }
      });
      hi.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent t) {

            try {

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
               d1.setText(Hisumry[0]);
               d2.setText(Hisumry[1]);
               d3.setText(Hisumry[2]);
               d4.setText(Hisumry[3]);
               d5.setText(Hisumry[4]);
               d6.setText(Hisumry[5]);
               d7.setText(Hisumry[6]);
               d8.setText(Hisumry[7]);
               d9.setText(Hisumry[8]);
               d10.setText(Hisumry[9]);
               e1.setText(Hilevel[0]);
               e2.setText(Hilevel[1]);
               e3.setText(Hilevel[2]);
               e4.setText(Hilevel[3]);
               e5.setText(Hilevel[4]);
               e6.setText(Hilevel[5]);
               e7.setText(Hilevel[6]);
               e8.setText(Hilevel[7]);
               e9.setText(Hilevel[8]);
               e10.setText(Hilevel[9]);
            } catch (Exception ex) {
               System.out.println("error2");
            }
         }
      });
      low.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent t) {

            try {

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
               d1.setText(Lowsumry[0]);
               d2.setText(Lowsumry[1]);
               d3.setText(Lowsumry[2]);
               d4.setText(Lowsumry[3]);
               d5.setText(Lowsumry[4]);
               d6.setText(Lowsumry[5]);
               d7.setText(Lowsumry[6]);
               d8.setText(Lowsumry[7]);
               d9.setText(Lowsumry[8]);
               d10.setText(Lowsumry[9]);
               e1.setText(Lowlevel[0]);
               e2.setText(Lowlevel[1]);
               e3.setText(Lowlevel[2]);
               e4.setText(Lowlevel[3]);
               e5.setText(Lowlevel[4]);
               e6.setText(Lowlevel[5]);
               e7.setText(Lowlevel[6]);
               e8.setText(Lowlevel[7]);
               e9.setText(Lowlevel[8]);
               e10.setText(Lowlevel[9]);
            } catch (Exception ex) {
               System.out.println("error3");
            }
         }
      });
      Recipe r = new Recipe();
      c1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
            	r.inputRcp(a1.getText());
                i.setName(a1.getText());
                i.setSumry(d1.getText());
                i.setLevel(e1.getText());
                i.info();
            } catch (Exception ex) {
               System.out.println(ex);
            }
         }
      });
      c2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a2.getText());
               i.setName(a2.getText());
               i.setSumry(d2.getText());
               i.setLevel(e2.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a3.getText());
               i.setName(a3.getText());
               i.setSumry(d3.getText());
               i.setLevel(e3.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a4.getText());
               i.setName(a4.getText());
               i.setSumry(d4.getText());
               i.setLevel(e4.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a5.getText());
               i.setName(a5.getText());
               i.setSumry(d5.getText());
               i.setLevel(e5.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a6.getText());
               i.setName(a6.getText());
               i.setSumry(d6.getText());
               i.setLevel(e6.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a7.getText());
               i.setName(a7.getText());
               i.setSumry(d7.getText());
               i.setLevel(e7.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a8.getText());
               i.setName(a8.getText());
               i.setSumry(d8.getText());
               i.setLevel(e8.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a9.getText());
               i.setName(a9.getText());
               i.setSumry(d9.getText());
               i.setLevel(e9.getText());
               i.info();
            } catch (Exception ex) {
               System.out.println("오류");
            }
         }
      });
      c10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               r.inputRcp(a10.getText());
               i.setName(a10.getText());
               i.setSumry(d10.getText());
               i.setLevel(e10.getText());
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