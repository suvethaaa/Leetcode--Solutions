class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int f = 0;
        for(int i = 0 ; i < s.length()/2; i++){
            if(check(s.charAt(i))){
                f++;
            }
        }
        int se = 0;
        for(int i = s.length()/2 ; i < s.length() ; i++){
            if(check(s.charAt(i))){
                se++;
            }
        }
        return f==se;
    }

    static boolean check(char ch){
        return switch(ch){case 'a' , 'e','i','o','u' -> true ; default -> false;};
    }
}