/**
 * Created by Сергей on 19.02.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Persons persons = Persons.getPersons();
        persons.addPerson(Person.getPerson(17, "Mike"));
        persons.addPerson(Person.getPerson(25, "Julia"));
        persons.addPerson(Person.getPerson(56, "Margaret"));
        persons.addPerson(Person.getPerson(49, "John"));
        persons.addPerson(Person.getPerson(14, "Rosa"));
        persons.addPerson(Person.getPerson(33, "Omar"));
        persons.addPerson(Person.getPerson(33, "Sofia"));
        persons.addPerson(Person.getPerson(33, "Konstantin"));
        System.out.println(persons);
        System.out.println();

        //Filter by age criterion
        Persons youth = persons.filter((person)-> person.getAge() >= 12 && person.getAge() <= 17);
        System.out.println(youth);

        //Sort by age than by name
        persons.sort((person1, person2) -> {
            return (person2.getAge() > person1.getAge()) ? 1 :
                   (person2.getAge() < person1.getAge()) ? -1 :
                   person1.getName().compareTo(person2.getName());
        });
        System.out.println(persons);
    }
}
