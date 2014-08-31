package com.mobiconsoft.dashboard.dao;

import java.util.List;

import com.mobiconsoft.dashboard.domain.Person;

public interface PersonDAO {
	
	public void deletePerson(int id);
	public Person getPerson(int id);
	public List<Person> getPersons();
	public Person savePerson(Person person);
	public Person updatePerson(Person person);

}
