class Calculator
{
	String brand="Casio";
	double price=1200;
	int add(int a, int b){
		int sum = a+b;
		System.out.println("the total sum ="+sum);
		return sum;
		
	}
	int sub(int a, int b){
		int dif = a-b;
		System.out.println("the total dif ="+dif);
		return dif;
	}
	int mul(int a, int b){
		int multi = a*b;
		System.out.println("the total multi ="+multi);
		return multi;
	}
	int div(int a, int b){
		int divi = a/b;
		System.out.println("the total divi ="+divi);
		return divi;
	}

	
	public static void main(String[] args){
		Calculator c = new Calculator();
		c.add(20,50);
		c.sub(20,50);
		c.mul(20,50);
		c.div(10,5);

	}
}

