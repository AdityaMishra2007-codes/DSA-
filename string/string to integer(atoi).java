import java.util.HashMap;

class Solution { 
    public int myAtoi(String s) { 
        HashMap<Character,Integer> map1=new HashMap<>(); 
        map1.put('0',0); map1.put('1',1); map1.put('2',2); map1.put('3',3); map1.put('4',4); 
        map1.put('5',5); map1.put('6',6); map1.put('7',7); map1.put('8',8); map1.put('9',9); 
        
        char ch; 
        long ans=0; 
        int w=1; 
        
        
        int i = 0;
        // Skip spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        
        if (i < s.length()) {
            ch = s.charAt(i);
            if (ch == '+') { 
                w = 1; 
                i++;
            } else if (ch == '-') { 
                w = -1; 
                i++;
            } 
        }
        for (; i < s.length(); i++) { 
            ch = s.charAt(i); 
            if (map1.containsKey(ch)) { 
                ans = ans * 10 + (map1.get(ch)); 
                
                // Handle overflow clamping immediately
                if (ans * w > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (ans * w < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else {
                
                break;
            } 
        } 
        
        return (int) (ans * w); 
    } 
}