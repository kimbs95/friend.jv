package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        double calc = height * width;

        return r.toString()+" / "+calc;
    }
    public String calcPerimeter(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        double peri = 2 * (width + height);
        return r.toString()+" / "+peri;

    }

}
