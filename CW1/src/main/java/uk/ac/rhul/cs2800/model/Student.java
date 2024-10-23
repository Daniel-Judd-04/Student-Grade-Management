package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exceptions.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exceptions.NoRegistrationException;

/**
 * A class which stores grades and module registrations for a student.
 * <p>
 * This class provides methods to add or retrieve grades and registrations. There is also a method
 * to compute the average grade of the student.
 * </p>
 *
 * @author Daniel Judd
 */
public class Student {

  private final List<Grade> grades;
  private final List<Registration> registrations;

  private long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;

  public Student() {
    this.grades = new ArrayList<>();
    this.registrations = new ArrayList<>();
  }

  /**
   * Creates a student with a given id, first name, last name, username and email.
   *
   * @param id        A long which represents the id of the student.
   * @param firstName A String which represents the first name of the student.
   * @param lastName  A String which represents the last name of the student.
   * @param username  A String which represents the username of the student.
   * @param email     A String which represents the email of the student.
   */
  public Student(long id, String firstName, String lastName, String username, String email) {
    this();

    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  /**
   * Computes the average grade for the student using the scores.
   *
   * @return The average grade as a float.
   * @throws NoGradeAvailableException If the student has no recorded grades.
   */
  public float computeAverage() throws NoGradeAvailableException {
    if (grades.isEmpty()) {
      throw new NoGradeAvailableException(
          "Can not compute average grade for student, as grades is empty.");
    }

    int sum = 0;
    for (Grade grade : grades) {
      sum += grade.getScore();
    }
    return (float) sum / grades.size();
  }

  public void registerModule(Module module) {
    registrations.add(new Registration(module));
  }

  public List<Registration> getRegistrations() {
    return registrations;
  }

  public Registration getRegistration(int index) {
    return registrations.get(index);
  }

  /**
   * Gets the grade associated with the given module.
   * <p>First checks if the module is registered with the student. Then attempts to find an
   * associated grade with the module.</p>
   *
   * @param module The module to be searched.
   * @return The grade associated with the given module.
   * @throws NoGradeAvailableException Thrown if there is no available grade for the given module.
   * @throws NoRegistrationException   Thrown if the given module is unregistered.
   */
  public Grade getGrade(Module module) throws NoGradeAvailableException, NoRegistrationException {
    if (isRegistered(module)) {
      for (Grade grade : grades) {
        if (grade.getModule().equals(module)) {
          return grade;
        }
      }
      throw new NoGradeAvailableException("No Grade available for given module.");
    } else {
      throw new NoRegistrationException("Can not access grades for unregistered modules.");
    }
  }

  private boolean isRegistered(Module module) {
    for (Registration registration : registrations) {
      if (registration.getModule().equals(module)) {
        return true;
      }
    }
    return false;
  }
}
