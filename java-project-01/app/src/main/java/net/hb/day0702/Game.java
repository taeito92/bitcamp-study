package net.hb.day0702;

class Terran{ // Terran.java X, Terran.class O 

}

class Zerg{ // Zerg.java X, Zerg.class O 

}

public class Game {

  public static void main(String[] args) { //Game.java - Game.class 
    System.out.println("Game클래스 main");

  }

  class MyExit{ // Game$MyExit.class - $가 있으면 exit는 game안에 소속이다
    // MyExit.java X

  }

}
