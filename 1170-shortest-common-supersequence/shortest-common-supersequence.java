class Solution {
    public String shortestCommonSupersequence(String a, String b) {
		int n=a.length();
		StringBuilder sb = new StringBuilder();
		int m=b.length();
		int[][] t=new int[n+1][m+1];

		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					t[i][j]=t[i-1][j-1]+1;
				}else {
					t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
	
		int lcs=t[n][m];
		int max=n+m;
		int i=n;
		int j=m;
		while(i>0 && j>0) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				sb.append(a.charAt(i-1));
				i--;
				j--;
			}else {
				if(t[i-1][j]>t[i][j-1]) {
					sb.append(a.charAt(i-1));
					i--;
				}else {
					sb.append(b.charAt(j-1));
					j--;
				}
			}
		}
		while(i > 0) {
            sb.append(a.charAt(i - 1));
            i--;
        }

        while(j > 0) {
            sb.append(b.charAt(j - 1));
            j--;
        }
		return sb.reverse().toString();
	}
	
}
