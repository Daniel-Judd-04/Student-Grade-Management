package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exceptions.NoGradeAvailableException;

/**
 * A class which stores grades and module registrations for a student.
 * <p>This class provides methods to add or retrieve grades and registrations.
 * There is also a method to compute the average grade of the student.</p>
 */
public class Student {

  private List<Grade> grades;
  private List<Registration> registrations;

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

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
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
    Registration registration = new Registration(module);
    registrations.add(registration);
  }

  public List<Registration> getRegistrations() {
    return registrations;
  }

  public Registration getRegistration(int index) {
    return registrations.get(index);
  }
}
