class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false; 
        }

        List<Character> letrasS = new ArrayList<>(); 
        List<Character> letrasT = new ArrayList<>(); 
        
        for(int i = 0; i < s.length(); i++){
            letrasS.add(s.charAt(i));
            letrasT.add(t.charAt(i));
        }

        Collections.sort(letrasS); 
        Collections.sort(letrasT); 

        for(int j = 0; j < letrasS.size(); j++){
            if(letrasS.get(j) != letrasT.get(j)){
                return false;
            }
        }

        return true; 
    }
}
