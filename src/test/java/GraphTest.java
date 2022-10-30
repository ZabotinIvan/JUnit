import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
    @Test
    public void testAdd() {
        Graph graph = new Graph(5);
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
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        int[] marks = new int[5];
        int mark = 7;
        int v = 1;
        int expected = 3;
        int result = graph.dfs(v,mark,marks);
        assertEquals(expected,result);
    }
    @Test
    public void calcPathsTest (){
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        int[] expected = new int[5];
        expected[0] = 1;
        expected[1] = 1;
        int[] actual = graph.calcPaths();
        assertArrayEquals(expected,actual);
    }

}
