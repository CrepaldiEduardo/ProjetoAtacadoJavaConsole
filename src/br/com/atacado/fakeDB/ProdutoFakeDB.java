package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Produto(0, 0, null, LocalDate.now()));
        this.tabela.add(new Produto(0, 0, null, LocalDate.now()));
        this.tabela.add(new Produto(0, 0, null, LocalDate.now()));
        this.tabela.add(new Produto(0, 0, null, LocalDate.now()));
        this.tabela.add(new Produto(0, 0, null, LocalDate.now()));
    }

}
