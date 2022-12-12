package ch12_map.hashmap_1024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class AnimalTest {

	public static void main(String[] args) {
		
		// 추가 맴버클래스 참고해서, Animal 만들기
		// 맴버 클래스에 있는 인터페이스 매서드 참고해서 
		// 출력시 내림차순으로 출력
		// Animal 클래스 객체 4개 임의 생성
		
		
		
		
		AnimalHashMap animalHashMap = new AnimalHashMap();
		
		Animal ANIA = new Animal(1, "RRR");
		Animal anib = new Animal(2, "ggg");
		Animal anic = new Animal(8, "9999");
		Animal anid = new Animal(9, "aaa");
		Animal anie = new Animal(5, "fff");
		Animal ANIf = new Animal(12, "vvv");
		Animal anig = new Animal(16, "www");
		Animal anih = new Animal(17, "zzz");
		Animal anii = new Animal(20, "444");
		Animal anij = new Animal(7, "777");
		
		animalHashMap.addAnimal(anic);
		animalHashMap.addAnimal(ANIA);
		animalHashMap.addAnimal(anib);
		animalHashMap.addAnimal(anid);
		animalHashMap.addAnimal(anie);
		animalHashMap.addAnimal(anig);
		animalHashMap.addAnimal(ANIf);
		animalHashMap.addAnimal(anih);
		animalHashMap.addAnimal(anii);
		animalHashMap.addAnimal(anij);
		
		
		
		
		animalHashMap.showAllAnimal();
	}
}
