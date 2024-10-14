package uk.ac.rhul.cs2800.model;

public class Module {

  private String code;
  private String name;
  private boolean mnc;

  public Module() {
    
  }

  public Module(String code, String name, boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public boolean isMnc() {
    return mnc;
  }
}
