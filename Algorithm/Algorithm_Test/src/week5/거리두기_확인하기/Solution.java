package Algorithm_Test.src.week5.거리두기_확인하기;

import java.util.*;

class Solution {

    private static final int SIZE = 5;

    public static int[] solution(String[][] places) {
        int[] result = new int[5];

        for (int i = 0; i < 5; i++) {
            result[i] = checkPlace(places[i]);
        }

        return result;
    }

    private static int checkPlace(String[] place) {
        char[][] room = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            room[i] = place[i].toCharArray();
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (room[i][j] == 'P') {
                    if (!isSafe(room, i, j)) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    private static boolean isSafe(char[][] room, int x, int y) {
        int[] dx = {-1, 1, 0, 0};  // 상하좌우
        int[] dy = {0, 0, -1, 1};

        // 거리 1 체크
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (isValid(nx, ny) && room[nx][ny] == 'P') {
                return false;
            }
        }

        // 거리 2 체크
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d] * 2;
            int ny = y + dy[d] * 2;
            if (isValid(nx, ny) && room[nx][ny] == 'P') {
                // 중간에 파티션이 없는지 확인
                if (room[x + dx[d]][y + dy[d]] != 'X') {
                    return false;
                }
            }
        }

        // 대각선 거리 2 체크
        int[] dx2 = {-1, -1, 1, 1};
        int[] dy2 = {-1, 1, -1, 1};
        for (int d = 0; d < 4; d++) {
            int nx = x + dx2[d];
            int ny = y + dy2[d];
            if (isValid(nx, ny) && room[nx][ny] == 'P') {
                // 대각선 방향이 아닌 중간에 빈 테이블이 있어야 함
                if (room[x][ny] != 'X' && room[nx][y] != 'X') {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE;
    }

    public static void main(String[] args) {
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };

        int[] result = solution(places);
        System.out.println(Arrays.toString(result));
    }
}

