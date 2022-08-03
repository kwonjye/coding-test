package LEVEL3.베스트앨범;

import java.util.*;

public class Solution {
    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            // 기존에 장르가 있다면 plays 값을 가져오고 없다면 0을 가져온 후 plays 값 더해줌
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 1. 장르 설정
        ArrayList<String> genrePick = new ArrayList<>();
        while(map.size() != 0) {
            int max = -1;
            String maxKey = "";
            // map에 있는 장르들의 재생 횟수 값을 비교해서 큰 값을 변수에 넣어줌
            for(String key : map.keySet()) { 
                int tmpCnt = map.get(key);
                if(tmpCnt > max) {
                    max = tmpCnt;
                    maxKey = key;
                }
            }
            // 리스트에 값이 큰 순서대로 넣어주고 map에서 지워줌
            genrePick.add(maxKey);
            map.remove(maxKey);
        }
        
        // 2. 장르 내 노래 선정
        ArrayList<Music> result = new ArrayList<>();
        for(String genre : genrePick) {
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++) {
                // 장르가 같을 경우 list에 Music 객체(장르, 재생된 횟수, 인덱스)를 넣어줌
                if(genres[i].equals(genre)) list.add(new Music(genre, plays[i], i));
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // play 기준 내림차순 정렬
            result.add(list.get(0)); // 1개는 무조건 수록
            if(list.size() != 1) { // 더 수록할 곡이 있다면 수록(같은 장르)
                result.add(list.get(1));
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).idx;
        }
        
        return answer;
    }
}
