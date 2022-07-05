package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {

    public static void main(String[] args) {

        MemberController mc = new MemberController();

        mc.insertMember("ggg", "고길동", "1234", "zzz@naver.com", 'M', 33); // 멤버 정보를 입력
        System.out.println("==================");
        mc.updatePassword("abc", "9999999");  // 비밀번호 변경

        // 모든 멤버 조회
        Member[] members = mc.printAll();
        for (Member m : members) {
            if (m == null) break;
            System.out.println(m.inform());   // 회원정보
        }
        System.out.println("================");
        Member member = mc.searchId("def");  // 회원 아이디로 검색 후 정보 조회
        System.out.println(member.inform());

        System.out.println("====================");
        Member[] members1 = mc.searchName("김철수");   // 이름으로 정보 조회
        for (Member m : members1) {
            System.out.println(m.inform());
        }

        System.out.println("=================");
        mc.delete("def");
        mc.delete("ghi");

        Member[] members2 = mc.printAll();
        for (Member m : members2) {
            if (m == null) break;
            System.out.println(m.inform());   // 회원정보
        }

        System.out.println("====================");
        mc.deleteAll();

        Member[] members3 = mc.printAll();
        System.out.println(mc.existMemberNum());


    }
}
