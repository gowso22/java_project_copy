package ch12_collection_1024.treeset;

import ch12_collection_1024.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		
		Member memberPark = new Member(1003, "ㅂㅅㅎ");
		Member memberLee = new Member(1001, "ㅇㅈㅇ");
		Member memberSon = new Member(1002, "ㅅㅁㄱ");
		
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ㅎㄱㅇ");  //1003 id중복
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
