import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
Graph graph = new Graph(5);
    @Test
    public void testAdd() {
    int a = 1;
    int b = 2;
    ArrayList<Integer>[] expected = new ArrayList[5];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = new ArrayList<>();
        }
    expected[1].add(2);
    expected[2].add(1);
    ArrayList<Integer>[] result = graph.addEdge(a,b);
    assertArrayEquals(expected,result);
    }
    @Test
    public void dfsTest (){
        int[] marks = new int[5];
        int mark = 7;
        int v = 1;
        int expected = 1;
        int result = graph.dfs(v,mark,marks);
        assertEquals(expected,result);
    }
    @Test
    public void calcPathsTest (){
        int[] expected;
        expected = new int[5];
        int[] actual = graph.calcPaths();
        assertArrayEquals(expected,actual);
    }

}
