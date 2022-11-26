package com.example.jenkinsdemo;


import org.junit.jupiter.api.Test;
import org.testng.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
@Test
  public void myFirstTest() {
  assertEquals(2,1+1);
}

@Test
@Ignore("for some reason")
public void anotherTest() {
  assertEquals(0, 1+1);
}
}
