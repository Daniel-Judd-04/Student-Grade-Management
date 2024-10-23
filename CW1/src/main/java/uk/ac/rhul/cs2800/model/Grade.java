package uk.ac.rhul.cs2800.model;

/**
 * A class which stores a grades score as an int.
 * <p>This class provides a method to retrieve the score.</p>
 *
 * @author Daniel Judd
 */
public class Grade {

  private int score;
  private Module module;

  public Grade() {

  }

  public Grade(int score, Module module) {
    this.score = score;
    this.module = module;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  //  uk.ac.rhul.cs2800.model.Grade.getModule()
  //  may expose internal representation by returning Grade.module (Medium)
  // Do I need to worry about these spotbugs?
  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
  }
}
