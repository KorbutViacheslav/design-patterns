package com.pattern;

import com.pattern.app.Application;
import com.pattern.factories.GUIFactory;
import com.pattern.factories.MacOSFactory;
import com.pattern.factories.WindowsFactory;

/**
 * Main class. Everything comes together here.
 */
public class Main {

  /**
   * Application picks the factory type and creates it in run time (usually at initialization
   * stage), depending on the configuration or environment variables.
   */
  private static Application configureApplication() {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacOSFactory();
    } else {
      factory = new WindowsFactory();
    }
    app = new Application(factory);
    return app;
  }

  public static void main(String[] args) {
    Application app = configureApplication();
    app.paint();
  }

}
