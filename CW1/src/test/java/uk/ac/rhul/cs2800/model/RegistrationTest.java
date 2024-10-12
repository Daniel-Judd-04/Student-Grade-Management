package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RegistrationTest {

  @Test
  public void getModuleTest() {
    // Test 5
    Module module = new Module();
    Registration registration = new Registration(module);
    assertEquals(module, registration.getModule());
  }

}
