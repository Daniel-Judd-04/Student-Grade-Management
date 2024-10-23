package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the attributes and methods of the {@link Grade} class.
 */
public class GradeTest {

  private Module module;
  private Grade grade;

  /**
   * Initialises relevant objects required before each test.
   * <p>Helps to reduce repetitive code between tests and increases consistency. Creates a
   * {@link Grade} and a {@link Module}.</p>
   */
  @BeforeEach
  public void setUp() {
    grade = new Grade();
    module = new Module();
  }

  @Test
  public void getAndSetScoreTest() {
    // Test 2
    int score = 6;
    grade.setScore(score);
    assertEquals(score, grade.getScore());
  }

  @Test
  public void getAndSetModuleTest() {
    // Test 9
    grade.setModule(module);
    assertEquals(module, grade.getModule());
  }
}