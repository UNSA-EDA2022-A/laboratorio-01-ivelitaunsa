package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExercise2 {

  Exercise2 obj = new Exercise2();

  @Test
  public void case_1() {

    int a[] = {10, 12, 23, 40, 65, 78, 100};

    int result = obj.getMenorNumeroSaltos(a);

    assertEquals(result, 3);
  }

  @Test
  public void case_2() {

    int a[] = {23, 50, 60, 90, 170, 180, 200};

    int result = obj.getMenorNumeroSaltos(a);

    assertEquals(result, -1);    
  }

  @Test
  public void case_3() {

    int a[] = {10, 25, 40, 70, 93, 140, 180};

    int result = obj.getMenorNumeroSaltos(a);

    assertEquals(result, 5);  
  }

  @Test
  public void case_4() {

    int a[] = {5, 16, 20, 27, 40, 70, 90};

    int result = obj.getMenorNumeroSaltos(a);

    assertEquals(result, 2);  
  }

}
