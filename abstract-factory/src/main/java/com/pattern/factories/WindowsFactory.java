package com.pattern.factories;

import com.pattern.buttons.Button;
import com.pattern.buttons.WindowsButton;
import com.pattern.checkboxes.Checkbox;
import com.pattern.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single
 * variety.
 */
public class WindowsFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
