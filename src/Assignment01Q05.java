public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        if (i == j) {
            return 0;
        }
        int[] visited = new int[m.length];
        visited[i] = 1;
        int[] current_layer = new int[m.length];
        current_layer[i] = 1;
        boolean found_way = false;
        int path_length = 0;
        while(path_length < m.length-1 && found_way == false) {
            int[] next_layer = new int[m.length];
            for (int k = 0; k < m.length; k++) {

                if (current_layer[k] == 1) {
                    for (int neib = 0; neib < m.length; neib++) {
                        if (m[k][neib] == 1 && visited[neib] == 0) {
                            if (neib == j) {
                                found_way = true;
                            }
                            else {
                                next_layer[neib] = 1;
                                visited[k] = 1;
                            }
                        }
                    }          
                }
            }
            current_layer = next_layer;
            path_length++;
        }
        if (found_way == false) {
            return -1;
        }
        else {
            return path_length;

        }
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}