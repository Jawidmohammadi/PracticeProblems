import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemsTest {

  int expected = 2;

  String input = "a z z";

  Problems problems = new Problems();



  @Test
  void countYZ() {



    assertEquals(expected, problems.countYZ(input));

  }
}