import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Сергей on 19.02.2017.
 */
public class Persons {
    private final List<Person> persons;

    private Persons() {
        persons = new ArrayList<>();
    }
    public static Persons getPersons() { return new Persons(); }
    public boolean addPerson(Person p) { return persons.add(p); }
    public void removePersons() { persons.clear(); }
    public Persons filter(Predicate<Person> criterion) {
        Persons tmpPersons = Persons.getPersons();
        for(Person p : persons)
            if(criterion.test(p))
                tmpPersons.addPerson(p);
        return tmpPersons;
    }
    public void sort(Comparator<Person> cmp) { Collections.sort(persons, cmp); }
    public String toString() { return persons.toString(); }
}
