package ch12_map.hashmap_1024;

import ch12_collection_1024.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		// 추가 맴버클래스 참고해서, Animal 만들기
		// 맴버 클래스에 있는 인터페이스 매서드 참고해서 
		// 출력시 내림차순으로 출력
		// Animal 클래스 객체 4개 임의 생성
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		
		Member memberLee = new Member(1001, "이지원"); // key >> 1001, value >> 이지원
		Member memberSon = new Member(1005, "손민국");
		Member memberPark = new Member(1004, "박서훤");
		Member memberHong = new Member(1008, "홍길동");
		
		
		
		
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(memberHong.getMemberId());
		
		memberHashMap.showAllMember();
	}
}
