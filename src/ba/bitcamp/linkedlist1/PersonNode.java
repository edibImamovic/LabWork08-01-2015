package ba.bitcamp.linkedlist1;

public class PersonNode {
	
	private PersonNode next;
	private Person person;
	
	public PersonNode(Person person) {
		this.person = person;
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the next
	 */
	public PersonNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(PersonNode next) {
		this.next = next;
	}
	
	
	
}
