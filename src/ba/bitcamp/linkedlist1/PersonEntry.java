package ba.bitcamp.linkedlist1;

public class PersonEntry {

	public static void main(String[] args) {

		String name;
		PersonNode firstPerson = null;

		int counter = 0;

		do {

			name = TextIO.getlnString();
			if (name.equals("end")) {
				break;
			}
			Person person = new Person(name);
			PersonNode pnode = new PersonNode(person);

			if (firstPerson == null) {
				firstPerson = pnode;
			} else {
				add(person, firstPerson);
			}

		} while (true);

		System.out.println(counter);

		System.out.println(counter(firstPerson));

		writeOut(firstPerson);
		System.out.println(counter(firstPerson));

	}

	private static void add(Person person, PersonNode firstPerson1) {
		PersonNode lastPerson = firstPerson1;
		while (lastPerson.getNext() != null) {
			lastPerson = lastPerson.getNext();

		}
		lastPerson.setNext(new PersonNode(person));
	}

	public static int counter(PersonNode firstPerson) {

		int counter = 0;

		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			counter++;
		}
		return counter;

	

	}

	private static void writeOut(PersonNode firstPerson) {

		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			System.out.println(current.getPerson().getName());
		}

	}

}
