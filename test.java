public class MaxFlow {
    static int minRoutes;

    public static int minimumStraightRoutes(int[][] coordinates) {
        int n = coordinates.length;
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        
        List<Set<Integer>> lines = findAllLines(coordinates);
        
        minRoutes = n; 
        boolean[] covered = new boolean[n];
        findMinCover(lines, covered, 0, 0, n);

        return minRoutes;
    }

    private static List<Set<Integer>> findAllLines(int[][] coords) {
        int n = coords.length;
        List<Set<Integer>> lines = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> line = new HashSet<>();
                line.add(i);
                line.add(j);
                
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j && isCollinear(coords[i], coords[j], coords[k])) {
                        line.add(k);
                    }
                }
                
                List<Integer> sorted = new ArrayList<>(line);
                Collections.sort(sorted);
                String lineId = sorted.toString();

                if (!seen.contains(lineId)) {
                    seen.add(lineId);
                    lines.add(line);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            Set<Integer> single = new HashSet<>();
            single.add(i);
            lines.add(single);
        }

        return lines;
    }

    private static void findMinCover(List<Set<Integer>> lines, boolean[] covered,
                                     int lineIndex, int usedLines, int n) {
        boolean allCovered = true;
        for (int i = 0; i < n; i++) {
            if (!covered[i]) {
                allCovered = false;
                break;
            }
        }

        if (allCovered) {
            minRoutes = Math.min(minRoutes, usedLines);
            return;
        }
        
        if (usedLines >= minRoutes) {
            return;
        }
        
        for (int i = lineIndex; i < lines.size(); i++) {
            Set<Integer> line = lines.get(i);
            
            List<Integer> newlyCovered = new ArrayList<>();
            for (int point : line) {
                if (!covered[point]) {
                    covered[point] = true;
                    newlyCovered.add(point);
                }
            }
            
            if (!newlyCovered.isEmpty()) {
                findMinCover(lines, covered, i + 1, usedLines + 1, n);
            }
            
            for (int point : newlyCovered) {
                covered[point] = false;
            }
        }
    }

    private static boolean isCollinear(int[] p1, int[] p2, int[] p3) {
        long dx1 = p2[0] - p1[0];
        long dy1 = p2[1] - p1[1];
        long dx2 = p3[0] - p1[0];
        long dy2 = p3[1] - p1[1];

        return dx1 * dy2 == dx2 * dy1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int coordinates_row = in.nextInt();
        int coordinates_col = in.nextInt();
        int coordinates[][] = new int[coordinates_row][coordinates_col];
        for(int idx = 0; idx < coordinates_row; idx++) {
            for(int jdx = 0; jdx < coordinates_col; jdx++) {
                coordinates[idx][jdx] = in.nextInt();
            }
        }

        int result = minimumStraightRoutes(coordinates);
        System.out.print(result);
    }
}
