class Horse{
	String name;
	double height;
	void run()
	{
		System.out.println(this.name+" Horse riding");
		System.out.println(this);
	}
	public static void main(String[] args){

	Horse h1 = new Horse();
	h1.name="Chetak";
	h1.height=9.5;
	h1.run();
	Horse h2 = new Horse();
	h2.name="Breego";
	h2.height=8.5;
	h2.run();
	}
}