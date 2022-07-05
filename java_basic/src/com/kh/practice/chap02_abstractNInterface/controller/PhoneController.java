package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

    private final String[] result = new String[2];

    public String[] method() {
        Phone[] p = new Phone[]{new GalaxyNote9(), new V40()};


        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof GalaxyNote9) {
                this.result[i] = ((GalaxyNote9)p[i]).printInformation();
            } else if (p[i] instanceof V40) {
                this.result[i] = ((V40)p[i]).printInformation();
            }
        }
        return this.result;


    }
}
