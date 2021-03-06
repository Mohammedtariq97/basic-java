package naturalordertutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person person) {

		return name.compareTo(person.name);
	}

}

public class naturalorder {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		showElements(set);

	}

	private static void addElements(Collection<Person> col) {

		col.add(new Person("Baby"));
		col.add(new Person("Katyy"));
		col.add(new Person("michael"));
		col.add(new Person("Bob"));
	}

	public static void showElements(Collection<Person> col) {

		for (Person s : col) {

			System.out.println(s);
		}

	}

}
