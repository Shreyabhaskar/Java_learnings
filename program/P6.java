class P6{
public static void main(String [] args){
	int n=4;
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<2*n-1;j++){
				int top = i;
				int down = j;
				int left = (2*n-2)-j;
				int right = (2*n-2)-i;
				System.out.print(n-Math.min(Math.min(top, down), Math.min(left, right))+" ");
				}
			System.out.println();
}

}
}