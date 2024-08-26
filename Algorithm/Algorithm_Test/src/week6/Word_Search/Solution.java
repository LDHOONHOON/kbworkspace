package Algorithm_Test.src.week6.Word_Search;

public  class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length,
                n = board[0].length;
        //✅ board를 순회하며, 현재 위치(i, j)의 글자가 word의 0번째 글자와 같은지 검사한다.
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] != word.charAt(0)) continue;
                //✅ 현재 위치의 글자를 buffer에 저장하고, '.'으로 교체한다.
                char buffer = board[r][c];
                board[r][c] = '.';
                //✅ 재귀함수를 호출한다.
                //✅ 재귀함수의 반환값이 true라면, true를 반환한다.
                if (backtrack(board, r, c, word, 0)) return true;
                //✅ 아니라면, 현재 위치의 글자를 buffer로 대체한다.
                board[r][c] = buffer;
            }
        }
        return false;
    }

    int[] dr = { 1, 0, -1, 0 };
    int[] dc = { 0, 1, 0, -1 };

    boolean backtrack(char[][] board, int r, int c, String word, int count) {
        //✅ count + 1이 word 길이와 동일하다면, true를 반환한다. (base case)
        if (count + 1 == word.length()) return true;

        int m = board.length,
                n = board[0].length;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i],
                    nc = c + dc[i];
            if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                //✅ 다음 위치의 글자가 word의 count + 1번째 문자와 같다면,
                if (board[nr][nc] == word.charAt(count+1)) {
                    //✅ 다음 위치의 글자를 buffer에 저장하고, '.'으로 교체한다.
                    char buffer = board[nr][nc];
                    board[nr][nc] = '.';
                    //✅ 재귀함수를 호출한다.
                    //✅ 재귀함수의 반환값이 true라면, true를 반환한다.
                    if (backtrack(board, nr, nc, word, count+1)) return true;
                    //✅ 아니라면, 현재 위치의 글자를 buffer로 대체한다.
                    board[nr][nc] = buffer;
                }
            }
        }
        return false;
    }
}

// 강사님이 푼 코드

//import java.util.*;
//class Solution {
//    int m;
//    int n;
//    int[] dr = {1, -1, 0, 0};
//    int[] dc = {0, 0, 1, -1};
//    boolean[][] visited;
//    public boolean exist(char[][] board, String word) {
//        m = board.length;
//        n = board[0].length;
//        visited = new boolean[m][n];
//        for (int r = 0; r < m; r++){
//            for (int c = 0; c < n; c++){
//                if (board[r][c] == word.charAt(0)){
//                    visited[r][c] = true;
//                    if (backtrack(r,c, 1, board, word)) return true;
//                    visited[r][c] = false;
//                }
//
//            }
//        }
//        return false;
//
//    }
//
//    // 주어진 word랑 일치하면 True 반환
//    boolean backtrack(int r, int c, int count, char[][] board, String word) {
//        if (count >= word.length()) return true;
//        // 상하좌우가 주어진 word랑 일치하는지 판별
//        for (int i = 0 ; i < 4; i ++){
//            int nr = r + dr[i];
//            int nc = c + dc[i];
//
//            if (nr >= 0 && nr < m && nc >=0 && nc < n){
//                if (board[nr][nc] == word.charAt(count)){
//                    if (visited[nr][nc]) continue;
//                    visited[nr][nc] = true;
//                    if (backtrack(nr,nc, count+1, board, word)) return true;
//                    visited[nr][nc] = false;
//                }
//            }
//        }
//        return false;
//
//    }
//}