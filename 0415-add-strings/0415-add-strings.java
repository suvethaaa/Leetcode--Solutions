class Solution {
    public String addStrings(String num1, String num2) {
        
        int i = num1.length() -1 ;
        int j = num2.length() -1 ;
        int carry = 0;

        StringBuilder results = new StringBuilder();

        while( i >= 0 || j >= 0 || carry != 0){

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry ;

            results.append((char)(sum % 10 + '0'));

            carry = sum/10;

            i--;
            j--;
            
        }

        String ans = "";

        for(int k = results.length() -1 ; k >= 0 ; k--){
            ans+=results.charAt(k);
        }

        return ans;
    }
}   