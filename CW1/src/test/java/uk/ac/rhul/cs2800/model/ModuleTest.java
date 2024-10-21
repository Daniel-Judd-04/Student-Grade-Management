package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModuleTest {

  private Module module;

  @BeforeEach
  public void setUp() {
    module = new Module();
  }

  @Test
  public void gettersAndSettersTest() {
    // Test 4
    String code = "CS2800";
    String name = "Software Engineering";
    boolean mnc = true;

    module.setCode(code);
    module.setName(name);
    module.setMnc(mnc);

    assertEquals(code, module.getCode());
    assertEquals(name, module.getName());
    assertEquals(mnc, module.isMnc());
  }
}