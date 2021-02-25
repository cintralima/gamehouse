package com.gamehouse.repository;

import com.gamehouse.models.Produto;
import com.gamehouse.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);
}
