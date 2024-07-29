package Algorithm_Test.src.week5.Shortest_Path_in_Binary_Matrix;

import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // 행과 열의 길이 정의
        int rowLength = grid.length;
        int colLength = grid[0].length;

        // 방문 여부를 기록할 배열
        boolean[][] visited = new boolean[rowLength][colLength];

        // 8방향 이동을 위한 배열 (상, 하, 좌, 우, 대각선 4방향)
        int[] dr = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] dc = {0, 0, 1, -1, 1, -1, 1, -1};

        // BFS를 위한 큐 (ArrayDeque 사용)
        Queue<int[]> queue = new ArrayDeque<>();

        // 시작점이나 끝점이 1이라면, 경로가 존재하지 않으므로 -1 반환
        if (grid[0][0] == 1 || grid[rowLength-1][colLength-1] == 1){
            return -1;
        }

        // 큐에 시작점 (0, 0)과 거리 1을 추가
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true; // 시작점을 방문 처리

        // BFS 탐색
        while (!queue.isEmpty()){
            // 큐에서 현재 위치와 거리 꺼내기
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];

            // 현재 위치가 목표 지점인지 확인
            if (r == rowLength-1 && c == colLength-1) {
                return dist;
            }

            // 8방향으로 이동 탐색
            for (int i = 0; i < 8; i++){
                int nr = r + dr[i]; // 새로운 행 좌표
                int nc = c + dc[i]; // 새로운 열 좌표

                // 새로운 좌표가 범위 내에 있고, 이동할 수 있는 위치(값이 0)인지 확인
                if (0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && grid[nr][nc] == 0){
                    // 방문하지 않은 위치라면
                    if(!visited[nr][nc]){
                        // 큐에 새로운 위치와 거리 추가
                        queue.offer(new int[]{nr, nc, dist+1});
                        // 새로운 위치 방문 처리
                        visited[nr][nc] = true;
                    }
                }
            }
        }

        // 경로를 찾을 수 없는 경우 -1 반환
        return -1;
    }
}


// 수업 시간에 같이 한 코드

//import java.util.*;
//
//class Solution {
//    public int shortestPathBinaryMatrix(int[][] grid) {
//        // 초기값 세팅
//        int rowLength = grid.length;
//        int colLength = grid[0].length;
//        boolean[][] visited = new boolean[rowLength][colLength];
//        int[] dr = {1, -1, 0, 0, 1, 1, -1, -1};
//        int[] dc = {0, 0, 1, -1, 1, -1, 1, -1};
//        // bfs
//        // 시작점 큐에 넣기
//        Queue<int[]> queue = new ArrayDeque();
//
//        if (grid[0][0] == 1 || grid[rowLength-1][colLength-1] == 1){
//            return -1;
//        }
//        queue.offer(new int[]{0,0,1});
//        visited[0][0] = true;
//
//        while (!queue.isEmpty()){
//            // 방문( 큐에서 dequeue)
//            int[] cur = queue.poll();
//            int r = cur[0];
//            int c = cur[1];
//            int dist = cur[2];
//
//            // 도착했나? 체크 => return
//            if (r == rowLength-1 && c == colLength-1) {
//                return dist;
//            }
//
//            // 예약
//            for (int i = 0; i <8; i++){
//                int nr = r + dr[i];
//                int nc = c + dc[i];
//                if (0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && grid[nr][nc] == 0){
//                    if(!visited[nr][nc]){
//                        queue.offer(new int[]{nr, nc, dist+1});
//                        visited[nr][nc] = true;
//                    }
//                }
//            }
//        }
//        return -1;
//    }
//}
