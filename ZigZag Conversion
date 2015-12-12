public class Solution {
    public String convert(String s, int numRows) {
    	String result="";
    	if(numRows==1)return s;
    	String[] res=new String[numRows];
    	 Arrays.fill(res, "");//需要填充""否则会输出null值
    	int i=0,j=0,gap=numRows-2;
    	while(i<s.length()){
    		for(j=0;j<numRows&&i<s.length();j++)res[j]+=s.charAt(i++);
    		for(j=gap;j>0&&i<s.length();j--)res[j]+=s.charAt(i++);
    	}
    	for(i=0;i<numRows;i++)result+=res[i];
        return result;
    }
}
