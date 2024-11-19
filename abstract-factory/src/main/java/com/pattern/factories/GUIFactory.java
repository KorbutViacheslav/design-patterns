package com.pattern.factories;

import com.pattern.buttons.Button;
import com.pattern.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {

  Button createButton();

  Checkbox createCheckbox();
}
