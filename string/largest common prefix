class Solution {
    public String longestCommonPrefix(String[] strs) {
            String [] arr = strs;  
        if(strs.length==0) return "";
        if (strs.length==1) return strs[0];
        String a=arr[0];
        String w="";
        
        
        for(int i = 0;i<arr.length-1;i++){
          
           w="";
            
            for(int j=0;j<a.length()&&j<arr[i+1].length();j++){
         
                if(a.charAt(j)==arr[i+1].charAt(j)){
                    w = w + a.charAt(j);
                }
                else{
                   
                break;
                }
            }
            a=w;
            
        }
        
                System.out.println(w);
        return w;
	}
}

        
 //q14 on leetcode-largest common prefix . used brute force approach alonside required string methods.