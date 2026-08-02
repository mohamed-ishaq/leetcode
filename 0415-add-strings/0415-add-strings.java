import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger n = new BigInteger(num1);
       BigInteger n2 = new BigInteger(num2);
       BigInteger sum = n.add(n2);
       String val = sum+"";
       return val;
    }
}