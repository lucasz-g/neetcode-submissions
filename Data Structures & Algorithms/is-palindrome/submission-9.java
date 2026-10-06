class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[ ,!?'.:_]", ""); 
        s = s.toLowerCase(); 

        int i = 0; 
        int j = s.length() - 1; 

        String newStr = ""; 

        while (i <= j) {
            if(Character.isLetterOrDigit(s.charAt(j))){
                newStr+=s.charAt(j);
            }
            j--; 
        }

        System.out.println(newStr); 
        System.out.println(s); 
        return newStr.equals(s); 

    }
}
