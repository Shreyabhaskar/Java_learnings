//it is a recombination plus fusion pattern
class Rhombus {
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("_");
				}
				System.out.print("*");

			for(int j=1;j<=(2*i-1)-2;j++){

				if(i==1){
					continue;
				}
				System.out.print("_");
				}

				if(i!=1){
				System.out.print("*");
				}

			System.out.println();
}
		
		int n1=3;
		for(int i=1;i<=n1;i++){
			for(int j=1;j<=i;j++){
				System.out.print("_");
			}
			System.out.print("*");

		
		for(int j=1;j<=(n1-i)*2-1;j++){
			if(i==3){
				continue;
				}
			System.out.print("_");
			}

			if(i!=3){
				System.out.print("*");
			}


			System.out.println();
		}
		
	
}
}
		