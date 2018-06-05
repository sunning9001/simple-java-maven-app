/*******************************************************************************
 * Copyright 2018 sunning
 * 
 * Licensed under the SUNNING, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.baidu.com
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @Test
  public void testAppConstructor() {
    try {
      new App();
    } catch (Exception e) {
      fail("Construction failed.");
    }
  }

  @Test
  public void testAppMain() {
    App.main(null);
    try {
      assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
    } catch (AssertionError e) {
      fail("\"message\" is not \"Hello World!\"");
    }
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }

}
