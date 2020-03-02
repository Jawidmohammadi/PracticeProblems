import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemsTest {

  int expected = 3;

  String input = " z z";

  Problems problems = new Problems();



  @Test
  void countYZ() {



    assertEquals(expected, problems.countYZ(input));

  }
}