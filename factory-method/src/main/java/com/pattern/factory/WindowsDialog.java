package com.pattern.factory;

import com.pattern.buttons.Button;
import com.pattern.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
