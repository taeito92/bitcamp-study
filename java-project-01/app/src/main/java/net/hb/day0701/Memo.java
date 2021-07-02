package net.hb.day0701;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// 클래스를 접근하는 키워드 this (windowlistener, actionlistener를 상속받은 Memo를 부르는)
public class Memo extends Frame implements WindowListener ,ActionListener{
  private Button btnExit = new Button(" EXIT ");
  private Button btnSend = new Button(" SEND ");
  private TextField tf = new TextField(20); // 한줄입력
  private TextArea ta = new TextArea(); // 가로row * 세로column
  private Font ff = new Font("consolas", Font.BOLD, 20);
  private Panel pan = new Panel(); //레이아웃 받침대 = 쟁반역할

  public Memo() {
    //초간단 메모장
    pan.add(tf); pan.add(btnSend); pan.add(btnExit);
    ta.setFont(ff);
    this.add("Center", ta);
    this.add("South", pan); //pan = panel


    // 이벤트 연결 리스너 추가
    // 오른쪽 this는 addwindowlistener()의 괄호 안에 필요한 아규먼트 값이 windowlistener이고 
    // memo는 windowlistener를 상속받기 때문에 상속 받은 memo를 가르키는 this 사용 가능
    // 혹은 memo mm = new memo(); or windowlistener wl = new windowlistener();

    // WindowListener wl = new WindowListener();
    // addWindowListener(wl); 에러(인터페스이기에 상속을 이용해서 해야함)
    this.addWindowListener(this); 
    tf.addActionListener(this);
    btnSend.addActionListener(this);
    btnExit.addActionListener(this);


    ta.setBackground(Color.YELLOW);
    this.setSize(400, 500);
    this.setTitle("초간단메모장");
    this.setVisible(true);



  }




  @Override 
  public void windowClosing(WindowEvent e) { 
    myExit();
  }


  @Override public void windowOpened(WindowEvent e) {}
  @Override public void windowClosed(WindowEvent e) { }
  @Override public void windowIconified(WindowEvent e) { }
  @Override public void windowDeiconified(WindowEvent e) { }
  @Override public void windowActivated(WindowEvent e) { }
  @Override public void windowDeactivated(WindowEvent e) { }

  @Override
  public void actionPerformed(ActionEvent ae) {

    // actionPerformed 메소는 버튼 클릭, 이미지 클릭, 입력란 enter
    if(ae.getSource() == tf) {
      myText();
    } else if(ae.getSource() == btnSend) {
      myText();
    } else if(ae.getSource() == btnExit) {
      myExit();
    }else {}

  }

  public void myText() {
    // 첫번째 tf 입력란에 데이터 가져오기
    // 두번째 tf내용을 ta에 추가후 tf 내용 삭제, tf 입력란에 초점
    String data = tf.getText();
    ta.append(data+"\n");
    tf.setText("");
    tf.requestFocus();
  }

  public void myExit() {
    System.exit(1);

  }

  public static void main(String[] args) {

    Memo pad = new Memo();
    AAA aa = null; // 선언만
    // AAA ac = new AAA(); 에러발생
    // WindowListener wl = new WindowListener(); 인터페이스라서 안된다.(스태틱 논스태틱 둘 다 안됨)

  }
}
