package repository;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.crud.ProductCrudRepository;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public Product save(Product p){
        return productCrudRepository.save(p);

    }

}
