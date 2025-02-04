package Algorithm_Test.src.week6.가장_먼_노드;

import java.util.*;

public class Solution1 {
    public int solution(int n, int[][] edge) {
        //인접 리스트로 변환
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        //  bfs(1) 호출
        return bfs(graph, 1, n);
    }
    int bfs(Map<Integer, List<Integer>> graph, int startVertex, int n) {
        // 시작점 예약
        int maxDist = -1;
        int count = 0;

        boolean[] visited = new boolean[n+1];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startVertex, 0});
        // bfs는 항상 예약하고 방문
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            // 현재 노드 방문
            int[] cur = queue.poll();
            int curVertex = cur[0];
            int dist = cur[1];

            if (maxDist < dist) {
                maxDist = dist;
                count = 0;
            }
            count ++;

            // 다음 노드 예약
            for (int nextVertex: graph.get(curVertex)) {
                if (!visited[nextVertex]) {
                    queue.offer(new int[]{nextVertex, dist+1});
                    visited[nextVertex] = true;
                }
            }
        }
        return count;

    }
}
