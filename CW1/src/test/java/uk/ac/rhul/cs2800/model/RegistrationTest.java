package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

  private Module module;
  private Registration registration;

  @BeforeEach
  public void setUp() {
    module = new Module();
    registration = new Registration();
  }

  @Test
  public void getAndSetModuleTest() {
    // Test 5
    registration.setModule(module);
    assertEquals(module, registration.getModule());
  }
}