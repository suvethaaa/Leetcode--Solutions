class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> hashSet = new HashSet<>();

        for(char c : allowed.toCharArray()){
            hashSet.add(c);
        };
        
        int count = 0 ;
        for(String word : words){
            boolean check = true;
            for(int i = 0 ; i < word.length() ; i++){
                if(!hashSet.contains(word.charAt(i))){
                    check = false;
                    break;
                }

            }
            if(check){
                count++;
            }
        }
        return count;
    }
}