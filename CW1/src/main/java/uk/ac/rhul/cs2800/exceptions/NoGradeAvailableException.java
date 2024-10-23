package uk.ac.rhul.cs2800.exceptions;

/**
 * A custom {@link Exception} class which is thrown when a student has no
 * {@link uk.ac.rhul.cs2800.model.Grade Grade} or when there is no
 * {@link uk.ac.rhul.cs2800.model.Grade Grade} for a {@link uk.ac.rhul.cs2800.model.Module Module}.
 *
 * @author Daniel Judd
 */
public class NoGradeAvailableException extends Exception {

  public NoGradeAvailableException(String message) {
    super(message);
  }

}
