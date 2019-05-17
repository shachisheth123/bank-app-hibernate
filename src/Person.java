package com.capgemini.hibernate.person;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;

@Entity
public class Person{

	@Id
	private int personId;
	private String personName;

	public Person(int pId, String pName){
		personId = pId;
		personName = pName;
	}

	public int getPersonId(){
		return personId;
	}

	public int setPersonId(int personId){
		
		return this.personId=personId;
	}

	public String getPersonName(){
		return personName;
	}

	public String setPersonName(String personName){
		
		return this.personName=personName;
	}

		public String toString() {
		return "Person [ personId=" + personId + ", personName=" + personName + "]";
	}


}