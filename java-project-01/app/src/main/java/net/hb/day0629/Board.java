package net.hb.day0629;

public class Board {
  String message;

  public String getTitle() {
    return message;
  }

  public void setTitle(String title) {  // 타이틀 -> 메세지 -> 전역변수의 메세지 -> 겟타이틀
    message = title;
  }



}
