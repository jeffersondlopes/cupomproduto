package br.com.cupom.service;

import br.com.cupom.exception.ProdutoCadastradoException;
import br.com.cupom.exception.ProdutoNaoEncontradoException;
import br.com.cupom.model.Produto;
import br.com.cupom.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    private boolean produtoCadastrado(Produto produto){
        return produtoRepository.existsBycEAN(produto.getCEAN());
    }

    public Produto novoProduto(Produto produto) {
        if (produtoCadastrado(produto)){
            throw new ProdutoCadastradoException(produto.getCEAN());
        }
        Produto save = produtoRepository.save(produto);
        return save;
    }

    public Produto buscaPorId(Long id) {
        return this.produtoRepository.findById(id)
                .orElseThrow( () -> new ProdutoNaoEncontradoException(id));
    }
}
