package com.skylink.skylinkapi.repository;

import com.skylink.skylinkapi.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Page<Produto> findByCategoriaId(Long categoriaId, Pageable pageable);
}
