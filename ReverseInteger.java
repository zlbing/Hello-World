public class Solution {
    public int reverse(int x) {
    	int flag;
    	if(x<0)flag=-1;
    	else flag=1;
    	x=Math.abs(x);
    	long result=0;
    	int max=Integer.MAX_VALUE;
    	while(x>0){
    		result=result*10+x%10;
    		x=x/10;
    		if(result>max)return 0;
    	}
        return (int)result*flag;
    }
}
