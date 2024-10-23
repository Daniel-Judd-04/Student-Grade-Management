package uk.ac.rhul.cs2800.model;

/**
 * A class which stores a modules code, name and whether it is mandatory non-condonable.
 * <p>This class provides methods to retrieve its properties.</p>
 *
 * @author Daniel Judd
 */
public class Module {

  private String code;
  private String name;
  private boolean mnc;

  public Module() {

  }

  /**
   * Creates a Module instance with a given code, name and mnc.
   *
   * @param code The unique code of the module.
   * @param name The name of the module.
   * @param mnc  Whether the module is mandatory non-condonable.
   */
  public Module(String code, String name, boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isMnc() {
    return mnc;
  }

  public void setMnc(boolean mnc) {
    this.mnc = mnc;
  }
}
