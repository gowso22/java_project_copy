package ch12_map.treemap_1024;

import ch12_collection_1024.Member;
import ch12_map.hashmap_1024.Animal;
import ch12_map.hashmap_1024.AnimalHashMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		
		
		
		
		
		
		MemberTreeMap memberTreehMap = new MemberTreeMap();
		
		Member ANIA = new Member(12, "RRR");
		Member anib = new Member(21, "ggg");
		Member anic = new Member(55, "9999");
		Member anid = new Member(01, "aaa");
		Member anie = new Member(04, "fff");
		Member ANIf = new Member(06, "vvv");
		Member anig = new Member(16, "www");
		Member anih = new Member(17, "zzz");
		Member anii = new Member(03, "444");
		Member anij = new Member(07, "777");
		
		memberTreehMap.addMember(anic);
		memberTreehMap.addMember(ANIA);
		memberTreehMap.addMember(anib);
		memberTreehMap.addMember(anid);
		memberTreehMap.addMember(anie);
		memberTreehMap.addMember(anig);
		memberTreehMap.addMember(ANIf);
		memberTreehMap.addMember(anih);
		memberTreehMap.addMember(anii);
		memberTreehMap.addMember(anij);
		
		memberTreehMap.showAllMember();
		
		
//		MemberTreeMap memberHashMap = new MemberTreeMap();
//		
//		Member memberPark = new Member(1003, "PARK");
//		Member memberLee = new Member(1001, "LEE");
//		Member memberHong = new Member(1004, "HONG");
//		Member memberSon = new Member(1002, "SON");
//		
//		memberHashMap.addMember(memberPark);
//		memberHashMap.addMember(memberLee);
//		memberHashMap.addMember(memberHong);
//		memberHashMap.addMember(memberSon);
//		
//		memberHashMap.showAllMember();
//		
//		memberHashMap.removeMember(1074);
//		memberHashMap.showAllMember();
	}
}
