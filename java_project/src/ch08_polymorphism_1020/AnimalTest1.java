package ch08_polymorphism_1020;

class Animal{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
	public void eat()
	{
		System.out.println("동물이 먹는 중입니다.");
	}
	public void sound()
	{
		System.out.println("동물이 소리를 내는 중입니다.");
	}
	
}

class Human extends Animal{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
	public void eat()
	{
		System.out.println("사람이 밥 먹는 중입니다.");
	}
	public void sound()
	{
		System.out.println("사람이 소리를 내는 중입니다.");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
	public void eat()
	{
		System.out.println("호랑이는 고기를 먹는 중입니다.");
	}
	public void sound()
	{
		System.out.println("호랑이가 소리를 내는 중입니다.");
	}
}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다 ");
	}
	public void flying() 
	{
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
	public void eat()
	{
		System.out.println("독수리가 먹이를 먹는 중입니다.");
	}
	public void sound()
	{
		System.out.println("독수리가 소리를 내는 중입니다.");
	}
}

class Lsy extends Animal{
	public void move()
	{
		System.out.println("이상용 걸어감.");
	}
	public void read() 
	{
		System.out.println("이상용 책 봄.");
	}
	public void eat()
	{
		System.out.println("lsy 밥 먹는 중입니다.");
	}
}

// 각자 좋아하는 동물클래스 생성
// 예 dog  각 동물들의 공통기능 move, eat이 있는데 sound 기능 추가
// sound 기능은 animal 및 각 하위 클래스에서 재정의해서 사용합니다.
// 좋아하는 동물 클래스를 move, eat, sound 실행
class Dog extends Animal{
	public void move() {
		System.out.println("개가 움직임");
	}
	public void eat() {
		System.out.println("개가 사료를 먹음");
	}
	public void sound() {
		System.out.println("개가 소리를 냄");
	}
}

public class AnimalTest1 {
	//상속이라는 개념이 
	// 재사용성, 중복제거. 
	// 다형성 -> 재할당을 할 때 , 받을 수 있는 매개변수의 범위를 넓히자. 
	// 한계 , 상속이 한번만, 그러면, 기능을 다르게 매번 구현을 할려면, 
	// 자식 클래스에서 구현 하고 싶은 기능이 다양함, 하지만, 반드시 이기능은 꼭 써주세요 라는 부분이 있더라. 
	// 강제성이 필요할 때가 있음. 
	// 해당 기능을 각 자식 클래스에서 다르게 구현을 유연하게 하기 위해서 -> 인터페이스, 추상클래스. 
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
//		  aTest.moveAnimal(new Human());
//		  aTest.moveAnimal(new Tiger());
		  
//		  aTest.moveAnimal(new Eagle());
//		  aTest.eatFood(new Human());
		  
		  aTest.moveAnimal(new Dog());
		  aTest.eatFood(new Dog());
		  aTest.animalSound(new Dog());
	 }

	 public void moveAnimal(Animal animal) { //매개 변수의 자료형이 상위 클래스
		  animal.move(); //재정의 된 메서드 호출
	 }   
	 public void eatFood(Animal animal) {
		animal.eat();
	}
	public void animalSound(Animal animal) {
		animal.sound();
	}
}



