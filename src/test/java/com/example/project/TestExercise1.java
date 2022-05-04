package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExercise1 {

  Exercise1 obj = new Exercise1();

  @Test
  public void case_1() {

    String result = obj.convertirBaseGabriel(1010);

    assertEquals(result, "18");    
  }

  @Test
  public void case_2() {

    String result = obj.convertirBaseGabriel(1020);

    assertEquals(result, "21");    
  }

  @Test
  public void case_3() {

    String result = obj.convertirBaseGabriel(21);

    assertEquals(result, "El numero proporcionado no esta en base Gabriel.");    
  }

}
