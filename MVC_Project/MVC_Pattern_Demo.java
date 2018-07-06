package MVC_Project;

public class MVC_Pattern_Demo {

	public static void main(String[] args) {
		
		 //fetch student record based on his roll no from the database
	      Product model  = retriveProductFromDatabase();

	      //Create a view : to write student details on console
	      productView view = new productView();

	      productController controller = new productController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setProductName("Razer Mamba");

	      controller.updateView();
	}

	
	 private static Product retriveProductFromDatabase(){
	      Product product = new Product();
	      product.setName("Razor Kraken 7.1");
	      product.setId("1");
	      return product;
	   }
}
