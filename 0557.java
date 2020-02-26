class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word: words) {
            res.append(reverseStr(word) + " ");
        }
        return res.toString().trim();
        
    }
    
    public String reverseStr(String w) {
        StringBuilder returnS = new StringBuilder(w);
        returnS.reverse();
        return returnS.toString();
    }
}
