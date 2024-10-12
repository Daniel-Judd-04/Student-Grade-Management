package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

  List<Grade> grades;
  List<Registration> registrations;

  public Student() {
    this.grades = new ArrayList<>();
    this.registrations = new ArrayList<>();
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
    Registration registration = new Registration(module);
    registrations.add(registration);
  }

  public List<Registration> getRegistrations() {
    return registrations;
  }

  public Registration getRegistration(int index) {
    return registrations.get(index);
  }
}
