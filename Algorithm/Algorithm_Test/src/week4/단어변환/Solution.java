package Algorithm_Test.src.week4.단어변환;

import java.util.*;

//BFS
class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<WordState> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        //✅ begin을 큐에 추가한다.
        queue.add(new WordState(0, begin));

        //✅ BFS 탐색을 통해 정답을 구한다.
        while (!queue.isEmpty()) {
            WordState cur = queue.remove();
            if (cur.word.equals(target)) return cur.cnt;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && getDiffCount(cur.word, words[i]) == 1){
                    visited[i] = true;
                    queue.add(new WordState(cur.cnt + 1, words[i]));
                }

            }
        }

        return 0;
    }

    int getDiffCount(String word, String target) {
        int diffCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) diffCount++;
        }

        return diffCount;
    }

    class WordState {
        int cnt;
        String word;

        WordState(int cnt, String word) {
            this.cnt = cnt;
            this.word = word;
        }
    }
}




// 완전탐색(backtracking, 재귀)

//import java.util.*;
//
//class Solution {
//    int answer = 50;
//    Set<String> visited = new HashSet<>();
//    public int solution(String begin, String target, String[] words) {
//        if (!Arrays.asList(words).contains(target)){
//            return 0;
//        }
//        dfs(words, begin, target, 0);
//        return answer;
//    }
//    public void dfs(String[] words, String cur, String target, int depth){
//        if (cur.equals(target)){
//            answer = Math.min(answer, depth);
//        }
//        for (String next : words){
//            if (move(cur, next) && !visited.contains(next)){
//                visited.add(next);
//                dfs(words, next, target, depth+1);
//                visited.remove(next);
//            }
//        }
//        return;
//    }
//    public boolean move(String s1, String s2){
//        int count = 0;
//        for (int i = 0; i<s1.length(); i++){
//            if (s1.charAt(i) != s2.charAt(i)){
//                count++;
//            }
//            if (count > 1){
//                return false;
//            }
//        }
//        return count == 1;
//    }
//}




