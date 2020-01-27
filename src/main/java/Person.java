public class Person {

    private String firstname;
    private int age;

    public Person(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    } // end of constructor

    public String getFirstname() {
        return this.firstname;
    } // end of getFirstname

    public int getAge() {
        return this.age;
    } // end of getAge
} // end of class Person