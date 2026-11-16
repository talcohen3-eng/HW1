public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        int[] visited = new int[m.length];
        int result = findShortestPathRec(m,i,j,visited);
        return result ;
    }

    private static int findShortestPathRec(int[][] m, int i, int j, int[] visited) {
        int[] this_visited = visited.clone();
        if (i==j) {
            return 0;
        }
        this_visited[i] = 1;
        int minpath = Integer.MAX_VALUE;
        for (int neib = 0; neib < m.length; neib++) {
            if (m[i][neib] == 1 && this_visited[neib] == 0) {
                int path = findShortestPathRec(m, neib, j, this_visited);
                if (path != -1) {
                    minpath = Math.min(minpath, path);
                }

            }
        }
        if (minpath == Integer.MAX_VALUE) {
            return -1;
        }
        return minpath + 1;
        
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