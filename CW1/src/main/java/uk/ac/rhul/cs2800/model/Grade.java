package uk.ac.rhul.cs2800.model;

/**
 * A class which stores a grades score as an int.
 * <p>This class provides a method to retrieve the score.</p>
 */
public class Grade {

  private int score;

  public Grade(int score) {
    this.score = score;
  }

  public int getScore() {
    return score;
  }
}
