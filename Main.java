/**
 * Created by Josh on 08/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        People people = new People(new Person[10]);
        people.insertAtIndex(1,new Person("Josh",21,"333O"));
        people.insertAtIndex(11,new Person("Josh",21,"333O"));

    }
}
