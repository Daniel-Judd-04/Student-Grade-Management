package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the attributes and methods of the {@link Registration} class.
 */
public class RegistrationTest {

  private Module module;
  private Registration registration;

  /**
   * Initialises relevant objects required before each test.
   * <p>Helps to reduce repetitive code between tests and increases consistency. Creates a
   * {@link Registration} and a {@link Module}.</p>
   */
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