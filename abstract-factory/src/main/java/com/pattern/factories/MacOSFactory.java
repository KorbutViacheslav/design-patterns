package com.pattern.factories;

import com.pattern.buttons.Button;
import com.pattern.buttons.MacOSButton;
import com.pattern.checkboxes.Checkbox;
import com.pattern.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single
 * variety.
 */
public class MacOSFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
