package MVC_Project;

public class productController {
	   private Product model;
	   private productView view;
	   
	   public productController(Product model, productView view){
		      this.model = model;
		      this.view = view;
	   }
	   
	   public void setProductName(String name){
		      model.setName(name);		
	   }
	   public String getProductName(){
		      return model.getName();		
	   }
	   
	   public void setProductId(String id){
		      model.setId(id);		
	   }

		public String getProductId(){
		      return model.getId();		
        }

		public void updateView(){				
		      view.printProductDetails(model.getId(), model.getName());
		 }	
}
