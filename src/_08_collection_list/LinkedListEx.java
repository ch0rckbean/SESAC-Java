package _08_collection_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List<String> list1=new ArrayList<>();
        // LinkedList 컬렉션 객체 생성
        List<String> list2=new LinkedList<>();

        // 시작, 끝 변수 선언
        long stTime;
        long endTime;

        //ArrayList의 0번 인덱스에 데이터 추가(1만회 반복)
        stTime=System.nanoTime();
        for (int i=0; i<10000; i++){
            list1.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.println(("ArrayList 소요 시간: "+(endTime-stTime)));

        //LinkedList의 0번 인덱스에 데이터 추가(1만회 반복)
        stTime=System.nanoTime();
        for (int i=0; i<10000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.println(("LinkedList 소요 시간: "+(endTime-stTime)));

        // 결과 해석
        // - LinkedList가 ArrayList 보다 요소 추가에 대해 더 빠른 성능 냄
        // - ArrayList는 0번 인덱스에 새로운 요소를 추가하며 기존 요소 인덱스를 한 칸씩 뒤로 미루는 작업을 하기 때문

        // ArrayList vs. LinkedList
        // * ArrayList
        // - 내부 배열에 객체 저장
        // - 장점: '인덱스 사용한 요소 접근' 빠름
        // * LinkedList
        // - 인접 객체를 체인처럼 연결해서 관리
        // - 객체를 삽입/삭제하면 바로 앞 뒤 링크만 변경해주면 되므로 '자주 객체 삽입/삭제 발생하는' 곳 유리
    }
}
