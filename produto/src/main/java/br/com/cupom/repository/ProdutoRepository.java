package br.com.cupom.repository;

import br.com.cupom.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Optional<Produto> findBycEAN(Long cean);

    public boolean existsBycEAN(Long cean);

}
