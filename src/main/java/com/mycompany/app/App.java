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

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {

  private final String message = "Hello World!";

  public App() {}

  public static void main(String[] args) {
    System.out.println(new App().getMessage());

    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      s.add(i);
      s.remove(i - 1);
    }
    System.out.println(s.size());
  }

  private final String getMessage() {
    return message;
  }

}
