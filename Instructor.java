
/**
 * The Instructor class represents a lab instructor and extends the Person class.
 * It inherits the instructor's name and contact information from the Person superclass.
 * This class overrides the print and toString methods for custom output.

 * @author Shlomo
 * @version 2025.04.20
 */

public class Instructor extends Person
{

    //Constructs a new Instructor with the specified name and contact details
    public Instructor(String name, String contact)
    {
        super(name, contact);
    }

    @Override
    public void print()
    {
        System.out.println("Instructor: " + getName() + ", Contact: " + getContact());
    }

    //Returns a string representation of the instructor using only their name.
    @Override
    public String toString() {
        return getName(); 
    }
}
