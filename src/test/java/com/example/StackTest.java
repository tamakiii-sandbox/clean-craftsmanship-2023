import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Stack;

public class StackTest {
  @Test
  public void canCreateStack() {
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  }
}
