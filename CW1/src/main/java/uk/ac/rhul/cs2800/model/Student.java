package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

  List<Grade> grades;

  public Student() {
    this.grades = new ArrayList<>();
  }

  public float computeAverage() {
    int sum = 0;
    for (Grade grade : grades) {
      sum += grade.getScore();
    }
    return (float) sum / grades.size();
  }

  public void addGrade(Grade grade) {
    grades.add(grade);
  }

  public void registerModule(Module module) {
    // To be implemented
  }
}
