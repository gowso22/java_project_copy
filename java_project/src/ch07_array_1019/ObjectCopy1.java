package ch07_array_1019;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
 		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
 		System.out.println("bookArray2(복사본) 출력하기");
 		
		for(int i=0; i<bookArray2.length; i++){
			//bookArray2[i].showBookInfo();
			
			System.out.println(bookArray2[i]);
		}
		
		System.out.println("bookArray1(원본) 출력하기");
 		
		for(int i=0; i<bookArray1.length; i++){
			//bookArray2[i].showBookInfo();
			
			System.out.println(bookArray1[i]);
		} // 결과는 해당 주솟값만 복사!, 원본을 복사한 것이 아님
	      // 실제 데이터가 위치한 주솟값만 복사했음, 얕은 복사
		
		
		//향상된 for문으로 출력해보기
		System.out.println("향상된 for문");
		for(Book lang : bookArray1) {
			lang.showBookInfo();
		}
		
		
		
	}
}
