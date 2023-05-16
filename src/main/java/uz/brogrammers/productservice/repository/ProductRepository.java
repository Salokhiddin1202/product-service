package uz.brogrammers.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.brogrammers.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {

}
