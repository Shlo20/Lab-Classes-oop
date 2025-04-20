
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    public Instructor(String name, String contact)
    {
        super(name, contact);
    }

    @Override
    public void print()
    {
        System.out.println("Instructor: " + getName() + ", Contact: " + getContact());
    }
    
    @Override
    public String toString() {
        return getName(); 
    }
}
