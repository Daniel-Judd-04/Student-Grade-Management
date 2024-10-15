package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exceptions.NoGradeAvailableException;

public class StudentTest {

  @Test
  public void computeAverageTest() throws NoGradeAvailableException {
    // Test 1
    Student student = new Student();
    student.addGrade(new Grade(5));
    student.addGrade(new Grade(3));
    assertEquals(4, student.computeAverage());
  }

  @Test
  public void registerModuleTest() {
    // Test 3
    Student student = new Student();
    Module module = new Module();
    student.registerModule(module);
    assertEquals(1, student.getRegistrations().size());
    assertEquals(module, student.getRegistration(0).getModule());
  }

  @Test
  public void computeAverageNoGradeTest() {
    // Test 6
    Student student = new Student();
    assertThrows(NoGradeAvailableException.class, student::computeAverage);
  }

  @Test
  public void constructStudentFieldsTest() {
    // Test 9
    long id = 1234L;
    String firstName = "John";
    String lastName = "Smith";
    String username = "john_smith";
    String email = "john.smith@gmail.com";

    Student student = new Student(id, firstName, lastName, username, email);

    assertEquals(id, student.getId());
    assertEquals(firstName, student.getFirstName());
    assertEquals(lastName, student.getLastName());
    assertEquals(username, student.getUsername());
    assertEquals(email, student.getEmail());
  }
}
