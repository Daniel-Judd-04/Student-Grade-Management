package uk.ac.rhul.cs2800.exceptions;

/**
 * A custom Exception class which is thrown when trying to access a grade for an unregistered
 * module.
 */
public class NoRegistrationException extends Exception {

  public NoRegistrationException(String message) {
    super(message);
  }

}
