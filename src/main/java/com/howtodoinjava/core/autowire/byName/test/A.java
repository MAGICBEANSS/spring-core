package com.howtodoinjava.core.autowire.byName.test;

import lombok.Data;
import lombok.ToString;

@ToString
public class A {
    String varA ;
    B b;

  public void setB(B b) {
    System.out.println("Setting b value in A's setter ");
    this.b = b;
  }

  public String getVarA() {
    return varA;
  }

  public B getB() {
    return b;
  }

  public void setVarA(String varA) {
    System.out.println("Setting varA value in A's setter ");

    this.varA = varA;
  }

  public A() {
    System.out.println("A CONSTRUCTOR");
  }

  public A(B b) {
    System.out.println("A  b = CONSTRUCTOR");
    this.b = b;
  }

}
