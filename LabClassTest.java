import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains tests for the LabClass program.
 * It checks if students can be enrolled, if capacity is respected,
 * and if the instructor can be set correctly.
 */
public class LabClassTest
{
    private LabClass lab;

    /**
     * Runs before each test. Sets up a LabClass with space for 2 students.
     */
    @Before
    public void setUp()
    {
        lab = new LabClass(2);
        System.out.println("\n[Setup] Created LabClass with capacity 2.");
    }

    /**
     * Test enrolling a single student.
     */
    @Test
    public void testEnrollOneStudent()
    {
        Student s1 = new Student("Alice", "alice@school.com", "S101");
        lab.enrollStudent(s1);

        // Check that the number of students is now 1
        assertEquals(1, lab.numberOfStudents());
        System.out.println("testEnrollOneStudent passed.");
    }

    /**
     * Test that the class does not allow more than 2 students.
     */
    @Test
    public void testMaxCapacity()
    {
        Student s1 = new Student("Alice", "alice@school.com", "S101");
        Student s2 = new Student("Bob", "bob@school.com", "S102");
        Student s3 = new Student("Charlie", "charlie@school.com", "S103");

        lab.enrollStudent(s1);
        lab.enrollStudent(s2);
        lab.enrollStudent(s3);

        // The number of enrolled students should still be 2
        assertEquals(2, lab.numberOfStudents());
        System.out.println("testMaxCapacity passed.");
    }

    /**
     * Test assigning an instructor to the lab.
     */
    @Test
    public void testSetInstructor()
    {
        Instructor instructor = new Instructor("Dr. Lumen", "lumen@pace.edu");
        lab.setInstructor(instructor);

        // check name match
        assertEquals("Dr. Lumen", instructor.getName());
        System.out.println("testSetInstructor passed.");
    }
}
