package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
