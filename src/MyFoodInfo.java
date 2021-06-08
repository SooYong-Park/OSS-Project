import java.awt.*;
import javax.swing.*;

public class MyFoodInfo extends JFrame {

   TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
   static String[] Dc = new String[10];
   static String Rd;
   static String s = null;

   public void info() {
      JPanel p = new JPanel();
      p.setLayout(null);
      Label t = new Label("요리재료와 순서입니다");
      add(t);
      b11 = new TextField();
      add(b11);
      b11.setText(Rd);
      b11.setBounds(20, 60, 950, 40);

      Label t1 = new Label("순서1");
      add(t1);
      Label t2 = new Label("순서2");
      add(t2);
      Label t3 = new Label("순서3");
      add(t3);
      Label t4 = new Label("순서4");
      add(t4);
      Label t5 = new Label("순서5");
      add(t5);
      Label t6 = new Label("순서6");
      add(t6);
      Label t7 = new Label("순서7");
      add(t7);
      Label t8 = new Label("순서8");
      add(t8);
      Label t9 = new Label("순서9");
      add(t9);
      Label t10 = new Label("순서10");
      add(t10);

      b1 = new TextField();
      add(b1);
      b1.setText(Dc[0]);
      b2 = new TextField();
      add(b2);
      b2.setText(Dc[1]);
      b3 = new TextField();
      add(b3);
      b3.setText(Dc[2]);
      b4 = new TextField();
      add(b4);
      b4.setText(Dc[3]);
      b5 = new TextField();
      add(b5);
      b5.setText(Dc[4]);
      b6 = new TextField();
      add(b6);
      b6.setText(Dc[5]);
      b7 = new TextField();
      add(b7);
      b7.setText(Dc[6]);
      b8 = new TextField();
      add(b8);
      b8.setText(Dc[7]);
      b9 = new TextField();
      add(b9);
      b9.setText(Dc[8]);
      b10 = new TextField();
      add(b10);
      b10.setText(Dc[9]);

      t.setBounds(400, 10, 200, 40);
      t1.setBounds(20, 160, 50, 30);
      t2.setBounds(20, 200, 50, 30);
      t3.setBounds(20, 240, 50, 30);
      t4.setBounds(20, 280, 50, 30);
      t5.setBounds(20, 320, 50, 30);
      t6.setBounds(20, 360, 50, 30);
      t7.setBounds(20, 400, 50, 30);
      t8.setBounds(20, 440, 50, 30);
      t9.setBounds(20, 480, 50, 30);
      t10.setBounds(20, 520, 50, 30);

      b1.setBounds(80, 160, 700, 30);
      b2.setBounds(80, 200, 700, 30);
      b3.setBounds(80, 240, 700, 30);
      b4.setBounds(80, 280, 700, 30);
      b5.setBounds(80, 320, 700, 30);
      b6.setBounds(80, 360, 700, 30);
      b7.setBounds(80, 400, 700, 30);
      b8.setBounds(80, 440, 700, 30);
      b9.setBounds(80, 480, 700, 30);
      b10.setBounds(80, 520, 700, 30);

      add(p);
      setSize(1000, 700);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      setTitle("찜한 목록 화면");
      setVisible(true);
   }

   public void setRd(String a) {
         this.Rd = a;
      
   }
   public void setDc(String b[]) {
      for (int i = 0; i < 10; i++) {
         this.Dc[i] = b[i];
      }

   }
}