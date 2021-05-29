import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Login extends JFrame { // 로그인화면
   FirstSwing f = new FirstSwing();
  

   public void login() {
      JPanel p = new JPanel();
      p.setLayout(null);
      JLabel label = new JLabel();
      add(label);
      Label t1 = new Label("안녕하세요.");
      add(t1);
      Label t2 = new Label("오늘 뭐 먹지는 로그인 후 사용이 가능합니다.");
      add(t2);
      Label t3 = new Label("ID입력 후 로그인 버튼을 클릭하세요.");
      add(t3);
      Label b2 = new Label("아이디:");
      add(b2);
      Label b3 = new Label("비밀번호:");
      add(b3);
      TextField b4 = new TextField();
      add(b4);
      TextField b5 = new TextField();
      add(b5);
      b5.setEchoChar('*'); // 암호화
      JButton b6 = new JButton("로그인");
      add(b6);
      JButton b7 = new JButton("회원가입");
      add(b7);

      t1.setBounds(0, 5, 70, 40);
      t2.setBounds(0, 35, 280, 40);
      t3.setBounds(0, 65, 250, 40);
      b2.setBounds(40, 165, 40, 40);
      b3.setBounds(40, 205, 60, 40);
      b4.setBounds(150, 165, 200, 30);
      b5.setBounds(150, 205, 200, 30);
      b6.setBounds(380, 165, 80, 30);
      b7.setBounds(380, 205, 90, 30);

      add(p);
      setSize(700, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("로그인 화면 ");
      setVisible(true);

      b7.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) { // 회원가입창으로 이동
         Register r = new Register();
         }
      });
      ;

      b6.addActionListener(new ActionListener() {
         int count = 0;

         @Override
         public void actionPerformed(ActionEvent e2) { // 로그인여부 결정
            try {
               String[] array;
               String s;
               BufferedReader bos = new BufferedReader(new FileReader("회원명단.txt"));
               while ((s = bos.readLine()) != null) {
                  array = s.split("/");
                  if (b4.getText().equals(array[1]) && b5.getText().equals(array[2])) {
                     JOptionPane.showMessageDialog(null, "로그인이 되었습니다!!");
                     count++;
                     dispose();
                     f.first();
                  }
               }
               if (count == 0) {
                  JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
               }
               bos.close();

            } catch (IOException E10) {
               E10.printStackTrace();
            }
         }
      });
   }
}