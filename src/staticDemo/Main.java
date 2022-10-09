package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Masa";
		product.price = 100;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		DataabaseHelper.Crud.delete();

	}

}
