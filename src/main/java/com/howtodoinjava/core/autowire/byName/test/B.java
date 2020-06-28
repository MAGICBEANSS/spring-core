package com.howtodoinjava.core.autowire.byName.test;

import lombok.ToString;

@ToString
public class B {
  String varb;
  C c;

  public B(C c) {
    this.c = c;
  }

  public B(String varb) {
    this.varb = varb;
  }

  public String getVarb() {
    return varb;
  }

  public void setVarb(String varb) {
    System.out.println("Setting varb value in B's setter ");
    this.varb = varb;
  }

  public void setC(C c) {
    System.out.println("Setting c value in B' setter ");
    this.c = c;
  }

  public B() {
    System.out.println("B CONSTRUCTOR");

  }
}
