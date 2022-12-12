package ch12_map.treemap_1024;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

import ch12_collection_1024.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	Comparator<Integer> comparator = Comparator.reverseOrder();
	
	public MemberTreeMap()
	{
		treeMap = new TreeMap<Integer, Member>(comparator);
	}
	
	public void addMember(Member member){
		
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId){
		
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}
