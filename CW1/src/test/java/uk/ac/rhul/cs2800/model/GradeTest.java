package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeTest {

  @Test
  public void getScoreTest() {
    // Test 2
    Grade grade = new Grade(6);
    assertEquals(6, grade.getScore());
  }

}
