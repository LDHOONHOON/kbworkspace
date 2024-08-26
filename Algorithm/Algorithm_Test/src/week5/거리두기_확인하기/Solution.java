package Algorithm_Test.src.week5.거리두기_확인하기;

import java.util.ArrayDeque; // 큐를 사용하기 위해 ArrayDeque를 임포트
import java.util.Queue; // Queue 인터페이스를 사용하기 위해 임포트
import java.util.*;

// BFS
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length]; // 결과를 저장할 배열 생성, 각 대기실의 거리두기 준수 여부를 저장

        // 각 대기실 별로 거리두기 준수 여부를 확인
        for (int i = 0; i < answer.length; i++) {
            // check 메서드를 호출하여 해당 대기실의 거리두기 준수 여부를 확인
            if (check(places[i]))
                answer[i] = 1; // 거리두기를 지키면 1
            else
                answer[i] = 0; // 거리두기를 지키지 않으면 0
        }
        return answer; // 결과 배열 반환
    }

    boolean check(String[] place) {
        // 5x5 대기실의 모든 좌표를 순회
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                // 응시자(P) 위치마다 BFS를 수행
                if (place[r].charAt(c) == 'P') {
                    // BFS를 통해 거리두기 준수 여부를 확인, 준수하지 않으면 false 반환
                    if (!bfs(r, c, place))
                        return false;
                }
            }
        }
        // 모든 응시자 위치에서 거리두기를 준수하면 true 반환
        return true;
    }

    boolean bfs(int r, int c, String[] place) {
        // 이동 방향 배열 (우, 하, 좌, 상)
        final int[] dr = { 0, 1, 0, -1 };
        final int[] dc = { 1, 0, -1, 0 };
        // 방문 여부를 체크하기 위한 배열
        boolean[][] visited = new boolean[5][5];
        // BFS를 위한 큐 선언, 시작점과 거리를 큐에 추가
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{ r, c, 0 }); // 시작 좌표와 거리(0)을 큐에 추가
        visited[r][c] = true; // 시작 좌표를 방문 처리

        // 큐가 빌 때까지 BFS 수행
        while (!queue.isEmpty()) {
            int[] cur = queue.remove(); // 큐에서 현재 좌표와 거리를 꺼냄
            // 거리가 2 이상이면 더 이상 탐색하지 않음
            if (cur[2] >= 2) continue;

            // 4방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i]; // 다음 행
                int nc = cur[1] + dc[i]; // 다음 열
                int ndist = cur[2] + 1; // 현재 거리 + 1

                // 새로운 좌표가 범위 내에 있고 파티션(X)이 아닌 경우
                if (inRange(nr, nc) && place[nr].charAt(nc) != 'X') {
                    // 해당 좌표를 방문하지 않았을 경우
                    if (!visited[nr][nc]) {
                        // 거리두기를 준수하지 않았기 때문에 false 반환
                        if (place[nr].charAt(nc) == 'P')
                            return false;
                        // 큐에 다음 좌표와 거리를 추가하고 방문 처리
                        queue.add(new int[]{ nr, nc, ndist });
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        // 모든 탐색이 끝나면 true 반환
        return true;
    }

    // 주어진 좌표가 5x5 범위 내에 있는지 확인
    boolean inRange(int r, int c) {
        return (r >= 0) && (r < 5) && (c >= 0) && (c < 5); // 0 <= r, c < 5 인지 확인
    }
}



// DFS

//class Solution {
//    // 이동 방향 배열 (우, 하, 좌, 상)
//    int[] dr = { 0, 1, 0, -1 };
//    int[] dc = { 1, 0, -1, 0 };
//
//    public int[] solution(String[][] places) {
//        int[] answer = new int[places.length]; // 결과를 저장할 배열 생성, 각 대기실의 거리두기 준수 여부를 저장
//
//        // 각 대기실 별로 거리두기 준수 여부를 확인
//        for (int i = 0; i < answer.length; i++) {
//            // check 메서드를 호출하여 해당 대기실의 거리두기 준수 여부를 확인
//            if (check(places[i]))
//                answer[i] = 1; // 거리두기를 지키면 1
//            else
//                answer[i] = 0; // 거리두기를 지키지 않으면 0
//        }
//        return answer; // 결과 배열 반환
//    }
//
//    boolean check(String[] place) {
//        // 5x5 대기실의 모든 좌표를 순회
//        for (int r = 0; r < 5; r++) {
//            for (int c = 0; c < 5; c++) {
//                // 응시자(P) 위치마다 DFS를 수행
//                if (place[r].charAt(c) == 'P') {
//                    // DFS를 통해 거리두기 준수 여부를 확인, 준수하지 않으면 false 반환
//                    if (!dfs(r, c, place, new boolean[5][5], 0))
//                        return false;
//                }
//            }
//        }
//        // 모든 응시자 위치에서 거리두기를 준수하면 true 반환
//        return true;
//    }
//
//    boolean dfs(int r, int c, String[] place, boolean[][] visited, int depth) {
//        // 탐색 깊이가 2 이상이면 더 이상 탐색하지 않음
//        if (depth >= 2) return true;
//
//        visited[r][c] = true; // 현재 위치를 방문 처리
//        // 4방향으로 이동
//        for (int i = 0; i < 4; i++) {
//            int nr = r + dr[i]; // 다음 행
//            int nc = c + dc[i]; // 다음 열
//            // 새로운 좌표가 범위 내에 있고 파티션(X)이 아닌 경우
//            if (inRange(nr, nc) && place[nr].charAt(nc) != 'X') {
//                // 해당 좌표를 방문하지 않았을 경우
//                if (!visited[nr][nc]) {
//                    // 거리두기를 준수하지 않았기 때문에 false 반환
//                    if (place[nr].charAt(nc) == 'P')
//                        return false;
//                    // 다음 좌표로 DFS를 수행, 거리두기를 준수하지 않으면 false 반환
//                    if (!dfs(nr, nc, place, visited, depth + 1))
//                        return false;
//                }
//            }
//        }
//        // 모든 탐색이 끝나면 true 반환
//        return true;
//    }
//
//    // 주어진 좌표가 5x5 범위 내에 있는지 확인
//    boolean inRange(int r, int c) {
//        return (r >= 0) && (r < 5) && (c >= 0) && (c < 5); // 0 <= r, c < 5 인지 확인
//    }
//}