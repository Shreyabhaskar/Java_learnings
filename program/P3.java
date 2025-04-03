class P3 {
	public static void main(String[] args){
	int n=3;
	for(int i=0;i<=n;i++){
		for(int j=0;j<=i;j++){
			System.out.print("*");
		}
		for(int j=0;j<2*n+1-2*i;j++){
			System.out.print(" ");
			}
		for(int j=0;j<=i;j++){
			System.out.print("*");
		}

		System.out.println();
}
	int n1=0;
	for(int i=0;i<9;i++){
	System.out.print("*");
	}
	System.out.println();

	int n2=3;
	for(int i=0;i<=n;i++){
		for(int j=0;j<n-i+1;j++){
			System.out.print("*");
			}
		for(int j=0;j<(2*i)+1;j++){
			System.out.print(" ");
			}
		for(int j=0;j<n-i+1;j++){
			System.out.print("*");
			}

		System.out.println();
}
	
}
}
