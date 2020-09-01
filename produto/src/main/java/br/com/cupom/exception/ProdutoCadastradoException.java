package br.com.cupom.exception;

public class ProdutoCadastradoException extends RuntimeException {

    public static final String MSG = "Produto de código EAN %d já está cadastrado";

    public ProdutoCadastradoException(Long ean){
        super(String.format(MSG,ean));
    }

}
