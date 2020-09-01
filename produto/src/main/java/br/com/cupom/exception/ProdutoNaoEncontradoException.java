package br.com.cupom.exception;

public class ProdutoNaoEncontradoException extends RuntimeException {

    public static final String MSG = "Produto de código EAN %d não encontrado";

    public ProdutoNaoEncontradoException(Long ean){
        super(String.format(MSG,ean));
    }

}
