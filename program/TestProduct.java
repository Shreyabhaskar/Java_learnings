class TestProduct
{
	public static void main(String[] args){
		Product p = new Product();
		p.pname="shoe";
		p.price=25000;
		p.qty=3;
		double t = p.buyProduct();
		System.out.println("total amount="+ t);
		double amt = p.calcInstallment(t, 6);
		System.out.println("amount to be paid per month"+ amt);
		}
	}