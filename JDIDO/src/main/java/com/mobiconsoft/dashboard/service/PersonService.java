package com.mobiconsoft.dashboard.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mobiconsoft.dashboard.domain.Person;

public interface PersonService {
	@Transactional
	  public void delete(Integer id);
  public Person getById(Integer id);
  
  public List<Person> getPersons();
  
  @Transactional
  public Person save(Person person);
  
  @Transactional
  public Person update(Person person);
}
