package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {

  @Test
  public void getAverageTest() {
    // Test 1
    Student student = new Student();
    student.addGrade(new Grade(5));
    student.addGrade(new Grade(3));
    assertEquals(4, student.computeAverage());
  }
}
