package com.howtodoinjava.core.autowire.byName.test;

import lombok.ToString;

@ToString
public class C {
  private String varc;

  public String getVarc() {
    return varc;
  }

  public void setVarc(String varc) {
    System.out.println("Setting varC value in C'setter ");
    this.varc = varc;
  }

  public C(String varc) {

    this.varc = varc;
  }

  public C() {
    System.out.println("C CONSTRUCTOR");

  }
}
