package com.zoudys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;

import com.zoudys.entities.Category;
import com.zoudys.entities.Product;

@SpringBootApplication
public class SbootProdcatWithrestApplication /*implements CommandLineRunner*/ {
	
	@Autowired
	MongoOperations mongoOperations;

	public static void main(String[] args) {
		SpringApplication.run(SbootProdcatWithrestApplication.class, args);
	}

	/*@Override
	public void run(String... arg0) throws Exception {


		Product produit1 = new Product("ACER 154-YT", new Date(), 700);
		Product produit2 = new Product("COMPAC 154-YT", new Date(), 500);
		Product produit3 = new Product("HP-ZER", new Date(), 450);
	//	Product produit4 = new Product("Canon", new Date(), 250);
		
		List<Product> produitsCat1 = new ArrayList<Product>(); produitsCat1.add(produit1); produitsCat1.add(produit2); produitsCat1.add(produit3);
		//List<Product> produitsCat2 = new ArrayList<>(); produitsCat2.add(produit4);
		
		Category categorie1 = new Category("Ordinateur","description des ordinateurs", produitsCat1);
	//	Category categorie2 = new Category("Appareil photo","description des appareils photo", produitsCat2 );
				
		mongoOperations.save(produit1); mongoOperations.save(produit2); mongoOperations.save(produit3);
		
		mongoOperations.save(categorie1); 
		//mongoOperations.save(categorie2);

		System.out.println("Saving Done ... ! ");
		
	}*/
	
	// build mongo query
			/*
			 * Query query = new Query(Criteria.where("name").is("document_1"));
			 * 
			 * // search operation SimpleDocument object = (SimpleDocument)
			 * mongoOperations.findOne(query, SimpleDocument.class);
			 * System.out.println("object :"+object.toString());
			 * 
			 * //update operation WriteResult updateFirst =
			 * mongoOperations.updateFirst(query, Update.update("description",
			 * "update description"), SimpleDocument.class);
			 * System.out.println("document updated " + updateFirst);
			 * 
			 * // find all simple document in DB List<SimpleDocument> objList =
			 * mongoOperations.findAll(SimpleDocument.class); for (SimpleDocument sd
			 * : objList) { System.out.println("objLst : "+sd); }
			 * 
			 * // delete a simple document in Db WriteResult remove =
			 * mongoOperations.remove(query, SimpleDocument.class);
			 * System.out.println("Object removed : "+remove);
			 */
		
}
