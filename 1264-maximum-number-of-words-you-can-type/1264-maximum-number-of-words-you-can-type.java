class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int count = 0;
        int start = 0;

        for(int i = 0 ; i < text.length() ; i++){
            if(text.charAt(i) == ' ' || i == text.length()-1){
                String temp = text.substring(start,i+1);
                start = i + 1;
                if(check(temp , brokenLetters)){
                    count++;
                }
            }
        }
        return count;
    }

    static boolean check(String temp , String brokenLetters){

        for(int i = 0 ; i < brokenLetters.length() ; i++){
            if(temp.indexOf(brokenLetters.charAt(i)) != -1){
               return false;
            }
        }

        return true;
    }
}