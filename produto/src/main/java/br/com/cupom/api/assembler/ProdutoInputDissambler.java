package br.com.cupom.api.assembler;

import br.com.cupom.api.model.ProdutoModel;
import br.com.cupom.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoInputDissambler {

    @Autowired
    private ModelMapper modelMapper;

    public Produto toDomainObject(ProdutoModel produtoModel){
        return this.modelMapper.map(produtoModel, Produto.class);
    }

    public ProdutoModel toModelObject(Produto produto){
        return this.modelMapper.map(produto, ProdutoModel.class);
    }


}
