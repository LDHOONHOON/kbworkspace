package Algorithm_Test.src.week5.게임맵_최단거리;

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // 행과 열의 길이를 정의
        int n = maps.length;           // 미로의 행 수
        int m = maps[0].length;        // 미로의 열 수

        // 방문 여부를 기록할 배열
        boolean[][] visited = new boolean[n][m];

        // BFS를 위한 큐 생성
        Queue<int[]> queue = new ArrayDeque<>();

        // 시작점을 큐에 추가 (위치 (0, 0)과 거리 1)
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;  // 시작점을 방문 처리

        // 이동 가능한 네 방향 (상, 하, 좌, 우)
        int[] dr = {0, 1, 0, -1};  // 행 이동 (우, 하, 좌, 상)
        int[] dc = {-1, 0, 1, 0};  // 열 이동 (좌, 상, 우, 하)

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            // 큐에서 현재 위치와 거리를 꺼냄
            int[] cur = queue.remove();
            int r = cur[0];  // 현재 행
            int c = cur[1];  // 현재 열
            int dist = cur[2];  // 현재까지의 거리

            // 목적지에 도달했는지 확인
            if (r == n - 1 && c == m - 1) {
                return dist;  // 목적지에 도달하면 거리 반환
            }

            // 네 방향으로 이동
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];  // 새로운 행 좌표
                int nc = c + dc[d];  // 새로운 열 좌표

                // 새로운 좌표가 유효한 범위 내에 있고, 이동 가능한 위치(값이 1)인지 확인
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1) {
                    // 아직 방문하지 않은 위치라면
                    if (!visited[nr][nc]) {
                        visited[nr][nc] = true;  // 새로운 위치 방문 처리
                        queue.add(new int[]{nr, nc, dist + 1});  // 큐에 새로운 위치와 거리 추가
                    }
                }
            }
        }

        // 큐가 비어버렸지만 목적지에 도달하지 못한 경우 -1 반환
        return -1;
    }
}
