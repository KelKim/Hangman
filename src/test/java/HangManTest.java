import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HangmanTest {

  @Test
  public void runHangMan_selectedFruit_ArrayList() {
    HangMan testHangMan = new HangMan();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testHangMan.runHangMan(1));
  }

}