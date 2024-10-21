package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeTest {

  private Module module;
  private Grade grade;

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
    // Test 11
    grade.setModule(module);
    assertEquals(module, grade.getModule());
  }
}