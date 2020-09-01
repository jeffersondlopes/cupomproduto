package br.com.cupom.api.controller;

import br.com.cupom.api.assembler.ProdutoInputDissambler;
import br.com.cupom.api.model.ProdutoModel;
import br.com.cupom.model.Produto;
import br.com.cupom.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoInputDissambler produtoInputDissambler;

    @GetMapping("/{id}")
    public ProdutoModel busca(@PathVariable("id") Long cEan){
        ProdutoModel produtoModel = produtoInputDissambler.toModelObject(produtoService.buscaPorId(cEan));
        return produtoModel;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto novo(@RequestBody @Valid ProdutoModel produtoModel){
        return produtoService.novoProduto(produtoInputDissambler.toDomainObject(produtoModel));
    }

}
