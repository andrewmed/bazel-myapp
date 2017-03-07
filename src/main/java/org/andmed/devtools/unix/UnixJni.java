package org.andmed.devtools.unix;

import java.io.File;

public class UnixJni {
  public static void loadJni() {
    try {
        System.loadLibrary("unix");
    } catch (UnsatisfiedLinkError ex) {
//       We are probably in tests, let's try to find the library relative to where we are.
      File cwd = new File(System.getProperty("user.dir"));
      String libunix = "src" + File.separator + "main" + File.separator + "native" + File.separator
          + System.mapLibraryName("unix");
      File toTest = new File(cwd, libunix);
      if (toTest.exists()) {
        System.load(toTest.toString());
      } else {
        throw ex;
      }
    }
  }
  public static native int dummy();
}
