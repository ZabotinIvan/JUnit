import java.util.ArrayList;
import java.util.List;

public class Graph {
        int V;
        ArrayList<Integer>[] verticesInfo;


        public Graph(int V) {
            this.V = V;
            verticesInfo = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                verticesInfo[i] = new ArrayList<>();
            }
        }

        ArrayList<Integer>[] addEdge(int a, int b) {
            verticesInfo[a].add(b);
            verticesInfo[b].add(a);
            return verticesInfo;
        }

        List<Integer> adjacent(int v) {
            return verticesInfo[v];
        }

        int dfs(int v, int mark, int[] marks) {
            marks[v] = mark;
            int size = 1;
            for (int vv : adjacent(v)) {
                if (marks[vv] == 0 ) {
                    size += dfs(vv, mark, marks);
                }
            }
            return size;
        }

        int[] calcPaths (){
            int[] marks = new int[V];
            int mark = 7;
            int[] markSizes = new int[V];
            int[] answer = new int[V];
            for (int v = 0; v < V; v++) {
                if (marks[v] == 0) {
                    int size = dfs(v, mark, marks);
                    markSizes[v] = size;
                    marks = new int[V];
                }
            }
            for (int i = 0 ; i < V; i++) {
                answer[i] = markSizes[i]-1;
            }

            return answer;

        }

    }
