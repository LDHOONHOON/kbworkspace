import java.util.*;

public class Solution {
    int[] dX = {1, -1, 0, 0}; // dX 배열은 상하좌우로 이동할 때 x좌표의 변화량을 정의합니다.
    int[] dY = {0, 0, 1, -1}; // dY 배열은 상하좌우로 이동할 때 y좌표의 변화량을 정의합니다.

    // 문제를 해결하는 메인 메소드
    public int solution(int[][] maps) {
        int answer = 0; // 정답을 저장할 변수, 초기값은 0으로 설정합니다.

        // 방문 여부를 확인하는 2차원 배열을 생성합니다. maps와 동일한 크기로 초기화합니다.
        int[][] visited = new int[maps.length][maps[0].length];

        // BFS 알고리즘을 사용하여 최단 경로를 찾습니다.
        bfs(maps, visited);
        // 목적지에 도달했을 때의 값을 answer에 저장합니다.
        answer = visited[maps.length - 1][maps[0].length - 1];

        // 만약 목적지에 도달할 수 없을 경우, answer가 0이므로 -1로 설정합니다.
        if (answer == 0) {
            answer = -1;
        }

        return answer; // 결과를 반환합니다.
    }

    // BFS 알고리즘을 구현한 메소드
    public void bfs(int[][] maps, int[][] visited) {
        int x = 0; // 시작 지점의 x좌표 (0,0)으로 초기화합니다.
        int y = 0; // 시작 지점의 y좌표 (0,0)으로 초기화합니다.
        visited[x][y] = 1; // 시작 지점을 방문했다고 표시하며, 방문 횟수를 1로 설정합니다.

        // 탐색을 위한 큐를 생성하고 시작 지점을 큐에 추가합니다.
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        // 큐가 빌 때까지 BFS 탐색을 진행합니다.
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 큐에서 현재 위치를 꺼냅니다.
            int cX = current[0]; // 현재 위치의 x좌표를 가져옵니다.
            int cY = current[1]; // 현재 위치의 y좌표를 가져옵니다.

            // 상하좌우 네 방향으로 이동을 시도합니다.
            for (int i = 0; i < 4; i++) {
                int nX = cX + dX[i]; // 새로운 x좌표를 계산합니다.
                int nY = cY + dY[i]; // 새로운 y좌표를 계산합니다.

                // 지도 범위를 벗어나는 경우는 무시합니다.
                if (nX < 0 || nX > maps.length - 1 || nY < 0 || nY > maps[0].length - 1) {
                    continue; // 다음 반복으로 넘어갑니다.
                }

                // 아직 방문하지 않았고, 이동할 수 있는 칸(값이 1인 경우 -> 벽x)이라면
                if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1; // 현재까지의 거리 + 1을 새로운 칸에 기록합니다.
                    queue.add(new int[]{nX, nY}); // 큐에 새로운 위치를 추가합니다.
                }
            }
        }
    }
}
