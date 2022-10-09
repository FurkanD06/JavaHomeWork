package classWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.set_id(1);
		product.setName("Laptop");
		product.setDescription("16GB Ram");
		product.setPrice(15000);
		product.setStockAmount(10);
		product.setRenk("mavi");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add2(4, "Bilgisayar", null, 0, 0);
		
		System.out.println(product.getName());
	}

}
