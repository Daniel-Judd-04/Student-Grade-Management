package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exceptions.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exceptions.NoRegistrationException;

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

  @Test
  public void getGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 10
    Module module = new Module();
    Grade grade = new Grade(module);
    Student student = new Student();
    student.registerModule(module);
    student.addGrade(grade);

    assertEquals(grade, student.getGrade(module));
  }

  @Test
  public void getGradeNoGradeTest() {
    // Test 12
    Module module = new Module();
    Student student = new Student();
    student.registerModule(module);

    assertThrows(NoGradeAvailableException.class, () -> student.getGrade(module));
  }

  @Test
  public void getGradeNoRegistrationTest() {
    // Test 13
    Module module = new Module();
    Grade grade = new Grade(module);
    Student student = new Student();
    student.addGrade(grade);

    assertThrows(NoRegistrationException.class, () -> student.getGrade(module));

  }
}
