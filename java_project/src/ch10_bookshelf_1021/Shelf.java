package ch10_bookshelf_1021;

import java.util.ArrayList;

public class Shelf {
	
	// 자식클래스에서만 보임 >> protected
	protected ArrayList<String> shelf;
	
	
	// 생성자 호출
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	//getter method
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	//method
	public int getCount(){
		return shelf.size();
	}
}
