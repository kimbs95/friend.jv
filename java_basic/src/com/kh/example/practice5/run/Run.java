package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {

    public static void main(String[] args) {

        Lotto lotto1 = new Lotto();
        lotto1.information();
        lotto1.information();
        //makeLottoNumber 제한자가 public 이라면 lotto1.makeLottoNumber(); 사용해서 번호가 바뀌므로 private 를 사용합니다
        lotto1.information();
        lotto1.information();

        lotto1.information();
    }
}
