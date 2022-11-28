package com.example.jenkinsdemo;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.allOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleTest {
@Test
  public void myFirstTest() {
  assertEquals(2,1+1);
  assertNull(null);
  assertNotNull(this);
  assertSame("foo","foo");
}



@Test
public void anotherTest() {
  assertEquals(0, 1+1);
}
}
