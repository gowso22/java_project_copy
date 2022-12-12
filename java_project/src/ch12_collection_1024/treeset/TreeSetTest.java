package ch12_collection_1024.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// 입력순서대로가 아닌 오름차순?으로 정렬됨
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("???");
		treeSet.add("ssss");
		treeSet.add("rrr");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
