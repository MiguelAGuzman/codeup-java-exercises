import java.util.Arrays;

public class ArraysExercises {
    //Create a static method named addPerson. It should accept an
    // array of "Person" objects, as well as a single person object
    // to add to the passed array. It should return an array whose
    // length is 1 greater than the passed array, with the passed
    // person object at the end of the array.
    public static Person[] addPerson (Person [] newPerson, Person newName) {
        Person [] newArray = Arrays.copyOf(newPerson, newPerson.length + 1);
        newArray[newPerson.length] = newName;
        return newArray;
    }

    public static void main(String[] args) {
        //create 3 "Person" objects and assign a new instance of the
        // "Person" class to each element
        Person [] persons = {new Person("Bob Smith"),
                new Person("Jill Williams"),
                new Person("Miguel Guzman")};
        //Iterate through the array and print out each person's name
        for (Person getPerson : persons) {
            System.out.println(getPerson.getName());
        }

        Person [] newPersonJack = addPerson(persons, new Person("Jack"));
        for (Person getJack : newPersonJack) {
            System.out.println(getJack.getName());
        }

    }


}
