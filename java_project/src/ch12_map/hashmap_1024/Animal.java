package ch12_map.hashmap_1024;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

	private int animalId;        //종류
	private String animalName;   //이름
	
	public Animal(int animalId, String animalName) {
		super();
		this.animalId = animalId;
		this.animalName = animalName;
	}
	
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	@Override
	public String toString() {
		return "Animal [animalId는 " + animalId + ", animalName는 " + animalName + "]";
	}

	@Override
	public int hashCode() {
		return animalId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return animalId == other.animalId && Objects.equals(animalName, other.animalName);
	}
	
	//set은 적용됨
	//map에선 적용x
	@Override
	public int compareTo(Animal animal) {
		
		return (this.animalId - animal.animalId) * (-1);   
	}


	
	
}
