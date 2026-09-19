class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ch = new char[2];
        char[] ch2 = new char[2];
        int count = 0;

        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count < 2){
                    ch[count] = s1.charAt(i);
                    ch2[count] = s2.charAt(i);
                }
                count++;
            }
        }

        if(count == 2){
            if(ch[0] == ch2[1] && ch[1] == ch2[0]){
                return true;
            }else{
                return false;
            }
        }

        return count == 0;
    }
}