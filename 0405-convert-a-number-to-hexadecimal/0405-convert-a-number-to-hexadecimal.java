class Solution {
    public String toHex(int num) {
          if(num == 0) {
            return "0";
        }
        char[] hex = "0123456789abcdef".toCharArray();
        String result = "";
        while(num!=0){
            int remainder = num & 15;
            result = hex[remainder] +result;
            num = num>>>4;
        }
        return result;
    }
}