package com.stan.employee;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatherPos = scanner.nextInt();
        int martinPos = scanner.nextInt();
        int velFather = scanner.nextInt();
        int steps = scanner.nextInt();

        int maxCommonSteps = 0;
        int bestVelocity = 1;

        for (int v2 = 1; v2 <= 10000; v2++) {
            int commonSteps = calculateCommonFootsteps(fatherPos, martinPos, velFather, v2, steps);
            if (commonSteps > maxCommonSteps ||
                    (commonSteps == maxCommonSteps && v2 > bestVelocity)) {
                maxCommonSteps = commonSteps;
                bestVelocity = v2;
            }
        }

        System.out.println(maxCommonSteps + " " + bestVelocity);
        scanner.close();
    }

    private static int calculateCommonFootsteps(int fatherPos, int martinPos, int velFather, int velMartin, int totalSteps) {
        Set<Integer> fatherFootsteps = new HashSet<>();

        for (int step = 0; step <= totalSteps; step++) {
            fatherFootsteps.add(fatherPos + velFather * step);
        }

        Set<Integer> commonFootsteps = new HashSet<>();
        int maxStepsNeeded = 10000;

        for (int step = 0; step <= maxStepsNeeded; step++) {
            int martinCurrentPos = martinPos + velMartin * step;
            if (fatherFootsteps.contains(martinCurrentPos)) {
                commonFootsteps.add(martinCurrentPos);
            }
        }

        return commonFootsteps.size();
    }
    }


--------------------------------------------------
package com.stan.employee;

import java.util.*;

public class MaxFlow {

        static class Edge {
            int to, capacity;

            Edge(int to, int capacity) {
                this.to = to;
                this.capacity = capacity;
            }
        }

        static List<List<Edge>> graph;
        static boolean[] visited;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();
            int baseR = scanner.nextInt();
            int numCon = scanner.nextInt();
            int charCon = scanner.nextInt();

            graph = new ArrayList<>();
            for (int i = 0; i <= num; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < numCon; i++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                int rate = scanner.nextInt();

                // 添加双向边
                graph.get(start).add(new Edge(end, rate));
                graph.get(end).add(new Edge(start, rate));
            }

            // 计算最大流量
            visited = new boolean[num + 1];
            int result = calculateMaxFlow(baseR, -1);

            System.out.println(result);
            scanner.close();
        }

        static int calculateMaxFlow(int node, int parent) {
            int totalCapacity = 0;

            // 遍历所有相邻节点（子节点）
            for (Edge edge : graph.get(node)) {
                if (edge.to != parent) {
                    // 递归计算子树的最大流量
                    int subTreeFlow = calculateMaxFlow(edge.to, node);

                    // 子树的实际流量受边容量限制
                    int actualFlow = Math.min(edge.capacity, subTreeFlow);
                    totalCapacity += actualFlow;
                }
            }

            if (totalCapacity == 0) {
                return 1000000;
            }
            return totalCapacity;
        }

}

