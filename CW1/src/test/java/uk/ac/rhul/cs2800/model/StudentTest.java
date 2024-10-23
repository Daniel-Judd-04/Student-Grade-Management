package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exceptions.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exceptions.NoRegistrationException;

/**
 * Tests the attributes and methods of the {@link Student} class.
 */
public class StudentTest {

  private Student student;
  private Module module1;
  private Module module2;
  private Grade grade1;
  private Grade grade2;

  /**
   * Initialises relevant objects required before each test.
   * <p>Helps to reduce repetitive code between tests and increases consistency. Creates a
   * {@link Student},
   * two {@link Module}s and two {@link Grade}s.</p>
   */
  @BeforeEach
  public void setUp() {
    student = new Student();
    module1 = new Module("CS2800", "Software Engineering", true);
    module2 = new Module("CS2855", "Databases", true);
    grade1 = new Grade(5, module1);
    grade2 = new Grade(3, module2);
  }

  // Does computeAverageTest need to throw NoRegistrationException?
  // Will I be penalised for back tracking commits or too many commits? Do I need to use Issues?

  @Test
  public void computeAverageTest() throws NoGradeAvailableException {
    // Test 1
    student.addGrade(grade1);
    student.addGrade(grade2);
    assertEquals(4, student.computeAverage());
  }

  @Test
  public void registerModuleTest() {
    // Test 3
    student.registerModule(module1);
    assertEquals(1, student.getRegistrations().size());
    assertEquals(module1, student.getRegistration(0).getModule());
  }

  @Test
  public void computeAverageNoGradeTest() {
    // Test 6
    assertThrows(NoGradeAvailableException.class, student::computeAverage);
  }

  @Test
  public void gettersAndSettersTest() {
    // Test 7
    long id = 1234L;
    String firstName = "John";
    String lastName = "Smith";
    String username = "john_smith";
    String email = "john.smith@gmail.com";

    student.setId(id);
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setUsername(username);
    student.setEmail(email);

    assertEquals(id, student.getId());
    assertEquals(firstName, student.getFirstName());
    assertEquals(lastName, student.getLastName());
    assertEquals(username, student.getUsername());
    assertEquals(email, student.getEmail());
  }

  @Test
  public void getGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    // Test 8
    student.registerModule(module1);
    student.addGrade(grade1);

    assertEquals(grade1, student.getGrade(module1));
  }

  @Test
  public void getGradeNoGradeTest() {
    // Test 10
    student.registerModule(module1);

    assertThrows(NoGradeAvailableException.class, () -> student.getGrade(module1));
  }

  @Test
  public void getGradeNoRegistrationTest() {
    // Test 11
    student.addGrade(grade1);

    assertThrows(NoRegistrationException.class, () -> student.getGrade(module1));

  }

  @Test
  public void getGradeWithMultipleGradesAndModulesTest()
      throws NoRegistrationException, NoGradeAvailableException {
    // Test 12
    student.registerModule(module1);
    student.registerModule(module2);

    student.addGrade(grade1);
    student.addGrade(grade2);

    assertEquals(grade1, student.getGrade(module1));
    assertEquals(grade2, student.getGrade(module2));
  }

  @Test
  public void constructorTest() {
    // Test 13
    long id = 1234L;
    String firstName = "John";
    String lastName = "Smith";
    String username = "john_smith";
    String email = "john.smith@gmail.com";

    Student student1 = new Student(id, firstName, lastName, username, email);

    assertEquals(id, student1.getId());
    assertEquals(firstName, student1.getFirstName());
    assertEquals(lastName, student1.getLastName());
    assertEquals(username, student1.getUsername());
    assertEquals(email, student1.getEmail());
  }
}
