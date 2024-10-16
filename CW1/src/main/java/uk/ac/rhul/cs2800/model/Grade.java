package uk.ac.rhul.cs2800.model;

/**
 * A class which stores a grades score as an int.
 * <p>This class provides a method to retrieve the score.</p>
 */
public class Grade {

  private int score;
  private Module module;

  public Grade(int score) {
    this.score = score;
  }

  public Grade(Module module) {
    this.module = module;
  }

  public int getScore() {
    return score;
  }

  public Module getModule() {
    return module;
  }
}
