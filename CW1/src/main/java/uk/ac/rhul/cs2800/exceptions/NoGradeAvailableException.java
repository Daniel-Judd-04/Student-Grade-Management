package uk.ac.rhul.cs2800.exceptions;

/**
 * A custom Exception class which indicates that a student had no stored grades.
 */
public class NoGradeAvailableException extends Exception {

  public NoGradeAvailableException(String message) {
    super(message);
  }

}
