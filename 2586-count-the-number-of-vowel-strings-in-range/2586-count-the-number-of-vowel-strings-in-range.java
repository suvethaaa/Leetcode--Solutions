class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0 ;

        for(int i = left ; i <= right ; i++){
            String str = words[i].toLowerCase();

            if(vowel(str.charAt(0)) && vowel(str.charAt(str.length()-1))){
                count ++;
            }
        }

        return count;
    }

    static boolean vowel(char ch){
        
        return switch(ch){
            case 'a', 'e', 'i', 'o', 'u' -> true ;
            default -> false;
        };
    }
}