package com.mazai.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by dan on 2019/5/20
 */
public class PersonTest {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("zhangsan", 20), new Person("lisi", 21), new Person("wangwu", 22));
		PersonTest personTest = new PersonTest();
		System.out.println(personTest.getPersonByUsername("zhangsan", list));
		System.out.println("-----------------------------------");
		System.out.println(personTest.getPersonsByAge(21, list));

		System.out.println("-----------------------------------");
		System.out.println(personTest.getPersonsByAge2(22, list, (age, persons) -> persons.stream().filter(v -> v.getAge() == age).collect(Collectors.toList())));

	}

	public List<Person> getPersonByUsername(String username, List<Person> persons) {
		return persons.stream().filter(v -> v.getName().equals(username)).collect(Collectors.toList());
	}

	public List<Person> getPersonsByAge(int age, List<Person> persons) {
		BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) ->
				personList.stream().filter(v -> v.getAge() == age).collect(Collectors.toList());
		return biFunction.apply(age, persons);
	}

	public List<Person> getPersonsByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
		return biFunction.apply(age, persons);
	}
}
