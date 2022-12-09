package ch10_bookshelf_1021;

public class BookShelf extends Shelf implements Queue{ // Shelf를 상속 받고  Queue를 구현 >> class Shelf 상속, interface Queue 상속이라는 느낌

	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
