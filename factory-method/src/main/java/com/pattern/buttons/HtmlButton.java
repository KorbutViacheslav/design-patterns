package com.pattern.buttons;

/**
 * Windows button implementation.
 */
public class HtmlButton implements Button {

  @Override
  public void render() {
    System.out.println("<button>Test</button>");
  }

  @Override
  public void onClick() {
    System.out.println("Click! Button says - 'Hello World!'");
  }
}
