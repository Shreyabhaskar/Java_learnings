class Product
{
	String pname;
	double price;
	double qty;
	
	double buyProduct()
	{
		double total = price * qty;
		return total;	
	}
	
	double calcInstallment(double total, int nom)
	{
		double m = total/nom;
		return m;
	}
	}