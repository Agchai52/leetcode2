class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int sum = 0, carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;
            int bit2 = (j >= 0) ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0;
            
            sum = carry ^ bit1 ^ bit2;
            carry = (carry & bit1) | (carry & bit2) | (bit1 & bit2);
            
            res.append(String.valueOf(sum));
            i--;j--;
        }
        if (carry > 0) res.append(String.valueOf(carry));
        System.out.println(1^0^0);
        return res.reverse().toString();
    }
}
