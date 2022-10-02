package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mohammed");
		p.setLastName("Barouni");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("agyla");
		p.setLastName("cloud");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("github");
		p.setLastName("webhook");
		persons.add(p);
		
		p = new Person();
		p.setId("2");
		p.setAge(30);
		p.setFirstName("Farouk");
		p.setLastName("Rajhi");
		persons.add(p);
		
		p = new Person();
		p.setId("2");
		p.setAge(28);
		p.setFirstName("gihub");
		p.setLastName("webhook");
		persons.add(p);
		
		p = new Person();
		p.setId("2");
		p.setAge(28);
		p.setFirstName("k8s");
		p.setLastName("openshift");
		persons.add(p);
		
		p = new Person();
		p.setId("2");
		p.setAge(28);
		p.setFirstName("containerd");
		p.setLastName("redhat");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}
