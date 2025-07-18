package br.com.thiagoamaral.catalog_service.model.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.thiagoamaral.catalog_service.util.exception.ProductException;
import jakarta.transaction.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public Product save(Product product) {

        if (product.getPrice() == null || product.getPrice() <= 0) {
            throw new ProductException(ProductException.MSG_PRICE_INVALID);
        }

        return productRepository.save(product);
    }

    @Transactional
    public void update(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id).get();
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        product.setDescription(updatedProduct.getDescription());
        productRepository.save(product);
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductException("Produto não encontrado"));
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Transactional
    public void delete(Long id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

}
