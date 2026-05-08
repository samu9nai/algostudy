class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        String answer = "fail";
        
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id) && db[i][1].equals(pw)) {
                answer = "login";
            } else if (db[i][0].equals(id) && ! db[i][1].equals(pw)) {
                answer = "wrong pw";
            }
        }  
        return answer;
    }
}