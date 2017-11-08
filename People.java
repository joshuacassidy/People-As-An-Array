public class People implements IPeople {

    private Person[] people;

    public People(Person[] people) {
        this.people = people;
    }

    @Override
    public void insertAtIndex(int index, Person person) {
        if (index > (people.length-1)) {
            throw  new IndexArrayOutOfBoundsForPeopleArray("The index of where the person object is trying to be inserted is greater than the size of the array");
        } else {
            people[index] = person;
        }
    }

    @Override
    public Person[] getPeople() {
        return people;
    }

    @Override
    public int getSize() {
        return people.length;
    }
}
