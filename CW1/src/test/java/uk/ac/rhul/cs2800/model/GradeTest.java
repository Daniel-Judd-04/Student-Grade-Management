package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeTest {

  @Test
  public void getScore() {
    // Test 2
    Grade grade = new Grade();
    assertEquals(6, grade.getScore());
  }

}
