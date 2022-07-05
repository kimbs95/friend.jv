package com.kh.practice.list.music;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        MusicController mc = new MusicController();

        mc.addList(new Music("곡명","가수"));
        mc.addAtZero(new Music("곡명2","가수명2"));
        mc.addList(new Music("곡명3", "가수명3"));

        mc.removeMusic("곡명");

        List<Music> music = mc.printAll();
        for (Music m : music) {
            System.out.println(m);
        }
    }
}
