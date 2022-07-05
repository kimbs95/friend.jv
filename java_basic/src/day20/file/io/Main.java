package day20.file.io;

import java.io.*;
import java.util.stream.Stream;

// Serializable 인터페이스는 객체를 세이브파일에 저장할 수 있게 해주는 기능을 제공(직렬화)
public class Main {

    public static void main(String[] args) {

        //디렉토리를 생성하는 코드

        //만들 폴더 정보 객체 생성
        File f = new File("D:/human");
        // mkdirs = make directories
        if (!f.exists()) f.mkdirs(); // if문 안에 !f.exists 를 넣지 않으면 중복이였을경우 덮어씌어버림
        
//        saveHuman(new Human("김철수", 22, "대전시 서구"));
        Human human = loadHuman();
        System.out.println("human = " + human);
    }

    // 휴면객체를 세이브파일에 저장하는 메서드
    private static void saveHuman(Human human) {

        // 데이터를 파일에 쓰기 위한 객체
        OutputStream  fos = null;
        // 객체를 저장하기 위한 보조스트림 객체
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("D:/human/kim.sav");
            oos = new ObjectOutputStream(fos);
            // 객체를 파일에 저장
            oos.writeObject(human);

            System.out.println("파일 저장 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 예외가 발생했습니다.");
            e.printStackTrace(); // 예외시에 등장하는 빨간색 추적메시지 재등장
        } finally {
            try {
                if (fos != null) fos.close();
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 휴면객체를 세이브파일에 불러오는 메서드
    private static Human loadHuman() {

        // 데이터를 불러오기 위한 객체
        InputStream fos = null;
        // 객체를 저장하기 위한 보조스트림 객체
        ObjectInputStream oos = null;
        try {
            fos = new FileInputStream("D:/human/kim.sav");
            oos = new ObjectInputStream(fos);


            // 객체를 파일에서 로드
            return (Human)oos.readObject();


        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 예외가 발생했습니다.");
            e.printStackTrace(); // 예외시에 등장하는 빨간색 추적메시지 재등장
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
