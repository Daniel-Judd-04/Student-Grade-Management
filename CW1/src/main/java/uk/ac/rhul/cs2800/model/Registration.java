package uk.ac.rhul.cs2800.model;

/**
 * A class to store a registrations associated module.
 * <p>This class provides a method to retrieve the module.</p>
 *
 * @author Daniel Judd
 */
public class Registration {

  private Module module;

  public Registration() {

  }

  public Registration(Module module) {
    this.module = module;
  }

  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
  }
}
