class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].length() - dic[i].replace(spell[j], "").length() == 1) {
                    cnt++;
                } else break;
            }
            if (cnt == spell.length) {
                answer = 1;
                break;
            }   
        }
        return answer;
    }
}