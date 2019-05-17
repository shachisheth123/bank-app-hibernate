package com.capgemini.hibernate.main;

import com.capgemini.hibernate.dao.PersonDao;
import com.capgemini.hibernate.person.Person;
import com.capgemini.hibernate.dao.impl.PersonDaoImpl;

public class Main{

	public static void main(String[] args)
	
	{
		PersonDao dao=new PersonDaoImpl();
		dao.addNew(new Person(101,"Shachi"));

		System.out.println("Voillaa!!!");

	}

}