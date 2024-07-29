package Algorithm_Test.src.week5.Number_of_Islands;

import java.util.Arrays;

class Solution {
    // 방문한 셀을 추적하기 위한 2차원 boolean 배열
    static boolean visited[][];

    // 주어진 좌표 (r, c)가 그리드의 유효 범위 내에 있는지 확인하는 메서드
    boolean isInRange(int r, int c, int rowLength, int colLength) {
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength);
    }

    // 주어진 그리드에서 섬의 개수를 반환하는 메서드
    public int numIslands(char[][] grid) {
        //✅ 초기값 설정
        int numberOfIslands = 0; // 섬의 개수를 세는 변수
        int rowLength = grid.length; // 그리드의 행 길이
        int colLength = grid[0].length; // 그리드의 열 길이
        visited = new boolean[rowLength][colLength]; // 방문 배열 초기화

        //✅ Grid를 순회하며
        for (int i = 0; i < rowLength; i++) { // 각 행을 순회
            for (int j = 0; j < colLength; j++) { // 각 열을 순회
                //✅ Grid의 값이 '1'이고 아직 방문하지 않았다면
                if (grid[i][j] == '1' && !visited[i][j]) {
                    //✅ dfs를 통하여 연결된 모든 '1'들에 대해 방문 표시
                    dfs(i, j, grid);
                    //✅ 섬의 개수 1 증가
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands; // 총 섬의 개수를 반환
    }

    // DFS를 사용하여 연결된 모든 '1'들을 방문 처리하는 메서드
    public void dfs(int r, int c, char[][] grid) {
        int rowLength = grid.length; // 그리드의 행 길이
        int colLength = grid[0].length; // 그리드의 열 길이
        // 상하좌우 네 방향을 나타내는 배열
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        visited[r][c] = true; // 현재 셀을 방문 처리

        // 네 방향으로 이동하며 탐색
        for (int[] d : dir) {
            int nextRow = r + d[0]; // 이동할 다음 행
            int nextCol = c + d[1]; // 이동할 다음 열
            // 이동할 좌표가 유효한 범위 내에 있는지 확인
            if (isInRange(nextRow, nextCol, rowLength, colLength)) {
                // 이동할 좌표가 '1'이고 아직 방문하지 않았다면
                if (grid[nextRow][nextCol] == '1' && !visited[nextRow][nextCol]) {
                    // 재귀적으로 DFS를 호출하여 연결된 모든 '1'들 방문 처리
                    dfs(nextRow, nextCol, grid);
                }
            }
        }
    }
}


// 수업 시간에 한 코드

//class Solution {
//    int[] dr = {1, -1, 0, 0};
//    int[] dc = {0, 0, 1, -1};
//    int rowLength;
//    int colLength;
//    public int numIslands(char[][] grid) {
//        rowLength = grid.length;
//        colLength = grid[0].length;
//        int count = 0;
//        boolean[][] visited = new boolean[rowLength][colLength];
//
//        for (int r = 0; r < rowLength; r++){
//            for (int c = 0; c < colLength; c++){
//                if (grid[r][c] == '1' && !visited[r][c]){
//                    dfs(r,c, grid, visited);
//                    count += 1;
//                }
//            }
//        }
//        return count;
//    }
//    void bfs(int r,int c){
//
//    }
//    void dfs(int r,int c, char[][] grid, boolean[][] visited){
//        visited[r][c] = true;
//
//        for (int i = 0 ; i < 4; i++){
//            int nr = r + dr[i];
//            int nc = c + dc[i];
//            if (0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && grid[nr][nc] == '1'){
//                if (!visited[nr][nc]){
//                    dfs(nr,nc, grid, visited);
//                }
//            }
//        }
//    }
//}