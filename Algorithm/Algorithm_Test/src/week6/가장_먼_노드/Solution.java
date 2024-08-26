package Algorithm_Test.src.week6.가장_먼_노드;

import java.util.*; // Java의 유용한 데이터 구조와 컬렉션을 사용하기 위한 import

public class Solution {
    public int solution(int n, int[][] vertex) {
        // 그래프를 인접 리스트로 표현
        List<List<Integer>> graph = new ArrayList<>();
        // 그래프 초기화: n+1 크기의 리스트를 생성하여 각 노드의 인접 리스트를 초기화
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        // 주어진 간선 정보를 그래프에 추가
        for (int[] edge : vertex) {
            graph.get(edge[0]).add(edge[1]); // a 노드의 인접 리스트에 b 노드 추가
            graph.get(edge[1]).add(edge[0]); // b 노드의 인접 리스트에 a 노드 추가 (양방향)
        }

        // BFS를 위한 큐와 방문 배열 초기화
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐 생성
        boolean[] visited = new boolean[n + 1]; // 각 노드의 방문 여부를 기록하는 배열
        int[] distance = new int[n + 1]; // 각 노드까지의 거리 기록 배열

        // 1번 노드부터 BFS 시작
        queue.add(1); // 큐에 시작 노드 1을 추가
        visited[1] = true; // 노드 1을 방문 처리
        distance[1] = 0; // 노드 1의 거리는 0

        // BFS 탐색 시작
        while (!queue.isEmpty()) { // 큐가 비어있지 않은 동안 반복
            int node = queue.poll(); // 큐에서 노드를 하나 꺼냄
            for (int neighbor : graph.get(node)) { // 현재 노드와 인접한 모든 노드 탐색
                if (!visited[neighbor]) { // 인접 노드가 아직 방문되지 않은 경우
                    visited[neighbor] = true; // 인접 노드를 방문 처리
                    distance[neighbor] = distance[node] + 1; // 현재 노드까지의 거리 + 1
                    queue.add(neighbor); // 큐에 인접 노드를 추가
                }
            }
        }

        // 최대 거리를 찾고, 그 거리와 같은 노드의 개수를 셈
        int maxDistance = 0; // 최대 거리를 저장할 변수 초기화
        for (int dist : distance) { // 모든 노드까지의 거리를 확인
            maxDistance = Math.max(maxDistance, dist); // 최대 거리 업데이트
        }

        int count = 0; // 최대 거리와 같은 노드의 개수를 세기 위한 변수
        for (int dist : distance) { // 모든 노드까지의 거리를 확인
            if (dist == maxDistance) { // 거리가 최대 거리와 같은 경우
                count++; // 카운트 증가
            }
        }

        return count; // 결과 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution(); // Solution 객체 생성
        int n = 6; // 노드의 개수
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}; // 간선 정보
        System.out.println(sol.solution(n, vertex)); // 결과를 출력 (예상 결과: 3)
    }
}

