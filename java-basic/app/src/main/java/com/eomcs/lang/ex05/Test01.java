package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 II
//
public class Test01 {
  public static void main(String[] args) {
    
    int lang2 = 0;
    // 00000000 00000000 00000000 00000000

    // 32비트에서 뒤에 8비트를 사용하여 8개의 true/false 값을 저장할 수 있다.
    // 8 비트에서 각 언어에 값을 저장할 비트를 다음과 같다고 가정하자.
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c

    
    final int LANG_C =      0B10000000;
    final int LANG_CPP =    0B01000000;
    final int LANG_JAVA =   0B00100000;
    final int LANG_JS =     0B00010000;
    final int LANG_PYTHON = 0B00001000;
    final int LANG_PHP =    0B00000100;
    final int LANG_HTML =   0B00000010;
    final int LANG_CSS   =  0B00000001;
    
    lang2 |= LANG_C;
    lang2 |= LANG_CPP;
    lang2 |= LANG_JAVA;
    lang2 |= LANG_JS;
    lang2 |= LANG_PYTHON;
    lang2 |= LANG_PHP;
    lang2 |= LANG_HTML;
    lang2 |= LANG_CSS;

    System.out.println(Integer.toBinaryString(lang2));


    lang2 = LANG_C | LANG_CPP | LANG_JAVA;

    System.out.println(Integer.toBinaryString(lang2));

    lang2 = lang2 - LANG_JAVA;

    System.out.println(Integer.toBinaryString(lang2));


    

    

    lang2 = lang2 | 0x80; // c = true
    lang2 |= 0x20; // java = true
    lang2 |= 0x08; // python = true 
    lang2 |= 0x02; // html = true

    System.out.println(Integer.toBinaryString(lang2));
  }
}
