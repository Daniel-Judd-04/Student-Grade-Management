package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ModuleTest {

  @Test
  public void getNameTest() {
    // Test 4
    Module module = new Module("Software Engineering");
    assertEquals("Software Engineering", module.getName());
  }

}
