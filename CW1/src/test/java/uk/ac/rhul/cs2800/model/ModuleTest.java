package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ModuleTest {

  @Test
  public void getNameTest() {
    // Test 4
    String name = "Software Engineering";

    Module module = new Module("CS2800", name, true);
    assertEquals(name, module.getName());
  }

  @Test
  public void getCodeTest() {
    // Test 7
    String code = "CS2800";

    Module module = new Module(code, "Software Engineering", true);
    assertEquals(code, module.getCode());
  }

  @Test
  public void isMncTest() {
    // Test 8
    boolean mnc = true;

    Module module = new Module("CS2800", "Software Engineering", mnc);
    assertEquals(mnc, module.isMnc());
  }

}
