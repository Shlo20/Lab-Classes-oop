
/**
 * The Person class serves as a base class for all people in the system,
 * such as students and instructors. It stores common personal information
 * including name and contact details.
 *
 * This class is intended to be extended by more specific types of people.
 *
 * @author Shlomo
 * @version 2025.04.19
 */

public class Person
{
    protected String Name;
    protected String Contact;

    //Constructs a new Person with the specified name and contact information.
    public Person(String name,String contact){
       this.Name = name;
       this.Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public void changeName(String replacementName)
    {
        Name = replacementName;
    }

    //Updates the contact information for this person
    public void setContact(String newContact)
    {
        Contact = newContact;
    }
    
    public void print() {
        System.out.println("Name: " + Name + ", Contact: " + Contact);
    }
}
