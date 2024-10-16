package uk.ac.rhul.cs2800.exceptions;

/**
 * A custom Exception class which is thrown when a student has no grades or that there is no grade
 * for a specific module.
 */
public class NoGradeAvailableException extends Exception {

  public NoGradeAvailableException(String message) {
    super(message);
  }

}
