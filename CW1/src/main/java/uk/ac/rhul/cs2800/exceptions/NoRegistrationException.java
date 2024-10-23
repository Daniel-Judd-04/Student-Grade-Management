package uk.ac.rhul.cs2800.exceptions;

/**
 * A custom {@link Exception} class which is thrown when trying to access a
 * {@link uk.ac.rhul.cs2800.model.Grade Grade} from an unregistered
 * {@link uk.ac.rhul.cs2800.model.Module Module}.
 *
 * @author Daniel Judd
 */
public class NoRegistrationException extends Exception {

  public NoRegistrationException(String message) {
    super(message);
  }

}
